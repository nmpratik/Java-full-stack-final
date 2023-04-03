package com.cart.user;

public class UserController {

    public void createNewUser(int id, String name) {
        int sts = UserDB.addNewUser(id, name);
        if (sts == UserDB.NO_MORE_SPACE) {
            System.out.println("\n ❌ There is no more space ");
        } else if (sts == UserDB.USER_ALREADY_EXISTS) {
            System.out.println("\n ❌ User Already Exists ");
        } else {
            System.out.println("\n ✅ User Successfully Created ");
        }
        System.out.println("\n\n\n");
    }

    public void listAllUsers() {
        User[] users = UserDB.listUsers();
        for (User user : users) {
            if (user != null) {
                System.out.println("\n 👉 Id " + user.getId() + " Name " + user.getName());
            }
        }
        System.out.println("\n\n\n");
    }

    public double totalCartPrice() {
        return 0;
    }
}
