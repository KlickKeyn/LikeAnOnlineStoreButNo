package Shop;

import Buyer.Buyer;
import Product.Product;
import StallsLoad.StallsLoader;

import java.util.ArrayList;
import java.util.List;

public class Shop extends ShopAbstract {
    List<Product> userBasket;

    public Shop(int money) {
        super(money);
    }

    public boolean registration(Buyer buyer) {
        userBasket = new ArrayList<Product>();
        return true;
    }

    public List<Product> getProductList() {
        return stall;
    }

    public void addProductToBasket(Product product) {
        userBasket.add(product);
    }

    public List<Product> giveProductsToUser() {
        return userBasket;
    }
    public int pay(List<Product> products) {
//        for (int i = 0; i < products.size(); i++) {
//            products
//        }
        return 0;
    }

    public void loadProductsOnStalls(List<Product> stall) {
        StallsLoader.load(stall);
    }
}
