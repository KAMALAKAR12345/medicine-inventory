# Medicine Inventory Management System  

## MODULE 1  - PROJECT SETUP

### **Project Overview**  
The **Medicine Inventory Management System** is a web-based application designed to help pharmacies manage their inventory, track expiry dates, and handle sales efficiently.  

### **Tech Stack**  
- **Backend**: Spring Boot (Java)  
- **Frontend**: React.js  
- **Database**: MySQL / PostgreSQL  
- **Build Tool**: Maven  
- **Version Control**: Git & GitHub  

---

## **MODULE 2 Tasks - Backend Setup**  

### **1. Created Spring Boot Project**  
- Used **Spring Initializr** to generate the project with the following dependencies:  
  - Spring Web  
  - Spring Boot DevTools  
  - Spring Data JPA  
  - MySQL Driver  
  - (Optional) Spring Security  

### **2. Set Up GitHub Repository**  
- Initialized Git repository and linked it to GitHub:  
  ```sh
  git init  
  git add .  
  git commit -m "Initial commit - Spring Boot project setup"  
  git branch -M main  
  git remote add origin <https://github.com/KAMALAKAR12345/medicine-inventory.git>  
  git push -u origin main  
### 3. **Configure with H2 database ** ###
## H2 Database Configuration
This project uses an in-memory H2 database for easy testing.  
To access the H2 console:
- Start the application
- Open `http://localhost:8080/h2-console`
- JDBC URL: `jdbc:h2:mem:med_inventory`
- Username: `sa`
- Password: (leave blank)

Spring Boot auto-configures the H2 database when running in development mode.


# Medicine Inventory Management System  

### API Implementation & H2 Database Integration  

### **Project Overview**  
The **Medicine Inventory Management System** is a web-based application designed to manage medicine stock, track expiry dates, and handle orders efficiently.  

### **Tech Stack**  
- **Backend**: Spring Boot (Java)  
- **Frontend**: React.js (To be implemented)  
- **Database**: H2 (In-memory)  
- **Security**: Spring Security (To be implemented)  
- **Version Control**: Git & GitHub  

---

## **Tasks - Implemented API & H2 Database**  

### **1️⃣ Implemented Medicine Entity**  
Created the `Medicine` entity with attributes:  
✅ `id` (Primary Key)  
✅ `name`, `manufacturer`, `price`, `quantity`, `expiryDate`  

### **2️⃣ Created Repository, Service & Controller**  
✅ `MedicineRepository.java` for database operations  
✅ `MedicineService.java` for business logic  
✅ `MedicineController.java` for RESTful APIs  

### **3️⃣ Configured H2 Database**  
Updated `application.properties` for H2:  
```properties
spring.datasource.url=jdbc:h2:mem:med_inventory
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.h2.console.enabled=true
spring.jpa.hibernate.ddl-auto=update
