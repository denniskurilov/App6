# App6
## Spring Boot REST API (Entity + DAO + Service + RestController)

###  Overview
**App6** is a Spring Boot application that provides a REST API for managing data in the `EMPLOYEE` table stored in an **Oracle Autonomous Database**.  
It follows a multi-layered architecture using a custom **DAO layer** implemented with **EntityManager** for data access.

---

### Technology Stack
- Java 17
- Spring Boot
- Maven
- Oracle Autonomous Database (OCI)
- Spring Web
- JPA / EntityManager (custom DAO implementation)

---

### Architecture
The project follows a clear layered structure:  
Controller -> Service -> DAO -> Database

---

### Main Components
- **Entity** — represents the `Employee` data model
- **DAO** — handles database operations using `EntityManager`
- **Service** — contains business logic
- **RestController** — exposes REST endpoints for CRUD operations

---

### REST API Endpoints

| Method | Endpoint | Description                  |
|--------|-----------|------------------------------|
| `GET` | `/employees` | Retrieve all employees       |
| `POST` | `/employees` | Create a new employee        |
| `GET` | `/employees/{id}` | Retrieve an employee by ID   |
| `PUT` | `/employees/{id}` | Update an existing employee  |
| `PATCH` | `/employees/{id}`     | Partially update an employee |
| `DELETE` | `/employees/{id}` | Delete an employee           |
