package Buyer;

import Product.Product;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface BuyerAction {
    void setMoney(int money);

    int getMoney();

    List<Product> getBasketContens();

    void addToBasket(List<Product> products);
}
