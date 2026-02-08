# Authorization Playground with OpenFGA

This project is a playground for experimenting with Fine-Grained Authorization (FGA) using [OpenFGA](https://openfga.dev/).

## 📂 Project Structure

The project is divided into frontend and backend, each running in its own Docker environment.

### 1. Backend (`fga-back`)
- **Path**: `fga-back/auth-back`
- **Stack**: Spring Boot, PostgreSQL
- **Infrastructure**:
    - **PostgreSQL (App)**: `localhost:5432` (Application Data)
    - **PostgreSQL (OpenFGA)**: `localhost:5433` (OpenFGA Data)
    - **OpenFGA Server**: `localhost:8080` (API), `localhost:3000` (Playground)

### 2. Frontend (`fga-front`)
- **Path**: `fga-front/my-app`
- **Stack**: React (Vite)
- **Infrastructure**:
    - **React App**: `localhost:5173` (Hot Reload enabled via Docker Volume)

## 🚀 How to Run

### Backend & OpenFGA
```bash
cd fga-back/auth-back
docker compose up -d
```

### Frontend
```bash
cd fga-front
docker compose up -d
```
The frontend source code is synced with the container, so changes in `fga-front/my-app` are reflected immediately.
