# User Management Project Backend with Spring Boot

This project serves as the backend for a User Management System implemented in Spring Boot. It provides features for user authentication, authorization, and user management. The backend includes JWT-based authentication, user role-based authorization, and exception handling.

## User Authorities

The project defines the following user authorities:

- **USER_AUTHORITIES:** Allows users to read user data.
- **HR_AUTHORITIES:** Allows users to read and update user data.
- **MANAGER_AUTHORITIES:** Allows users to read and update user data.
- **ADMIN_AUTHORITIES:** Allows users to read, create, and update user data.
- **SUPER_ADMIN_AUTHORITIES:** Allows users to read, create, update, and delete user data.

## API Endpoints

The following API endpoints are available:

- **POST /login:** Authenticate a user and receive a JWT token.
- **POST /register:** Register a new user.
- **POST /add:** Add a new user (requires appropriate authorities).
- **POST /update:** Update user details (requires appropriate authorities).
- **GET /find/{username}:** Get user details by username.
- **GET /list:** Get a list of all users.
- **GET /resetpassword/{email}:** Reset a user's password.
- **DELETE /delete/{username}:** Delete a user (requires appropriate authorities).
- **POST /updateProfileImage:** Update a user's profile image.
- **GET /image/{username}/{fileName}:** Get a user's profile image.
- **GET /image/profile/{username}:** Get a temporary profile image.

## Prerequisites

Before you start, ensure you have the following:

- Java Development Kit (JDK)
- Spring Boot
- Database (MySQL)
- Node.js and npm (for frontend with Angular)

## Getting Started

1. Clone the repository:

   ```bash
   git clone https://github.com/namnam2303/user-management.git
   cd user-management
2. Configure your database settings in application.properties or application.yml.

3.Build and run the application:

  ```bash
  mvn spring-boot:run
```
Your Spring Boot backend should now be running.

Usage
Use the defined API endpoints for user authentication, authorization,  and CRUD management.
JWT tokens are required for secure access to protected endpoints.
Ensure that appropriate authorities are assigned to users to control access.
Implement the frontend by Angular to interact with these backend endpoints.
Exception Handling: the project includes exception handling for various scenarios, including:

User not found
Username already exists
Email already exists
Invalid image file
Email not found
User deletion
and more...
Custom exceptions are thrown and handled with appropriate error messages and HTTP status codes.
