# API Gateway

The **API Gateway** acts as the single entry point for all client requests in the EAD Course Management System. It routes requests to the appropriate microservices and manages cross-cutting concerns such as authentication, authorization, and rate limiting.

## Features

- Centralized API routing to all microservices.
- Authentication and authorization (via OAuth2/JWT).
- Rate limiting and request throttling.
- Service resilience with circuit breakers (Hystrix/Resilience4J).

## Running the Application

To run the API Gateway locally, follow these steps:

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/ead-course-management-system.git
   cd api-gateway
   ```
   
2. Run the service with Maven:

    ```bash
    mvn spring-boot:run
    ```
   
3. The service will be accessible at `http://localhost:8080`.

## Configuration

The API Gateway can be configured using the `application.yml` file. You can define routes, filters, and other properties in this file to customize the behavior of the gateway.

spring:
cloud:
gateway:
routes:
- id: user-service
uri: lb://USER-SERVICE
predicates:
- Path=/api/users/**
- id: course-service
uri: lb://COURSE-SERVICE
predicates:
- Path=/api/courses/**
eureka:
client:
serviceUrl:
defaultZone: http://localhost:8761/eureka/

## API Endpoints

The gateway automatically routes requests to corresponding microservices:
•	User Service: /api/users/**
•	Course Service: /api/courses/**
•	Enrollment Service: /api/enrollments/**

Technologies Used

	•	Spring Cloud Gateway
	•	Spring Security
	•	Eureka (for service discovery)
    •	OAuth2/JWT (for authentication)

## Contributing

Contributions are welcome! Please feel free to submit a Pull Request or open an Issue if you find a bug or want to suggest an improvement.

## License

This project is open-source and available under the [MIT License](

# EAD Course Management System

This project is a Course Management System for Distance Learning (EAD), designed with a microservices architecture using
Java Spring Boot. It aims to provide a scalable solution for managing users, courses, payments, and notifications in an
EAD environment.