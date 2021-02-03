package Shop;

import Buyer.BuyerAction;
import Product.Product;

import java.util.List;

public interface ShopAction {
    boolean registration(BuyerAction buyer);

    List<Product> getProductList();

    void addProductsToBasket(BuyerAction buyer, List<Product> products);

    List<Product> sell(BuyerAction buyer);
}
