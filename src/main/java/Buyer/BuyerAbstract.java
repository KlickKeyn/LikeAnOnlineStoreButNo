package Buyer;

import Product.Product;

import java.util.ArrayList;
import java.util.List;

public abstract class BuyerAbstract implements BuyerAction {
    private int money;
    protected List<Product> basket;

    public BuyerAbstract(int money) {
        basket = new ArrayList<Product>();
        this.money = money;

    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public List<Product> getBasketContens() {
        return basket;
    }

    public abstract void addToBasket(List<Product> products);
}
