# Bank Management System

Welcome to the **Bank Management System**! This application is designed to provide users with an intuitive and efficient interface for managing their banking needs. Built using **Java AWT** and **Swing**, this system leverages **MySQL JDBC** for seamless database interactions, ensuring your data is handled securely and efficiently.

## Features

- **User Authentication**: Secure login and account creation process to ensure that only authorized users can access their accounts.
- **Account Management**: View account balances, transaction histories, and perform transactions such as deposits and withdrawals with ease.
- **Mini Statement**: Quick access to recent transactions with clear visibility into your financial activity.
- **Transaction Records**: Automatic logging of all transactions to provide a complete financial overview.

## Technologies Used

- **Java AWT & Swing**: For creating a rich graphical user interface that enhances user experience.
- **MySQL JDBC**: For connecting the application to a MySQL database, allowing for secure and efficient data management.

## Getting Started

1. **Installation**: Clone the repository and ensure you have Java and MySQL set up on your machine.
2. **Database Setup**: Create a MySQL database and import the provided SQL script to set up the required tables.
3. **Run the Application**: Execute the main class to start the Bank Management System and follow the on-screen instructions.

---

Feel free to customize this text further based on your project's specifics or any additional features you want to highlight!

## Cloning the ATM System Project

To clone the project and get started with the development or customization of this ATM Management System, follow these steps:

### Prerequisites:
1. **Git**: Ensure Git is installed on your system. If not, download and install it from [Git Official Site](https://git-scm.com/).
2. **Java JDK**: The project is built using Java. Make sure you have JDK 8 or higher installed.
3. **NetBeans IDE** (or any Java IDE): This project is developed in NetBeans, but you can use any Java-compatible IDE like IntelliJ IDEA or Eclipse.
4. **MySQL**: The project uses MySQL as the database. Install and configure MySQL server.

### Steps to Clone the Repository:

1. **Open Git Bash or Terminal**: Navigate to the directory where you want to clone the project.
   
2. **Clone the Repository**: Use the following command to clone the project from GitHub:
   ```bash
   git clone https://github.com/ukumar0/Bank_Management
   ```

3. **Navigate to the Project Directory**:
   ```bash
   cd Bank_Management/ATMAddition
   ```

4. **Open the Project in Your IDE**:
   - **NetBeans**:
     - Open NetBeans.
     - Click on `File > Open Project`.
     - Navigate to the cloned `ATM-System` directory and open the project.

   - **Other IDEs**:
     - You can import the project as a Maven or standard Java project based on your IDE’s settings.

### Configuring the Database:

1. **Create a Database**:
   - Open MySQL Workbench or use the MySQL command line.
   - Create a new database with the following command:
     ```sql
     CREATE DATABASE atm_management;
     ```

2. **Import the Database Tables**:
   - In the project’s root directory, you’ll find an SQL file (`atm_management.sql`).
   - Import this file into the database using the following command in MySQL Workbench or terminal:
     ```sql
     SOURCE /path-to-the-cloned-project/atm_management.sql;
     ```

3. **Configure Database Connection**:
   - Open the `Conn.java` file located in the project.
   - Modify the `JDBC` connection details (URL, username, password) to match your local MySQL setup.

     Example:
     ```java
     String url = "jdbc:mysql://localhost:3306/atm_management";
     String username = "root";
     String password = "your-password";
     ```

### Running the Project:

1. Once the project is set up in your IDE, you can run the project by running the `Main.java` class or any of the specific feature classes (e.g., `Signup`, `Login`, `Fastcash`, `MiniStatement`, etc.).
   
2. The ATM system will launch, and you can test various features, including signing up, checking balances, viewing mini statements, etc.

### Additional Setup:

- **UI Assets**: Ensure the `icons` folder (containing ATM images and icons) is correctly linked in the project. The assets are used in the UI for a rich graphical experience.
  
- **Build and Compile**: Use your IDE’s build tools to compile and run the project. You may need to resolve any dependencies based on your environment setup.

This setup guide will help you get started with customizing and running the ATM system locally!