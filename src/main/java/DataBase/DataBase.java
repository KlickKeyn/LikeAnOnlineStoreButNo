package DataBase;

import Buyer.BuyerAction;
import Product.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataBase implements DataBaseInterface {
    private Map<Integer, BuyerAction> usersBase;
    private Map<Integer, List<Product>> usersBaskets;
    private int newId = 1;

    public DataBase() {
        usersBase = new HashMap<>();
        usersBaskets = new HashMap<Integer, List<Product>>();
    }


    @Override
    public void addUser(BuyerAction user) {
        user.setId(newId);
        usersBase.put(newId, user);

        usersBaskets.put(newId, new ArrayList<>());

        newId++;
    }

    @Override
    public void remove(BuyerAction user) {
        usersBase.remove(user.getId(), user);
    }

    @Override
    public List<Product> getUserBasket(BuyerAction user) {
        return usersBaskets.get(user.getId());
    }

    @Override
    public void addToUserBasket(BuyerAction user, List<Product> products) {

    }

    private boolean isHas(BuyerAction user) {
        return false;
    }
}
