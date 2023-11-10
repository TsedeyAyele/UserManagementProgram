# User Management Application console

This is a console application for managing a list of users.
It allows you to add, remove, search for, sort and list users.

## How to run the code

1. Pull the code from GitHub
2. Open the project in Intellij IDEA
3. Run the`main()´ from ´org.example.Main´

## Project structure

### Main.java

This file is the entry point, where all user procedures are performed.

### UserList.java

This file stores the list of users and enables to add, remove, search, sort and list users.

### User.java

This is the model class for users.

## Clean code

This code exhibits adherence to Clean Code principles, which emphasize writing code that is easy to read, understand,
and maintain. Below is the analysis of how these principles are applied:

1. Meaningful Variable and Method Names:  
   Variable and method names are generally meaningful and self-explanatory. For example, User, UserList, and UserList
   methods have clear names that describe their purpose.

2. Small Methods:  
   The methods in the UserList class are relatively small, adhering to the "small functions" principle. For
   example, `addUser()`, `removeUser()`, `printAllUsers()`, `searchUserById()`, and `sortUsersByName()` each have a
   single, clear responsibility.

3. Comments and Documentation:  
   The code includes comments above methods explaining their purpose and parameters. This is beneficial for
   understanding the code's functionality.

4. Consistency and Formatting:
   The code follows a consistent formatting style. Indentation is used consistently, and there are spaces between method
   names and opening parentheses.
   The code also adheres to Java naming conventions, like using camelCase for method and variable names and PascalCase
   for class names.

5. Single Responsibility Principle (SRP):  
   Each method and class in the code appears to have a single, well-defined responsibility. For example, the UserList
   class manages a list of users and provides methods for adding, removing, searching, and sorting them.

6. Encapsulation:  
   The User class encapsulates the user's properties (id, name, and email) and provides access through getter methods.
   This encapsulation ensures that the internal state is controlled and only accessible through well-defined interfaces.

7. Code Reusability:  
   The code promotes reusability by encapsulating user-related functionality within the User and UserList classes. This
   allows us to easily integrate user management into other parts of the application.

8. Error Handling:  
   The code handles the case when a user is not found when trying to remove or search for a user by returning null or
   false. This is a good approach for error handling.

9. Consistent Data Structures  
   The code uses Java's ArrayList for managing lists of users, which is a suitable data structure for this purpose.

10. Separation of Concerns  
    The code separates concerns by having the User class handle user-related data and the UserList class manage the list
    of users and operations on them. This separation enhances maintainability.

11. Avoiding redundancy  
    The code effectively avoids code duplication, with methods like `printAllUsers()`, `removeUser()`,
    and `searchUserById()` reusing the common list of users.

## How to build and run the program in a Linux environment

To build and run the provided Java code on Linux with Ubuntu, you'll need to have the Java Development Kit (JDK)
installed. If it's not already installed, you can install it using the following commands:

1. Update the package repository:  
   `sudo apt update`
2. Install the default JDK package (OpenJDK), if you do not have it installed:  
   `sudo apt install default-jdk`
3. Once the JDK is installed: Create a directory for the Java project and navigate to it in the terminal.  
   `mkdir UserManagementProgram`  
   `cd UserManagementProgram`
4. Create a directory structure to match your Java package structure.  
   `mkdir MyPackage`
5. Create files: Main.java, User.java and UserList.java, using `nano` command. Then copy their respective codes to the
   files.  
   `nano Main.java`  
   `nano User.java`  
   `nano UserList.java`
6. Compile the code using the javac command. Make sure you're inside the UserManagementProgram directory:  
   `javac MyPackage/Main.java MyPackage/User.java MyPackage/UserList.java`
7. Execute the program by running the Main class  
   `java MyPackage.Main`

As another option, to navigate to the directory and run a program saved on our computer with Ubuntu/Linux:

1. Navigate to the directory:
   cd /mnt/c/Users/46738/Documents/GitHub/UserManagementProgram/src/main/java/org/example
2. Compile the java code using the `javac` command
   `javac Main.java User.java UserList.java`
3. Run the program
   `java org.example.Main`

Finally, the program will execute and the output will be shown on the terminal.