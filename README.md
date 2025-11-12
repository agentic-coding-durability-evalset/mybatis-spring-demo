# MyBatis Spring Demo

A Java Web application demo project based on [MyBatis](https://mybatis.org/) and [Spring Boot](https://spring.io/projects/spring-boot). Demonstrates how to integrate MyBatis as an ORM framework with Spring Boot.

## Tech Stack

- **Java**: 21
- **Spring Boot**: 3.5.7
- **MyBatis Spring Boot**: 3.0.5
- **MySQL**: Database
- **Maven**: Build tool

## Project Structure

```
mybatis-spring-demo/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── ...       # Java source code
│   │   └── resources/
│   │       ├── mapper/   # MyBatis Mapper XML files
│   │       └── application.properties
│   └── test/             # Test code
├── pom.xml               # Maven dependency configuration
├── docker-compose.yml    # Docker Compose configuration
├── Justfile              # Just build tool configuration
└── README.md
```

## Features

- MyBatis ORM integration
- Spring Boot Web support
- MySQL database connection
- Mapper XML configuration

## Quick Start

### Prerequisites

- Java 21 or higher
- Maven 3.6+
- MySQL 8.0+ (or use Docker Compose)

### Installation and Running

```bash
# Start MySQL using Docker Compose
docker-compose up -d

# Build project
mvn clean package

# Run application
mvn spring-boot:run
# Or
java -jar target/mybatis-spring-demo-1.0.0-SNAPSHOT.jar
```

The application will start at `http://localhost:8080`.

### Database Configuration

Default configuration (can be modified in `application.properties`):
- **URL**: `jdbc:mysql://localhost:13306/test`
- **Username**: `root`
- **Password**: `123456`

## Configuration Details

### application.properties

```properties
# Database configuration
spring.datasource.url=jdbc:mysql://localhost:13306/test
spring.datasource.username=root
spring.datasource.password=123456

# MyBatis configuration
mybatis.mapper-locations=classpath:mapper/*.xml
mybatis.type-aliases-package=com.example.model
```

## References

- [MyBatis Documentation](https://mybatis.org/mybatis-3/)
- [MyBatis Spring Boot Starter](https://mybatis.org/spring-boot-starter/mybatis-spring-boot-autoconfigure/)
- [Spring Boot Documentation](https://spring.io/projects/spring-boot)
- [Spring Boot + MyBatis Examples](https://github.com/mybatis/spring-boot-starter)
