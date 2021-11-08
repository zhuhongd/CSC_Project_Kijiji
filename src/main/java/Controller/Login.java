package src.main.java.Controller;

import src.main.java.Use_cases.*;

import java.io.IOException;

public class Login {


    public static boolean signup(String username, String password) throws IOException {
        return UserManager.createUser(username, password);
    }

    public static boolean login(String username, String password) throws IOException, ClassNotFoundException{
        UserReadWriter.SaveIntoFile(UserManager.getUserList());
        return UserManager.login(username, password);
    }

    public static void logout() throws IOException {
        UserReadWriter.SaveIntoFile(UserManager.getUserList());
        //ItemReadWriter.saveIntoFile(ItemManager.getItems());
        //OrderReadWriter.saveIntoFile(OrderManager.getItems());
    }
}

