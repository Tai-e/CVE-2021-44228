<div align="center">
  <img src="https://raw.githubusercontent.com/pascal-lab/Tai-e/master/tai-e-logo.png" height="200">

# Tai-e Template

</div>

> **Note**
> 
> Click the <kbd>Use this template</kbd> button (not <kbd>Fork</kbd>).

This is a template project designed to demonstrate how to develop your own static analysis using [Tai-e](https://github.com/pascal-lab/Tai-e) (an easy-to-learn/use static analysis framework for Java) as a dependency in a Gradle or Maven project.

The main goal of this template project is to speed up the setup phase of static analysis development on top of Tai-e for both new and experienced developers by preconfiguring the project scaffold and keeping everything organized.

## Table of contents

- [Choose you build tool](#choose-you-build-tool)
- [Getting started](#getting-started)
- [Sample code](#sample-code)
- [Build tool configuration file](#build-tool-configuration-file)
- [Testing](#testing)
- [Useful links](#useful-links)

## Choose you build tool

This template project contains both Gradle-related and Maven-related files. Thus, you need to choose the build tool you are using, focus on the files you need in it, and delete other irrelevant files.

### Gradle

For Gradle users, the following files are required, while others can be deleted:

```
.
├── gradle                  (Gradle Wrapper)
├── src                     (Source code folder)
├── build.gradle.kts        (Gradle configuration)
├── gradlew                 (*nix Gradle Wrapper script)
└── gradlew.bat             (Windows Gradle Wrapper script)
```

### Maven

For Maven users, the following files are required, while others can be deleted:

```
.
├── .mvn                    (Maven Wrapper)
├── src                     (Source code folder)
├── mvnw                    (*nix Maven Wrapper script)
├── mvnw.cmd                (Windows Maven Wrapper script)
└── pom.xml                 (Maven configuration)
```



> **Warning**
> 
> Make sure to remove all non-needed files from your project.


## Getting started

Before you dive into static analysis development and everything related to it, it's worth mentioning the benefits of using GitHub Templates. By creating a new project using the current template, you start with no history or reference to this repository. This allows you to create a new repository easily without copying and pasting previous content, clone repositories, or clearing the history manually.

All you have to do is click the `Use this template` button (you must be logged in with your GitHub account).

Once this is complete, the project is ready to be cloned to your local environment and opened with [IntelliJ IDEA](https://www.jetbrains.com/idea/download).

The next step, after opening your project in IntelliJ IDEA, is to set the proper SDK to Java in version `17` within the [Project Structure settings](https://www.jetbrains.com/help/idea/project-settings-and-structure.html). Then you can get to work implementing your ideas.

## Sample code

The prepared template provides as little code as possible because it is impossible for a general scaffold to fulfill all the specific requirements for all static analysis on top of Tai-e. Therefore, the template contains only the following files:

```
.
└── src
    ├── main
    │ └── java
    │    └── org
    │        └── example
    │           └── MyMain.java (Your analyzer code)
    └── test
      └── resources
          ├── MyClass.java      (The program analyzed by your analyzer)
          └── *.class           (All the .class files obtained by compiling MyClass.java with Java 17)
```

## Build tool configuration file

The build.gradle.kts and pom.xml files are the project configuration files for Gradle and Maven, respectively. There are some generic properties that you need to modify later when working on your own analyzer code.

### Gradle

Project metadata:

```kotlin
group = "org.example"
description = "tai-e-template"
version = "0.0.1-SNAPSHOT"
```

Entry point class of your analyzer:

```kotlin
application {
    mainClass.set("org.example.MyMain")
}
```

Tai-e version specified:

```kotlin
val taieVersion = "0.2.2"
```

### Maven

Project metadata:

```xml
<groupId>org.example</groupId>
<artifactId>tai-e-template</artifactId>
<version>0.0.1-SNAPSHOT</version>
```

Entry point class of your analyzer:

```xml
<build>
        <plugins>
...
            <plugin>
                <groupId>org.codehaus.mojo</groupId>
                <artifactId>exec-maven-plugin</artifactId>
...
                <configuration>
                    <mainClass>org.example.MyMain</mainClass>
                </configuration>
            </plugin>
        </plugins>
    </build>
```

Tai-e version specified:

```xml
<properties>
...
    <tai-e.version>0.2.2</tai-e.version>
</properties>
```

## Testing

If you need to test how to run your analyzer from the command line (for example, when developing in headless environments like remote servers):

* For Gradle users, run `./gradlew run` to execute your analyzer.

* For Maven users, run `./mvnw test` to execute your analyzer.

## Useful links

* [Tai-e source code](https://github.com/pascal-lab/Tai-e)
* [The reference documentation of Tai-e](https://tai-e.pascal-lab.net/docs/index.html)
