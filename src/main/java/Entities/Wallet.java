package src.main.java.Entities;

import java.io.Serializable;

public class Wallet implements Serializable {
    private double money;

    public Wallet(double money){
        this.money = money;
    }

    public Wallet(){
        this.money = 0.0;
    }

    public double getMoney() {
        return this.money;
    }

    public void loadMoney(double money){
        this.money += money;
    }

    public void subtractMoney(double money){
        this.money = Math.round((this.money - money) * 100.0)/100.0;
    }
}
