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

    public boolean buyProducts(int money) {
        if (money > this.money) {
            System.out.println("Бля, сука, я бомж нахуй");
            return false;
        } else {
            this.money -= money;
            System.out.println("Я купиль, я ни бомж");
            System.out.println(this.money);
            return true;
        }
    }

    public List<Product> getBasketContens() {
        return basket;
    }

    public abstract void addToBasket(List<Product> products);

    public abstract List<Product> chooseProducts(List<Product> productList);
}
