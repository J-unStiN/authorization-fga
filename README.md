# OpenFGA Authorization Playground (현재 개발중)

이 프로젝트는 [OpenFGA](https://openfga.dev/)를 사용한 세밀한 권한 제어(Fine-Grained Authorization)를 실험하기 위한 플레이그라운드입니다.

## 📂 프로젝트 구조

프로젝트는 프론트엔드와 백엔드로 나뉘며, 각각 독립된 Docker 환경에서 실행됩니다.

### 1. 백엔드 (`fga-back`)
- **경로**: `fga-back/auth-back`
- **기술 스택**: Spring Boot, PostgreSQL
- **인프라**:
    - **PostgreSQL (앱용)**: `localhost:5432` (애플리케이션 데이터)
    - **PostgreSQL (OpenFGA용)**: `localhost:5433` (OpenFGA 데이터)
    - **OpenFGA 서버**: `localhost:8080` (API), `localhost:3000` (Playground)

### 2. 프론트엔드 (`fga-front`)
- **경로**: `fga-front/my-app`
- **기술 스택**: React (Vite)
- **인프라**:
    - **React 앱**: `localhost:5173` (Docker Volume을 통한 Hot Reload 지원)

## 🚀 실행 방법

### 백엔드 & OpenFGA 실행
```bash
cd fga-back/auth-back
docker compose up -d
```

### 프론트엔드 실행
```bash
cd fga-front
docker compose up -d
```
프론트엔드 소스 코드는 컨테이너와 동기화되어 있어, `fga-front/my-app` 내의 코드를 수정하면 즉시 반영됩니다.
