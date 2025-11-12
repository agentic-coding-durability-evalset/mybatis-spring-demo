# MyBatis Spring Demo

一个基于 [MyBatis](https://mybatis.org/) 和 [Spring Boot](https://spring.io/projects/spring-boot) 的 Java Web 应用示例项目。展示了如何使用 MyBatis 作为 ORM 框架与 Spring Boot 集成。

## 技术栈

- **Java**: 21
- **Spring Boot**: 3.5.7
- **MyBatis Spring Boot**: 3.0.5
- **MySQL**: 数据库
- **Maven**: 构建工具

## 项目结构

```
mybatis-spring-demo/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── ...       # Java 源代码
│   │   └── resources/
│   │       ├── mapper/   # MyBatis Mapper XML 文件
│   │       └── application.properties
│   └── test/             # 测试代码
├── pom.xml               # Maven 依赖配置
├── docker-compose.yml    # Docker Compose 配置
├── Justfile              # Just 构建工具配置
└── README.md
```

## 功能特性

- MyBatis ORM 集成
- Spring Boot Web 支持
- MySQL 数据库连接
- Mapper XML 配置

## 快速开始

### 前置要求

- Java 21 或更高版本
- Maven 3.6+
- MySQL 8.0+ (或使用 Docker Compose)

### 安装和运行

```bash
# 使用 Docker Compose 启动 MySQL
docker-compose up -d

# 构建项目
mvn clean package

# 运行应用
mvn spring-boot:run
# 或
java -jar target/mybatis-spring-demo-1.0.0-SNAPSHOT.jar
```

应用将在 `http://localhost:8080` 启动。

### 数据库配置

默认配置（可在 `application.properties` 中修改）：
- **URL**: `jdbc:mysql://localhost:13306/test`
- **用户名**: `root`
- **密码**: `123456`

## 配置说明

### application.properties

```properties
# 数据库配置
spring.datasource.url=jdbc:mysql://localhost:13306/test
spring.datasource.username=root
spring.datasource.password=123456

# MyBatis 配置
mybatis.mapper-locations=classpath:mapper/*.xml
mybatis.type-aliases-package=com.example.model
```

## 参考资源

- [MyBatis 文档](https://mybatis.org/mybatis-3/)
- [MyBatis Spring Boot Starter](https://mybatis.org/spring-boot-starter/mybatis-spring-boot-autoconfigure/)
- [Spring Boot 文档](https://spring.io/projects/spring-boot)
- [Spring Boot + MyBatis 示例](https://github.com/mybatis/spring-boot-starter)
