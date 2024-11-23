# Config Server

The **Config Server** is a centralized configuration server for managing and serving configuration properties to all microservices within the EAD Course Management System. It ensures consistency and ease of configuration updates across the system.

## Features

- Centralized management of application configurations.
- Dynamically updates configurations without restarting services (via Spring Cloud Bus).
- Supports external configuration storage such as Git repositories.

## Running the Application

To run the Config Server locally, follow these steps:

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/ead-course-management-system.git
   cd config-server
    ```
   
2. Run the application using Maven:
   
    ```bash
    mvn spring-boot:run
    ```
   
3. The Config Server will start on port `8888` by default. You can access the Config Server at [http://localhost:8888](http://localhost:8888).

## Configuration

The Config Server can be configured using the `application.yml` file located in the `src/main/resources` directory. You can modify the following properties:

- `server.port`: The port on which the Config Server will run.
- `spring.cloud.config.server.git.uri`: The URI of the Git repository where configuration files are stored.
- `spring.cloud.config.server.git.search-paths`: The directory within the Git repository where configuration files are located.
- `spring.cloud.config.server.git.username`: The username for authenticating with the Git repository.
- `spring.cloud.config.server.git.password`: The password for authenticating with the Git repository.
- `spring.cloud.config.server.git.clone-on-start`: Whether to clone the Git repository on startup.
- `spring.cloud.config.server.git.timeout`: The timeout for cloning the Git repository.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
```