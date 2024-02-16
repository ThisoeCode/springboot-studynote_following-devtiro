# About this Repo

Most of the content is me following [Devtiro](https://www.devtiro.com/)'s [Spring Boot Tutorial](https://youtu.be/Nv2DERaMx-4) on YouTube.

[Devtiro's Repo of this course](https://github.com/devtiro/course-spring-boot)

Codes are written on Windows IntelliJ.

> Start learning on 2024/02/11.


# Learning Note

## Dependency Injection

### Beans (with `@Component`)

```java
@Component
public class ColorPrinterImpl implements ColorPrinter {
}
```

1. Add `@Component` annotation to the class.<brThis is telling Spring that `ColorPrinter` is a Bean and is an implementation of `ColorPrinterImpl`.

2. If we run the app at this moment, we get an error `Consider defining a bean of type 'RedPrinter' in your configuration.`<brSo we should add `@Component` in front of `EnglishRedPrinter` class, Etc.

3. Switch lang of each color by annotating `@Component` to the wanted classes.

> The out put of this branch:<br>
> `aka, blue, green`