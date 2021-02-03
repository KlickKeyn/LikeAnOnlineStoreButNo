package DataBase;

import Buyer.BuyerAction;
import Product.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static Utils.arrayAction.returnObjectOfArrayName;

public class DataBase implements DataBaseInterface {
    private Map<Integer, BuyerAction> usersBase;
    private Map<Integer, List<Product>> usersBaskets;
    private int newId;

    public DataBase() {
        usersBase = new HashMap<>();
        usersBaskets = new HashMap<>();
        newId = 1;
    }


    @Override
    public void addUser(BuyerAction user) {
        user.setId(newId);
        usersBase.put(newId, user);

        usersBaskets.put(newId, new ArrayList<>());

        newId++;
    }

    @Override
    public void removeUser(BuyerAction user) {
        if (isHas(user)) {
            usersBase.remove(user.getId());
            usersBaskets.remove(user.getId());
        }
    }

    @Override
    public List<Product> getUserBasket(BuyerAction user) {
        return usersBaskets.get(user.getId());
    }

    @Override
    public void addToUserBasket(BuyerAction user, List<Product> products) {
        final List<Product> basket = getUserBasket(user);

        List<Product> bufferProductsList = new ArrayList<Product>();

        products.forEach(product -> {
            boolean flag = basket.stream().anyMatch(productInBasket -> productInBasket.getName().equals(product.getName()));
            if (flag) {
                bufferProductsList.add(product);
                product.setCnt(product.getCnt() + returnObjectOfArrayName(basket, product.getName()).getCnt());
            } else {
                bufferProductsList.add(product);
            }
        });

        basket.forEach(productInBasket -> {
            if (bufferProductsList.stream().noneMatch(productInBuffer -> productInBuffer.getName().equals(productInBasket.getName()))) {
                bufferProductsList.add(productInBasket);
            }
        });

        usersBaskets.put(user.getId(), bufferProductsList);
    }

    @Override
    public void clearUserBasket(BuyerAction user) {
        usersBaskets.get(user.getId()).clear();
    }

    private boolean isHas(BuyerAction user) {
        return usersBase.containsKey(user.getId());
    }
}
