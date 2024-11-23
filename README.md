# EAD Course Management System

This project is a comprehensive microservices-based system for managing courses, users, and enrollments in an EAD (Education at Distance) platform. The system is built using Spring Boot, Spring Cloud, and various modern tools and frameworks for scalability, fault tolerance, and efficient management.

## Architecture Overview

The system follows a microservices architecture and includes the following components:

- **User Service**: Manages user registration, authentication, and profiles.
- **Course Service**: Handles course creation, updates, and management.
- **Enrollment Service**: Manages student enrollments in courses.
- **API Gateway**: A single entry point for all client requests, routing them to the appropriate microservices.
- **Config Server**: A centralized configuration service for managing the configuration of all microservices.
- **Discovery Server**: Handles the registration and discovery of microservices.

## Technologies Used

- **Spring Boot** for building the microservices.
- **Spring Cloud** for distributed systems management (Config Server, Eureka).
- **Spring Cloud Gateway** for routing and API management.
- **Maven** for project management and dependency management.
- **Docker** for containerization (optional for deployment).
- **Git** for version control.

## Getting Started

To run the **EAD Course Management System** locally, follow these steps:

### 1. Clone the repository
```bash
git clone https://github.com/yourusername/ead-course-management-system.git
cd ead-course-management-system
```

### 2. Start the Discovery Server
```bash
cd discovery-server
mvn spring-boot:run
```

### 3. Start the Config Server
```bash
cd config-server
mvn spring-boot:run
```

### 4. Start the User Service
```bash
cd user-service
mvn spring-boot:run
```

### 5. Start the Course Service
```bash
cd course-service
mvn spring-boot:run
```

### 6. Start the Enrollment Service
```bash
cd enrollment-service
mvn spring-boot:run
```

### 7. Start the API Gateway
```bash
cd api-gateway
mvn spring-boot:run
```

The system should now be up and running locally. You can access the services using the following URLs:

- **Discovery Server**: http://localhost:8761
- **Config Server**: http://localhost:8888
- **User Service**: http://localhost:8081
- **Course Service**: http://localhost:8082
- **Enrollment Service**: http://localhost:8083
- **API Gateway**: http://localhost:8080

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
```