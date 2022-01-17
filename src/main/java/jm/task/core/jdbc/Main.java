package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        List<User> userList = new ArrayList<>();

        userService.createUsersTable();
        userService.saveUser("Ivan", "Ivanov", (byte) 20);
        userService.saveUser("Pavel", "Pavlov", (byte) 21);
        userService.saveUser("Petr", "Petrov", (byte) 32);
        userList = userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
