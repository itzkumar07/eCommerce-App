---

# 🛒 E-Commerce Backend API

A complete **Spring Boot + MongoDB** backend for managing an e-commerce platform, including CRUD operations for **Products**, **Orders**, **Categories**, and **Journal Entries**.

---

## 🚀 Features

* RESTful APIs for Product, Order, Category & Journal Entry modules
* MongoDB Atlas integration
* Full CRUD support
* Layered architecture (Controller, Service, Repository)
* Spring Actuator endpoints
* Integrated with Lombok to reduce boilerplate code

---

## 🧰 Tech Stack

* Java 21
* Spring Boot 3.4.4
* Spring Data MongoDB
* Maven
* MongoDB Atlas
* Lombok
* Postman (API testing)

---

## 📂 Project Structure

```
src/
└── main/
    ├── java/
    │   └── com.bootcoding.eCommerce_App/
    │       ├── controller/          # REST Controllers
    │       ├── service/             # Business logic layer
    │       ├── repository/          # MongoDB repositories
    │       ├── model/               # Entity classes
    │       └── ECommerceAppApplication.java  # Main app
    └── resources/
        ├── application.properties   # MongoDB & config
        └── static/
```

---

## ⚙️ Setup & Run

### 1. Clone the Repository

```bash
git clone https://github.com/itzkumar07/eCommerce-App.git
cd eCommerce-App
```

### 2. Configure MongoDB

Edit the `application.properties` file:

```properties
server.port=3090
spring.data.mongodb.uri=mongodb+srv://<username>:<password>@cluster0.mongodb.net/eCommerceDB?retryWrites=true&w=majority
spring.data.mongodb.database=eCommerceDB

# Optional: enable debug logging
logging.level.org.springframework.data.mongodb.core.MongoTemplate=DEBUG
```

### 3. Run the Application

```bash
./mvnw spring-boot:run
```

Visit: `http://localhost:3090`

---

## 📮 API Endpoints

### 🔹 Product API

| Method | Endpoint             | Description       |
| ------ | -------------------- | ----------------- |
| GET    | `/api/products`      | List all products |
| GET    | `/api/products/{id}` | Get product by ID |
| POST   | `/api/products`      | Add a product     |
| PUT    | `/api/products/{id}` | Update product    |
| DELETE | `/api/products/{id}` | Delete product    |

### 🔹 Order API

| Method | Endpoint           | Description     |
| ------ | ------------------ | --------------- |
| POST   | `/api/orders`      | Place an order  |
| GET    | `/api/orders/{id}` | Get order by ID |

### 🔹 Category API

| Method | Endpoint                     | Description      |
| ------ | ---------------------------- | ---------------- |
| GET    | `/api/public/categories`     | Public: List all |
| POST   | `/api/admin/categories`      | Admin: Add       |
| PUT    | `/api/admin/categories/{id}` | Admin: Update    |
| DELETE | `/api/admin/categories/{id}` | Admin: Delete    |

### 🔹 Journal Entry API

| Method | Endpoint            | Description      |
| ------ | ------------------- | ---------------- |
| GET    | `/api/journal`      | List all entries |
| GET    | `/api/journal/{id}` | Get by ID        |
| POST   | `/api/journal`      | Add new entry    |
| PUT    | `/api/journal/{id}` | Update by ID     |
| DELETE | `/api/journal/{id}` | Delete by ID     |

---

## 📄 Sample JSON

### ➕ Add a Product

```json
{
  "name": "Wireless Mouse",
  "price": 499.99,
  "category": "Electronics",
  "description": "A smooth and fast wireless mouse"
}
```

---

## 🧪 API Testing with Postman

1. Open Postman.
2. Create a collection named `eCommerce-App`.
3. Add requests with appropriate methods and endpoints.
4. Set `Content-Type: application/json` in headers.
5. Provide request bodies where necessary (e.g., POST, PUT).

---

## 📦 Key Dependencies

* `spring-boot-starter-web`
* `spring-boot-starter-data-mongodb`
* `spring-boot-starter-actuator`
* `lombok`

---

## 👨‍💻 Author

**Kumar Kankam**
Backend Developer (Java, Spring Boot, MongoDB)
📧 [kumarkankam17@gmail.com](mailto:kumarkankam17@gmail.com)
🔗 [GitHub - @itzkumar07](https://github.com/itzkumar07)

---
