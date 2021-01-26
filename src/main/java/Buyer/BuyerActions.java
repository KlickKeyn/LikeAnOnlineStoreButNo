package Buyer;

import java.util.HashMap;

public interface BuyerActions {
    void setMoney(int money);

    int getMoney();

    HashMap<String, Integer> getBasketContens();

    void addToBasket(HashMap<String, Integer> products);
}
