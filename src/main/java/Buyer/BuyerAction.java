package Buyer;

import java.util.HashMap;
import java.util.Map;

public interface BuyerAction {
    void setMoney(int money);

    int getMoney();

    Map<String, Integer> getBasketContens();

    void addToBasket(Map.Entry<String, Integer> product);
}
