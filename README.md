# 🖥️ UniShare Backend

**UniShare Backend** – Backend service for the UniShare platform that enables university students to share rides, manage profiles, and interact with the platform securely. The system exposes REST APIs for authentication, ride management, and user operations.

Built using **Java and Spring Boot** with **PostgreSQL** as the database.

---

# 🚀 Features

### Authentication System

* Google OAuth login
* GitHub OAuth login
* Native UniShare email/password authentication
* JWT-based authentication and session management

### User Management

* User registration and login
* Profile updates
* Role-based user management

### Ride Sharing System

* Create rides
* Request to join rides
* Manage passengers
* Ride status management

### Media Upload

* Profile image uploads using Cloudinary

### System Monitoring

* Health check endpoint for monitoring service availability

---

# 🛠️ Tech Stack

### Backend

* Java 21
* Spring Boot
* Spring Security
* Spring Data JPA

### Database

* PostgreSQL
* Hosted on Supabase

### Authentication

* JWT Authentication
* Google OAuth
* GitHub OAuth

### Media Storage

* Cloudinary

### Build Tool

* Maven

---

# 📦 Getting Started

## 1. Clone the Repository

```bash
git clone https://github.com/PravinChoudhary11/unishareBackend.git
cd unishareBackend
```

---

## 2. Configure Environment

Copy the example configuration file:

```bash
cp src/main/resources/application-example.yaml src/main/resources/application.yaml
```

Update the following values in `application.yaml`:

* Database connection details
* Google OAuth credentials
* GitHub OAuth credentials
* JWT secret
* Cloudinary credentials

---

## 3. Run the Application

Using Maven wrapper:

### Linux / Mac

```bash
./mvnw spring-boot:run
```

### Windows

```bash
mvnw.cmd spring-boot:run
```

Server will start at:

```
http://localhost:8080
```

---

# 📂 Project Structure

```
src/main/java/com/unishare
│
├── config          → Application configuration
├── controller      → REST API controllers
├── service         → Business logic layer
├── repository      → Data access layer
├── entity          → JPA entities
├── dto             → Request and response DTOs
├── security        → JWT and security configuration
└── enums           → Application enums
```

---

# 📄 API Documentation

API documentation is available inside:

```
src/main/docs
```

Includes:

* API endpoints documentation
* Database schema
* Ride-related APIs

---

# 🔒 Security Notes

Sensitive credentials such as:

* OAuth client secrets
* JWT secret
* Database passwords
* Cloudinary API keys

are **not stored in the repository**.

Developers must configure them locally using:

```
src/main/resources/application.yaml
```

---

# 📌 Future Improvements

* Ride matching algorithm
* Real-time ride updates and notifications
* Mobile application integration
* Advanced ride search and filtering
* Location-based ride discovery

---

# 👨‍💻 Author

**Pravin Choudhary**

Backend Developer | Java | Spring Boot | System Design
