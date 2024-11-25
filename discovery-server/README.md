# Discovery Server

The **Discovery Server** is responsible for service registration and discovery in the EAD Course Management System. It
allows microservices to dynamically locate and communicate with each other without hardcoded service URLs.

## Features

- Service registration and discovery using Spring Cloud Eureka.
- Health checks for registered services.
- Load balancing for client requests.

## Running the Application

To run the Discovery Server locally, follow these steps:

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/ead-course-management-system.git
   cd discovery-server
    ```

2. Run the Discovery Server using Maven:

    ```bash
    ./mvnw spring-boot:run
    ```

3. The Discovery Server will start on port `8761`.

## Testing the Application

To test the Discovery Server, open your browser and visit `http://localhost:8761`. You will see the Eureka dashboard,
which shows the list of registered services.

## Configuration

1. The Discovery Server configuration is located in the `application.yml` file. You can change the server port, service
   name, and other properties in this file.

   ```yaml
   eureka:
   client:
   register-with-eureka: false
   fetch-registry: false
   server:
   enable-self-preservation: false
   eviction-interval-timer-in-ms: 60000
   ```

2. Ensure each microservice points to this Discovery Server by adding the following to their configurations:

    ```yaml
    eureka:
    client:
    service-url:
    defaultZone: http://localhost:8761/eureka/
    ```

Technologies Used

	•	Spring Cloud Eureka
	•	Netflix OSS (Eureka)

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
