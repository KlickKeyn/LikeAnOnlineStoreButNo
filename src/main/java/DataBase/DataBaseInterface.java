package DataBase;

import Buyer.Buyer;
import Product.Product;

import java.util.List;
import java.util.Map;

public interface DataBaseInterface {
    void add(Map.Entry<Integer, Buyer> user);

    void remove(int id);

    List<Product> getUserBasket(int id);

    void addToUserBasket(int id, List<Product> products);
}
