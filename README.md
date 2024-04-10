# Spring Boot API with PostgreSQL

This is an API project developed in Spring Boot that allows performing CRUD (Create, Read, Update, Delete) operations using GET, POST, PUT, and DELETE methods. The API connects to a PostgreSQL database.

## Features

- **Endpoints**:
  - GET: To retrieve existing students.
  - POST: To create new students.
  - PUT: To update existing students.
  - DELETE: To delete existing students.

## Technologies Used

- Java 22
- Spring Boot
- PostgreSQL
- Maven

## Prerequisites

- Java Development Kit (JDK) >= 17
- PostgreSQL
- Maven

## Installation and Configuration

1. Clone this repository: `git clone https://github.com/your-username/repository-name.git`
2. Import the project into your favorite IDE (for example, IntelliJ IDEA, Eclipse).
3. Configure the connection information to the PostgreSQL database in the `application.properties` file.
4. Ensure that PostgreSQL is running.
5. Run the Spring Boot application.

## Endpoints

The API has the following endpoints:

- `GET /api/v1/`: Returns a list of all students.
- `POST /api/v1/{id}`: Creates a new student with the provided data: `{
    "name": "Fulano",
    "email": "fulano@com.br",
    "dateOfBirth": "1998-12-17"
  }`
- `PUT /api/v1/{id}?field=value`: Updates an existing resource with the provided ID followed by field: `/api/v1/student/1?name=Maria`
- `DELETE /api/v1/{id}`: Deletes an existing resource with the provided ID.


## License

This project is licensed under the [MIT License](https://opensource.org/licenses/MIT).
