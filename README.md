MyDiary - Personal Diary Web Application
A full-stack personal diary web application built with Spring MVC, JPA (Hibernate), MySQL, and JSP. Users can register, log in, and manage their diary entries with full CRUD functionality.

Features
* User Registration & Login (Session-based Authentication)
* Home Page with all diary entries
* Create a new diary entry
* Read / View diary entries
* Update / Edit existing entries
* Delete diary entries
* Session management & logout
---------------------------------------------------------------------------------------------------------------------------
Tech Stack
LayerTechnologyFrontendJSP, HTML, CSS, BootstrapBackendJava
Spring MVCORMJPA (Hibernate)DatabaseMySQLServerApache TomcatBuild ToolMaven
----------------------------------------------------------------------------------------------------------------------------
Project Structure
MyDiary/
├── src/
│   └── main/
│       ├── java/
│       │   └── com/mydiary/
│       │       ├── controller/
│       │       │   ├── AuthController.java
│       │       │   └── DiaryController.java
│       │       ├── model/
│       │       │   ├── User.java
│       │       │   └── DiaryEntry.java
│       │       ├── repository/
│       │       │   ├── UserRepository.java
│       │       │   └── DiaryRepository.java
│       │       └── service/
│       │           ├── UserService.java
│       │           └── DiaryService.java
│       ├── resources/
│       │   └── application.properties
│       └── webapp/
│           └── WEB-INF/
│               └── views/
│                   ├── register.jsp
│                   ├── login.jsp
│                   ├── home.jsp
│                   ├── create.jsp
│                   └── edit.jsp
├── pom.xml
└── README.md
--------------------------------------------------------------------------------------------------------------------------------
Prerequisites
 Make sure you have the following installed:

 * Java JDK 8 or higher
 * Apache Maven
 * MySQL Server
 * Apache Tomcat
 * Any IDE (Eclipse / IntelliJ IDEA)
----------------------------------------------------------------------------------------------------------------------------------
Database Setup

Open MySQL and create the database:

sqlCREATE DATABASE mydiary_db;

Update your application.properties (or persistence.xml) with your MySQL credentials:

propertiesspring.datasource.url=jdbc:mysql://localhost:3306/mydiary_db
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

Hibernate will automatically create the tables on first run.
-------------------------------------------------------------------------------------------------------------------------------
How to Run

1.Clone the repository:

bashgit clone https://github.com/your-username/mydiary.git
cd mydiary

2.Build the project:

bashmvn clean install

3.Deploy the generated .war file to Apache Tomcat, or run directly via Maven:

bashmvn tomcat7:run

4.Open your browser and visit:

http://localhost:8080/mydiary 
------------------------------------------------------------------------------------------------------------------------------------

📸 Screenshots
Register Page
<img width="1362" height="650" alt="image" src="https://github.com/user-attachments/assets/0d0bc393-24dc-4933-aad5-9823e7c08ed7" />



Login Page
<img width="1362" height="650" alt="image" src="https://github.com/user-attachments/assets/1cbc581b-0e63-4c07-b28c-52331147dab1" />



Home Page
<img width="1362" height="650" alt="image" src="https://github.com/user-attachments/assets/02ed5538-423f-4828-89aa-1964efd2800b" />



Create Entry
<img width="1362" height="650" alt="image" src="https://github.com/user-attachments/assets/fb2feea2-37d4-47c8-82b6-7990b28f1ab8" />



Edit Entry
<img width="1362" height="650" alt="image" src="https://github.com/user-attachments/assets/e5820769-0578-4f4c-95b7-ddd971883a14" />





