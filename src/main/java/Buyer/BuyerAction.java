package Buyer;

import Product.Product;

import java.util.List;

public interface BuyerAction {
    boolean buyProducts(int money);

    List<Product> getBasketContens();

    void addToBasket(List<Product> products);

    List<Product> chooseProducts(List<Product> productList);
}
