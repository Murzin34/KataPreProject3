package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        List<User> userList = new ArrayList<>();

        Util.getConnection();
        userService.createUsersTable();

        userService.saveUser("Ivan1", "Ivanov2", (byte) 21);

        userList = userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
