# Enrollment Service

The **Enrollment Service** handles the registration of students into courses within the EAD Course Management System. It ensures that users are properly enrolled and can access their respective course materials.

## Features

- Enroll Users in Courses
- Check Enrollment Status
- Remove Users from Courses
- List All Enrollments

## Running the Application

To run this service locally, follow these steps:

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/ead-course-management-system.git
   cd enrollment-service
    ```
   
2. Run the service with Maven:
   ```bash
   mvn spring-boot:run
   ```
   
3. The service will be accessible at `http://localhost:8080`.

## API Endpoints

The following endpoints are available:

- `POST /enrollments` - Enroll a user in a course

    Request Body:
    ```json
    {
        "userId": 1,
        "courseId": 1
    }
    ```

- `GET /api/enrollments/{userId}` - Check if a user is enrolled in a course

Response Body:
```json
{
    "userId": 1,
    "courseId": 1
}
```

- `DELETE /api/enrollments/{userId}/{courseId}` - Remove a user from a course

Response Body:
```json
{
    "message": "Enrollment removed"
}
```

- `GET /api/enrollments` - List all enrollments

Response Body:
```json
[
    {
        "userId": 1,
        "courseId": 1
    },
    {
        "userId": 2,
        "courseId": 2
    }
]
```

Technologies Used

	•	Spring Boot
	•	Spring Data JPA
	•	H2 Database (can be swapped with MySQL/PostgreSQL)
    •	Spring Cloud
    •	Spring Cloud Gateway
    •	Spring Cloud Config

## Dependencies

The **Enrollment Service** relies on the following services:

- [Course Service](../course-service)
- [User Service](../user-service)
- [Discovery Service](../discovery-service)
- [API Gateway](../api-gateway)
- [Config Service](../config-service)
- [Spring Cloud Gateway](../spring-cloud-gateway)
- [Spring Cloud Config](../spring-cloud-config)

## Documentation

For more information about the **Enrollment Service** and its capabilities, please refer to the [API Documentation](./API.md).

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
```