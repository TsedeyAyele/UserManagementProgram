package org.example;

import java.util.ArrayList;
import java.util.List;

public class UserList {
    public static List<User> users;

    public UserList() {
        users = new ArrayList<>();
    }

    /**
     * Adds a user to the UserList
     * @param user The user to add to the UserList
     */
    public void addUser(User user) {
        users.add(user);
    }

    /**
     * Removes one product with the specified userId
     * @param userId The product id to remove
     */
    public boolean removeUser(int userId) {
        for (User user : users) {
            if (user.getId() == userId) {
                users.remove(user);
                return true;
            }
        }
        return false;
    }

    /**
     * Prints all users
     * @return All users
     */
    public List<User> printAllUsers() {
        return users;
    }

    /**
     * Searches a user with the specified user id
     * @param idToSearch The user id to search
     * @return The found user
     */
    public User searchUserById(int idToSearch) {
        for (User user : users) {
            if (user.getId() == (idToSearch)) {
                return user;
            }
        }
        return null;
    }

    /**
     * Sorts all users by name alphabetically
     * @return Sorted list of users
     */
    public List<User> sortUsersByName() {

        for (int i = 0; i < users.size() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < users.size(); j++) {
                if (users.get(j).getName().compareTo(users.get(minIndex).getName()) < 0) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                User temp = users.get(i);
                users.set(i, users.get(minIndex));
                users.set(minIndex, temp);
            }
        }
        return users;
    }
}


