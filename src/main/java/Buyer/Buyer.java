package Buyer;

import java.util.HashMap;

public abstract class Buyer implements BuyerActions{
    private int money;
    private HashMap<String, Integer> basket;

    public void setMoney(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public HashMap<String, Integer> getBasketContens() {
        return basket;
    }

    public abstract void addToBasket(HashMap<String, Integer> products);
}
