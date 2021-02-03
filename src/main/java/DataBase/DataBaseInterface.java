package DataBase;

import Buyer.BuyerAction;
import Product.Product;

import java.util.List;
import java.util.Map;

public interface DataBaseInterface {
    void addUser(BuyerAction user);

    void remove(BuyerAction user);

    List<Product> getUserBasket(BuyerAction user);

    void addToUserBasket(BuyerAction user, List<Product> products);
}
