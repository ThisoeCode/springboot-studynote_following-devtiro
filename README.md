# About this Repo

Most of the content is me following [Devtiro](https://www.devtiro.com/)'s [Spring Boot Tutorial](https://youtu.be/Nv2DERaMx-4) on YouTube.

[Devtiro's Repo of this course](https://github.com/devtiro/course-spring-boot)

Codes are written on Windows IntelliJ.

> Start learning on 2024/02/11.


# Learning Note

## Dependency Injection

### Beans
`Beans` are the concrete classes in the Spring Framework / Spring Boot. Inside `@Configuration` class, use `@Bean` annotation to declare a Bean.

> 1. Add a `config/` package under root folder (`com.thisoe.xxx/`).\
> 2. Create a class, label the class using `@Configuration`.
> 3. Define Beans in the class with `@Bean` annotation.
