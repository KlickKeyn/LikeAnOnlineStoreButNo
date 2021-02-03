package Buyer;

import Product.Product;

import java.util.ArrayList;
import java.util.List;

public abstract class BuyerAbstract implements BuyerAction {
    private int money;
    private int id;
    protected List<Product> basket;

    public BuyerAbstract(int money) {
        basket = new ArrayList<Product>();
        this.money = money;
    }

    @Override
    public List<Product> getBasketContens() {
        return basket;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public abstract void addToBasket(List<Product> products);

    public abstract List<Product> chooseProducts(List<Product> productList);

    @Override
    public int getMoney() {
        return money;
    }

    @Override
    public void setMoney(int money) {
        this.money = money;
    }
}
