# Course Service

The **Course Service** is responsible for managing courses in the EAD Course Management System. It allows for the creation, updating, and deletion of courses, as well as course data retrieval.

## Features

- Create a New Course
- Update Course Details
- Delete a Course
- Retrieve Course Information
- List All Courses

## Running the Application

To run this service locally, follow these steps:

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/ead-course-management-system.git
   cd course-service
   ```

2. Run the service with Maven:

    ```bash
    mvn spring-boot:run
    ```
   
3. The service will be accessible at `http://localhost:8080`.

API Endpoints

- `POST /courses` - Create a new course

  •	Create a new course.
  •	Request Body:

    ```json
    {
        "name": "Course Name",
        "description": "Course Description",
        "instructor": "Instructor Name",
        "price": 100.00
    }
    ```
    •	Response Body:
    
   ```json
     {
         "id": 1,
         "name": "Course Name",
         "description": "Course Description",
         "instructor": "Instructor Name",
         "price": 100.00
     }
   ```

- `PUT /courses/{courseId}` - Update course details
    
      •	Update course details.
      •	Request Body:
    
     ```json
     {
          "name": "Updated Course Name",
          "description": "Updated Course Description",
          "instructor": "Updated Instructor Name",
          "price": 200.00
     }
     ```
     •	Response Body:
     
    ```json
    {
          "id": 1,
          "name": "Updated Course Name",
          "description": "Updated Course Description",
          "instructor": "Updated Instructor Name",
          "price": 200.00
    }
    ```

- `DELETE /courses/{courseId}` - Delete a course

    •	Delete a course by ID.
    •	Response Body:
    
     ```json
     {
         "message": "Course deleted successfully"
     }
     ```

- `GET /courses/{courseId}` - Retrieve course information

    •	Retrieve course information by ID.
    •	Response Body:
    
     ```json
     {
         "id": 1,
         "name": "Course Name",
         "description": "Course Description",
         "instructor": "Instructor Name",
         "price": 100.00
     }
     ```

- `GET /courses` - List all courses

    •	List all courses.
    •	Response Body:
    
     ```json
     [
         {
             "id": 1,
             "name": "Course Name",
             "description": "Course Description",
             "instructor": "Instructor Name",
             "price": 100.00
         },
         {
             "id": 2,
             "name": "Course Name",
             "description": "Course Description",
             "instructor": "Instructor Name",
             "price": 100.00
         }
     ]
     ```

## API Documentation

The Course Service API documentation is available at `http://localhost:8080/swagger-ui.html`.

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- H2 Database
- Swagger
- Maven
- JUnit
- Mockito
- Lombok
- MapStruct
- GitHub Actions
```