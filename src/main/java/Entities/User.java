package src.main.java.Entities;

import java.io.Serializable;

public class User implements Serializable {

    private String name;
    private String password;
    private final Wallet wallet;
    private final Cart cart;

    /**
     * First constructor for User class
     * @param name name of the User account
     * @param password password of the User account
     */
    public User(String name, String password){
        this.name = name;
        this.wallet = new Wallet();
        this.password = password;
        this.cart = new Cart();
    }

    /**
     * Create another constructor for invited customers, they have some money after they create account.
     * @param name name of the User account
     * @param password password of the User account
     * @param daddymoney The reward money be added to invited customers' account
     */
    public User(String name, String password, double daddymoney){
        this.name = name;
        this.wallet = new Wallet(daddymoney);
        this.password = password;
        this.cart = new Cart();
    }

    /**
     * Change the User's name by using changeName
     * @param new_name The new name of the User account
     */
    public void changeName(String new_name){
        this.name = new_name;
    }

    /**
     * Change the current password by using setPassword
     * @param new_password The new password of the User account
     */
    public void setPassword(String new_password){
        this.password = new_password;
    }

    /**
     * A get method that get the User's current name
     * @return a string representing the name of the User
     */
    public String getName(){
        return this.name;
    }

    /**
     * Check the amount of the money in the user's wallet
     * @return a type double representing the money
     */
    public Wallet getWallet(){
        return this.wallet;
    }

    /**
     * Produce a human-readable version representing the user.
     * @return a string representing the user.
     */
    @Override
    public String toString() {
        return getName();
    }

    /**
     * A get method that get the User's cart.
     * @return The user's cart (Cart object).
     */
    public Cart getCart(){
        return this.cart;
    }

    /**
     * A get method that get the User's password.
     * @return a string representing the password of the User
     */
    public String getPassword(){
        return this.password;
    }
}

