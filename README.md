# About this Repo

Most of the content is me following [Devtiro](https://www.devtiro.com/)'s [Spring Boot Tutorial](https://youtu.be/Nv2DERaMx-4) on YouTube.

Codes are written on Windows IntelliJ.


# Learning Note

## Hello world quickstart proj

- Dependency *"Spring Web"* allow us to build a REST-API web application.
- Notation `@SpringBootApplication` identifies a Spring Boot application. It is an entry of our app that we can then run.
- `Test` directory: Needs the notation `@SpringBootTest`. On run, it starts up a testing version of the application. <br> The (test class) context loads is a [dependency injection](#Dependency_injection) concept. <br> It's making sure the app starts up like is in production or any other environments.
- `pom` file is used by Maven.


## Spring Boot

### Config file: environment variables
On Mac & Linux:
```bash
SERVER_PORT=23333 ./mvnw spring-boot:run
```

On Windows:
```bash
$env:SERVER_PORT=23333 ; ./mvnw spring-boot:runspring-boot:run
```