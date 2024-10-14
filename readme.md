## MiniStatement Feature

The *MiniStatement* feature in this ATM system allows users to quickly view their recent transactions and account details. Designed for ease and efficiency, the feature provides a summarized statement of all recent withdrawals and deposits. The card number is partially masked for security, displaying only the first and last few digits. 

Through a user-friendly graphical interface built using Java Swing, users can check their account activities at a glance, while all the interactions are securely processed through a connected SQL database.

This feature ensures that users stay informed about their financial transactions without the need for a full bank statement, adding convenience and transparency to the ATM experience.

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
   git clone https://github.com/your-username/ATM-System.git
   ```

3. **Navigate to the Project Directory**:
   ```bash
   cd ATM-System
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