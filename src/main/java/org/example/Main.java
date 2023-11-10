package org.example;

public class Main {
    public static void main(String[] args) {

        UserList userList = getUserList();

        System.out.println("All Users: \n" + userList.printAllUsers());
        System.out.println("---------");

        System.out.println("Add a new user:");
        User user6 = new User(6, "Diana", "diana@gmail.com");
        userList.addUser(user6);
        System.out.println("New user added successfully!\n" +
                "Updated user list after adding User6:\n" +
                (userList.printAllUsers()));
        System.out.println("---------");

        System.out.println("Remove user with id - 1:");
        int idToRemove = 1;
        if (userList.removeUser(idToRemove)) {
            System.out.println("User with ID " + idToRemove + " removed." + "\n");
        } else {
            System.out.println("User with ID " + idToRemove + " not found.");
        }

        System.out.println("All Users after removal:\n" +
                (userList.printAllUsers()));
        System.out.println("---------");

        int idToSearch = 2;
        System.out.println("Search user with id - 2:");
        User searchedUser = userList.searchUserById(idToSearch);

        if (searchedUser != null) {
            System.out.println("User found!\n" + "User name: " + searchedUser.getName() + ", " + "email: " + searchedUser.getEmail());

        } else {
            System.out.println("User not found.");

        }
        System.out.println("---------");

        System.out.println("Sort users by name: \n" + userList.sortUsersByName());

    }

    private static UserList getUserList() {
        UserList userList = new UserList();

        User user1 = new User(1, "John", "john@gmail.com");
        User user2 = new User(2, "Michael", "michael@gmail.com");
        User user3 = new User(3, "Steve", "steve@gmail.com");
        User user4 = new User(4, "Helen", "helen@gmail.com");
        User user5 = new User(5, "Anna", "anna@gmail.com");

        userList.addUser(user1);
        userList.addUser(user2);
        userList.addUser(user3);
        userList.addUser(user4);
        userList.addUser(user5);

        return userList;

    }
}