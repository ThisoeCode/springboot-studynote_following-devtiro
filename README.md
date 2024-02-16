# About this Repo

Most of the content is me following [Devtiro](https://www.devtiro.com/)'s [Spring Boot Tutorial](https://youtu.be/Nv2DERaMx-4) on YouTube.

[Devtiro's Repo of this course](https://github.com/devtiro/course-spring-boot)

Codes are written on Windows IntelliJ.

> Start learning on 2024/02/11.


# Learning Note

## 1. Hello world quickstart proj

- Dependency *"Spring Web"* allow us to build a REST-API web application.
- Notation `@SpringBootApplication` identifies a Spring Boot application. It is an entry of our app that we can then run.
- `Test` directory: Needs the notation `@SpringBootTest`. On run, it starts up a testing version of the application. <br> The (test class) context loads is a [dependency injection](#Dependency_injection) concept. <br> It's making sure the app starts up like is in production or any other environments.
- `pom` file is used by Maven.


## 2. Maven
> ***Apache Mavan** helps programmers manage their projects and all the things they need ot build their programs.*

- What Maven do:
  - Manage dependencies;
  - Build and test the application;
  - Build and package the app up;
  - Share the app as a dependency (only if you want).
<br>
- Maven is a command line tool.
```bat
./mvnw clean compile
```
Like this, the second part is called *phases*.

### About phases
```yaml
./mvnw:
  clean: Removed temporary directories and files.
  default: Where the most useful goals live.
  site: Where documentation is generated.
```
About `./mvnw clean`:
```yaml
./mvnw clean:
  pre-clean: Hook for before cleaning.
  clean: Does the actual cleaning.
  post-clean: Hook for after cleaning.
```
- Maven puts all its stuff in `target/` directory.
- `./mvnw clean` deletes files in `target/`.

About `./mvnw [default]`:
```yaml
./mvnw [default]:
  compile: Compiles code into bytecode.
  test: Runs unit tests.
  package: Creates a ".jar" or ".war" file.
  verify: Runs checks & intergration tests.
```
It runs things in order. (If you run `./mvnw package`, it will compile, **then** test, **then** package.)

### Maven project structure
[Maven Official Docs for Standard Directory Layout](https://maven.apache.org/guides/introduction/introduction-to-the-standard-directory-layout.html)
```
my-project/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com.name.proj/
│   │   │       └── app/
│   │   │           └── MyApp.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
│       ├── java/
│       │   └── com.name.proj/
│       │       └── app/
│       │           └── MyAppTest.java
│       └── resources/
└── pom.xml
```
- `MyApp.java` is the main Java source file.
- `MyAppTest.java` is the test source file.
- `application.properties` is the proj config resource file used by the main application.
- `pom.xml` is the Maven project configuration file.

This structure is ***required*** in Maven.

### Workflow with Maven
> This is Devtiro's personal preferred workflow.
> - Using terminal command rather than with the IDE;
> - Not following the [TDD](https://github.com/ThisoeCode/springacademy_CashCard-REST-API?tab=readme-ov-file#3-testing-first) (Test Driven Development) as a general rule.

#### 1. Code

In terms of the project: 
Check the todo-list,
look at requirements,
and start coding.

#### 2. Get feedback
While writing, when want to check if anything may go wrong or see any compilation error:
```bat
./mvnw compile
```
The terminal will give a fast feedback.

#### 3. Running test
When done with a feature: 
```bat
./mvnw clean test
```
Success message: <br> `[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0`

#### 4. Before pushing
Done with the feature and the tests, before committing & pushing, run: <br>
```bat
./mvnw clean package
```
or
```bat
./mvnw clean verify
```
to get the `.jar` file. <br> Then run it as if it's the released ver:
```bat
cd target
ls
java -jar [***.jar]
```
Go to `localhost:8080` to check if is up in running.

#### 5. DOUBLE CHECK
Run for the last time:
```bat
./mvnw clean test
```
If everything in the terminal works fine, commit + push!

### Maven Spring Boot Plugin
This is something like `npm run dev` in Next.js:
```bat
./mvnw spring-boot:run
```
And the app will be running on `:8080`. <br>
To stop, `Ctrl`+`C` (+`y`).


## 3. Spring Boot

### Layers
#### 1. **Persistence** layer
  Presentation layer is there to handle interactions with databases.
- Entities <br>
  (E.g. Map through tables in database)
- Repositories pattern / DAOs (Data Access Objects)
- The basic functionalities: CRUD
  - Create
  - Read
  - Update
  - Delete

#### 2. **Service** layer
- Logics <br>
> Even though the logic might just be a simple pass-through, Presentation layer must **ALWAYS** go through Service layer to reach the Persistence layer.

#### 3. **Presentation** layer
- REST APIs (Controllers as an implementation)
- and any other types of APIs (GraphQL, Web sockets API...)
> Benefit: We can easy change APIs using this layer, without touching the Service layer.

### Modularity (Dependencies)
Use Spring's ecosystem of dependencies, or, pre-can solutions, to build the [three layers](#layers).


## 4. Dependency Injection

### Beans
`Beans` are the concrete classes in the Spring Framework / Spring Boot.

Use `@Component` or `@Service` annotation to declare a Bean.

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

# Todo
- `ColoursApplication`: Practice coding the exact same thing as Devtiro.
- [See tut 1:01:21](https://youtu.be/Nv2DERaMx-4?t=3681).


