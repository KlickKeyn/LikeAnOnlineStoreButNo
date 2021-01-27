package Shop;

import Buyer.Buyer;
import Product.Product;
import StallsLoad.Loader;

import java.util.ArrayList;
import java.util.List;

public class Shop extends ShopAbstract {
    List<Product> userBasket;

    public Shop(int money, Loader loader) {
        super(money, loader);
    }

    public boolean registration(Buyer buyer) {
        userBasket = new ArrayList<Product>();
        return true;
    }

    public List<Product> getProductList() {
        return stall;
    }

    public void addProductsToBasket(List<Product> products) {
        userBasket.addAll(products);
    }

    public List<Product> giveProductsToUser() {
        return userBasket;
    }

    public int sell(List<Product> products) {
        int summ = 0;
        for (Product product : products) {
            summ += product.getCnt() * product.getPrice();
        }
        money += summ;

        return summ;
    }

}
