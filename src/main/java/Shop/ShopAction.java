package Shop;

import Buyer.Buyer;

import java.util.Map;

public interface ShopAction {
    boolean registration(Buyer buyer);

    Map<String, Integer> getProductList();

//    void addProductToBasket(Map.Entry<String, Integer> );
}
