# xuyan-workspace

Xu Yan 的 Dating App 学员开发工作区。

## 项目结构

```text
xuyan-workspace/
├── ai-chat/        # Python AI 服务
├── dating-server/  # Java 21 / Spring Boot 微服务
└── proto/          # gRPC 接口契约
```

## 微服务

`dating-server` 计划包含：

- `mobile-gateway`
- `user-service`
- `im-service`
- `match-service`
- `post-service`
- `payment-service`
- `example-service`

## 开发环境

- JDK 21
- Maven 3.9+
- Docker Desktop
- PostgreSQL 16
- Redis 7
- Nacos 2.4
- gRPC 1.68.1
- Spring Boot 3.3.5

## 分支规范

- `main`：稳定发布分支
- `dev`：日常集成分支
- `xuyan/<topic>`：个人开发分支

所有功能从 `dev` 创建个人分支，通过 Pull Request 合并回 `dev`。

## 安全要求

禁止向 Git 提交以下内容：

- 密码、Token、Access Key、Secret Key
- 私钥和证书
- `.env` 文件
- `application-local.yml`
- Nexus、数据库及其他服务的真实凭据

配置文件只允许提交环境变量占位符或 `.example` 示例文件。