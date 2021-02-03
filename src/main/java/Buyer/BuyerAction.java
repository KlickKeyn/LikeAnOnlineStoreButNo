package Buyer;

import Product.Product;

import java.util.List;

public interface BuyerAction {
    List<Product> getBasketContens();

    void addToBasket(List<Product> products);

    List<Product> chooseProducts(List<Product> productList);

    int getId();

    void setId(int id);

    int getMoney();

    void setMoney(int money);
}
