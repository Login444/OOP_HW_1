package org.example;

import java.util.ArrayList;


public class User extends Basket{
    private String login;
    private Integer password;
    private Basket purchase;



    public User(String login, Integer password, Basket purchase1) {
        this.login = login;
        this.password = password;
        this.purchase = purchase1;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Integer getPassword() {
        return password;
    }

    public void setPassword(Integer password) {
        this.password = password;
    }

    @Override
    public Basket getPurchase() {
        return purchase;
    }

    public void setPurchase(Basket purchase) {
        this.purchase = purchase;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password=" + password +
                ", purchase=" + purchase +
                '}';
    }

    public void printUserPurchase(){
        System.out.println();
        System.out.println(login);
        for (int i = 0; i < purchase.size(); i++) {
            System.out.println(purchase.get(i));
        }
    }

}
