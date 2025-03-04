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

## **MODULE 1 Tasks - Backend Setup**  

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

### **3. Configured project setup **

    spring.datasource.url=jdbc:mysql://localhost:3306/medicine_inventory  
    spring.datasource.username=root  
    spring.datasource.password=yourpassword  
    spring.jpa.hibernate.ddl-auto=update  
    spring.jpa.show-sql=true  

### **4.Tested Spring Boot Application** 
        mvn clean install  
        mvn spring-boot:run  

### **5.Finalized and Pushed to GitHub**
    git add .  
    git commit -m "Configured database and tested Spring Boot setup"  
    git push origin main  

    
