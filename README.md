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
- 注解式 Mapper 支持
- Actuator 监控端点
- 数据库测试支持

## 快速开始

### 前置要求

- Java 21 或更高版本
- Maven 3.6+
- MySQL 8.0+ (或使用 Docker Compose)

### 安装和运行

```bash
# 克隆项目
git clone <repository-url>
cd mybatis-spring-demo

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

## 项目特点

### MyBatis 集成

使用 MyBatis Spring Boot Starter：
- 自动配置
- Mapper 扫描
- 事务管理
- 连接池管理

### Mapper 配置

支持两种方式：

1. **XML Mapper** (`src/main/resources/mapper/`):
```xml
<mapper namespace="com.example.mapper.UserMapper">
    <select id="findById" resultType="User">
        SELECT * FROM users WHERE id = #{id}
    </select>
</mapper>
```

2. **注解 Mapper**:
```java
@Mapper
public interface UserMapper {
    @Select("SELECT * FROM users WHERE id = #{id}")
    User findById(Long id);
}
```

### Spring Boot 特性

- **Web 支持**: RESTful API
- **Actuator**: 健康检查和监控
- **自动配置**: 零配置启动
- **开发工具**: 热重载支持

## 开发

### 添加新的 Mapper

1. 创建 Mapper 接口
2. 创建对应的 XML 文件（如使用 XML）
3. 在 `application.properties` 中配置 Mapper 位置

### 数据库迁移

可以使用 Flyway 或 Liquibase 进行数据库版本管理。

### 测试

```bash
# 运行测试
mvn test

# 运行特定测试
mvn test -Dtest=UserMapperTest
```

## Docker 支持

### 使用 Docker Compose

```bash
# 启动 MySQL
docker-compose up -d

# 停止 MySQL
docker-compose down
```

### Dockerfile

可以创建 Dockerfile 来容器化应用：

```dockerfile
FROM openjdk:21-jdk-slim
COPY target/*.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
```

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
