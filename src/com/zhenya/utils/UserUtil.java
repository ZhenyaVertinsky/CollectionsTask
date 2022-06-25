package com.zhenya.utils;

import com.zhenya.domain.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserUtil {

    public static List<User> createUsers() {

        User user1 = new User(111L, "Pasha", "Petrov", new ArrayList<>());
        User user2 = new User(222L, "Viktor", "Ivanov", new ArrayList<>());
        User user3 = new User(333L, "Oleg", "Makarov", new ArrayList<>());
        User user4 = new User(444L, "Sasha", "Nagiev", new ArrayList<>());
        User user5 = new User(555L, "Natalia", "Moroz", new ArrayList<>());

        user1.getFriends().addAll(Arrays.asList(user2, user3, user4, user5));
        user2.getFriends().addAll(Arrays.asList(user1, user3, user4, user5));
        user3.getFriends().addAll(Arrays.asList(user1, user2, user4, user5));
        user4.getFriends().addAll(Arrays.asList(user1, user2, user3, user5));
        user5.getFriends().addAll(Arrays.asList(user1, user2, user3, user4));


        return Arrays.asList(user1, user2, user3, user4, user5);
    }

    public static void printAllUsers(List<User> list, int increment) {
        int i = increment;
        for (User user : list) {
            if (!user.getFriends().isEmpty()) {
                if (i != 0) {
                    i--;
                    System.out.println(user.getName());
                    System.out.println(user.getFriends());
                    printAllUsers(user.getFriends(), i);
                }
            }
        }
    }
}