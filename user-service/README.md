# User Service

The **User Service** is responsible for managing user data in the EAD Course Management System. It handles user registration, authentication, and user profile management.

## Features

- User Registration
- JWT Authentication
- User Profile Management
- Password Reset and Recovery

## Running the Application

To run this service locally, follow these steps:

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/ead-course-management-system.git
   cd user-service
   
2.	Run the service with Maven:

   ```bash
   mvn spring-boot:run
   ```
   The service will start on port `8080`.

3. Access the service at http://localhost:8080.

API Endpoints

- `POST /api/users/register` - Register a new user

	•	Register a new user.
	•	Request Body:
        {
            "username": "johndoe",
            "email": ",
            "password": "password"
        }

- `POST /api/users/login` - Authenticate a user and generate a JWT token
    
        •	Authenticate a user and generate a JWT token.
        •	Request Body:
            {
                "username": "johndoe",
                "password": "password"
            }

- `GET /api/users/{username}` - Retrieve the profile of a user
        
            •	Retrieve the profile of a user.
            •	Path Variable: username

- `PUT /api/users/{username}` - Update the profile of a user

            •	Update the profile of a user.
            •	Path Variable: username
            •	Request Body:
                {
                    "email": "
                }

- `POST /api/users/{username}/password` - Update the password of a user

            •	Update the password of a user.
            •	Path Variable: username
            •	Request Body:
                {
                    "currentPassword": "password",
                    "newPassword": "newpassword"
                }

- `POST /api/users/{username}/password/reset` - Reset the password of a user
    
                •	Reset the password of a user.
                •	Path Variable: username
                •	Request Body:
                    {
                        "email": "
                    }
      
```

## Dependencies

The **User Service** relies on the following services:

- [Course Service](../course-service/README.md)
- [Enrollment Service](../enrollment-service/README.md)
- [Notification Service](../notification-service/README.md)

Technologies Used

	•	Spring Boot
	•	Spring Data JPA
	•	JWT Authentication
	•	H2 Database (can be swapped with MySQL/PostgreSQL)

## Configuration

The service can be configured using the following environment variables:

- `DATABASE_URL`: The URL of the PostgreSQL database.
- `DATABASE_USERNAME`: The username for the database.
- `DATABASE_PASSWORD`: The password for the database.
- `JWT_SECRET
- `JWT_EXPIRATION_TIME`: The expiration time for the JWT token.

## Documentation

- [API Documentation](https://documenter.getpostman.com/view/1234567/TVzVhKQj)

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
```   
```

## Contributing

Contributions are always welcome!

See `CONTRIBUTING.md` for ways to get started.

Please adhere to this project's `code of conduct`.

## Authors

- Thiago Muniz - [@trMuniz](linkedin.com/in/trMuniz)

## Acknowledgements

- Hat tip to
- Inspiration
- etc
```   
```