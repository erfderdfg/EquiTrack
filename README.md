# EquiTrack

A REST API backend for tracking stock and multi-asset investment portfolios. EquiTrack lets users manage multiple portfolios, log buy/sell transactions across asset classes, monitor open positions with real-time P&L tracking, set price alerts, and maintain watchlists — all backed by role-based access control and revocable JWT sessions.

---

## Tech Stack

| Layer | Technology |
|---|---|
| Language | Java 17 |
| Framework | Spring Boot 4.0.5 |
| Security | Spring Security |
| Persistence | Spring Data JPA + Hibernate |
| Database | PostgreSQL |
| Validation | Jakarta Bean Validation |
| Boilerplate reduction | Lombok |
| Build | Maven |

---

## Highlights & Challenges

### Multi-Asset Domain Model
Rather than a simple "stocks only" tracker, EquiTrack models six asset classes through the `InstrumentType` enum: `STOCK`, `CRYPTO`, `ETF`, `FOREX`, `COMMODITY`, `BOND`, and `INDEX`. Each instrument carries a `Currency` and an `Exchange`, which required normalizing the reference data into their own tables and adding admin-only management endpoints.

### Price Alerts with Four Condition Types
The `Alert` entity supports four condition types via `ConditionType`: `ABOVE`, `BELOW`, `PERCENT_UP`, and `PERCENT_DOWN`. This covers both absolute and relative triggers, which means the service layer will need to branch alert evaluation logic depending on whether the threshold is a raw price or a percentage of the last-seen price.

### Revocable JWT Refresh Tokens
Rather than relying on short-lived access tokens alone, the domain model includes a `RefreshToken` entity persisted to the database. This enables server-side revocation of sessions — something stateless JWTs alone cannot provide — at the cost of a database lookup on each token refresh.

### Position Tracking with Realized P&L
`Position` tracks `qty`, `avgCost`, and `realizedPnl` — the building blocks for both unrealized P&L (computed at query time from live price data) and realized P&L (updated on every SELL transaction). Keeping average cost accurate across partial sells is a non-trivial bookkeeping problem that the service layer will handle.

---

## Getting Started

### Prerequisites

- Java 17+
- PostgreSQL 14+
- Maven 3.9+

### 1. Clone the repository

```bash
git clone https://github.com/erfderdfg/EquiTrack.git
cd EquiTrack
```

### 2. Create the database

```sql
CREATE DATABASE stocktracker;
```

### 3. Configure application properties

Copy the example config and fill in your credentials:

```bash
cp src/main/resources/application.properties.example src/main/resources/application.properties
```

Edit `application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/stocktracker
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.datasource.driver-class-name=org.postgresql.Driver
spring.jpa.hibernate.ddl-auto=validate
spring.jpa.show-sql=true
```

> **Note:** `ddl-auto=validate` assumes the schema already exists. Use `create` on first run or apply migrations manually.

### 4. Run the application

```bash
./mvnw spring-boot:run
```

The server starts on `http://localhost:8080` by default.

---

## Project Structure

```
src/main/java/com/equitrack/backend/
├── models/           # JPA entities and enums
│   └── enums/        # InstrumentType, ConditionType, TransactionSide, TransactionStatus, RoleType
├── repositories/     # Spring Data JPA repository interfaces
└── dto/
    ├── request/      # Validated inbound payloads
    └── response/     # Outbound response shapes
```

---

## Roadmap

- [ ] Service layer (business logic, P&L calculations, alert evaluation)
- [ ] REST controllers
- [ ] JWT authentication (access + refresh token flow)
- [ ] Price ingestion integration
- [ ] Alert scheduler / event-driven notification
