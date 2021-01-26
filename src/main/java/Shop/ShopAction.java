package Shop;

import Buyer.Buyer;
import Product.Product;

import java.util.List;
import java.util.Map;

public interface ShopAction {
    boolean registration(Buyer buyer);

    List<Product> getProductList();

    void addProductsToBasket(List<Product> products);

    List<Product> giveProductsToUser();

    int sell(List<Product> products);
}
