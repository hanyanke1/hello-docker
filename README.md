# hello-docker

一个 Spring Boot + MySQL + Docker Compose 的示例项目，用于学习容器化部署和多容器编排。

## 技术栈

- Java 21
- Spring Boot 4.0.8
- Spring Data JPA
- MySQL 8.0
- Docker / Docker Compose

## 项目结构

- `controller`：REST 接口
- `entity`：JPA 实体类
- `repository`：数据访问层
- `Dockerfile`：构建应用镜像
- `docker-compose.yml`：编排 app 和 MySQL 两个容器

## 如何运行

1. 确保已安装 Docker 和 Docker Compose
2. 在项目根目录执行：

   ```bash
   docker-compose up -d --build
3.访问接口
  http://localhost:8081/Hello → 返回 Hello Docker
  http://localhost:8081/db → 往 MySQL 写一条数据并返回
