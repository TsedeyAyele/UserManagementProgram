package org.example;

public class Main {
    public static void main(String[] args) {

        UserList userList = getUserList();

        System.out.println("All Users:");
        userList.printAllUsers();
        for (User user : userList.printAllUsers()) {
            System.out.print(user);
        }

        System.out.println("_______");

        int userIdToRemove = 1;
        if (userList.removeUser(userIdToRemove)) {
            System.out.println("User with ID " + userIdToRemove + " removed." + "\n");
        } else {
            System.out.println("User with ID " + userIdToRemove + " not found.");
        }

        System.out.println("All Users after removal:");
        for (User user : userList.printAllUsers()) {
            System.out.print(user);

        }

        int idToSearch = 2;

        User searchedUser = userList.searchUserById(idToSearch);

        if (searchedUser != null) {
            System.out.println("User found\n" + searchedUser.getName() + " " + searchedUser.getEmail());

        } else {
            System.out.println("User not found.");

        }
        System.out.println("_____");

        System.out.println("Sorted users-by name: \n"+ userList.sortUsersByName());

    }

    private static UserList getUserList() {
        UserList userList = new UserList();

        User user1 = new User(1, "John", "john@gmail.com");
        User user2 = new User(2, "Michael", "michael@gmail.com");
        User user3 = new User(3, "Steve", "steve@gmail.com");
        User user4 = new User(4, "Helen", "helen@gmail.com");
        User user5 = new User(5, "Anna", "anna@gmail.com");
        User user6 = new User(6, "Diana", "diana@gmail.com");

        userList.addUser(user1);
        userList.addUser(user2);
        userList.addUser(user3);
        userList.addUser(user4);
        userList.addUser(user5);
        userList.addUser(user6);
        return userList;
    }
}