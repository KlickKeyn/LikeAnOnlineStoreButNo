package Shop;

import Buyer.Buyer;
import Product.Product;

import java.util.List;
import java.util.Map;

public interface ShopAction {
    boolean registration(Buyer buyer);

    List<Product> getProductList();

    void addProductToBasket(Product product);

    List<Product> giveProductsToUser();

    int pay(List<Product> products);

    void loadProductsOnStalls(List<Product> stall);
}
