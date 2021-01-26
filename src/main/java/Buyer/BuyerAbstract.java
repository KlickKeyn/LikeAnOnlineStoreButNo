package Buyer;

import java.util.HashMap;
import java.util.Map;

public abstract class BuyerAbstract implements BuyerAction {
    private int money;
    protected Map<String, Integer> basket;

    public BuyerAbstract(int money) {
        basket = new HashMap<String, Integer>();
        this.money = money;

    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public Map<String, Integer> getBasketContens() {
        return basket;
    }

    public abstract void addToBasket(Map.Entry<String, Integer> product);
}
