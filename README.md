# About this Repo

Most of the content is me following [Devtiro](https://www.devtiro.com/)'s [Spring Boot Tutorial](https://youtu.be/Nv2DERaMx-4) on YouTube.

[Devtiro's Repo of this course](https://github.com/devtiro/course-spring-boot)

Codes are written on Windows IntelliJ.

> Start learning on 2024/02/11.


# Learning Note

## Dependency Injection

### Beans
`Beans` are the concrete classes in the Spring Framework / Spring Boot. Use `@Component` or `@Service` annotation to declare a Bean.

> 1. Add a `config/` package under root folder (`com.thisoe.xxx/`).\
> 2. Create a class, label the class using `@Configuration`.
> 3. Define Beans in the class with `@Bean` annotation.

### Component scanning
Component scanning happens when the app **starts up**. 

In this process, Spring Boot will:
1. Look for Beans, and where the Beans are needed.
2. Do these Beans need any dependencies?
3. Create an instance of the class, and place it (as a Bean) into the application context.

In Spring-specific term, this process is also called "**Auto-wiring**".

> Spring's component search will search for Beans **ONLY UNDER THE PACKAGE WHERE THE `@SpringBootApplication` IS IN**.


### The `@SpringBootApplication` annotation
1. `@Configuration`
2. `@ComponentScan`
3. `@EnableAutoConfiguration`


### The `@EnableAutoConfiguration` annotation




