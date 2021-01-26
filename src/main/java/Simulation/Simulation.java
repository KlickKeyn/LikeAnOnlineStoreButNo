package Simulation;

import Buyer.Buyer;
import Product.Product;
import Shop.Shop;

import java.util.List;

import static Utils.ActionsWithProducts.showProducts;

public class Simulation {
    public static void Simulate() {
        Buyer buyer = new Buyer(1500);
        Shop shop = new Shop(100);

        shop.registration(buyer);

        List<Product> productList = shop.getProductList();
        List<Product> likedProducts = buyer.chooseProducts(productList);
        shop.addProductsToBasket(likedProducts);
        List<Product> usersProducts = shop.giveProductsToUser();
        int totalPrice = shop.sell(usersProducts);

        boolean buy = buyer.buyProducts(totalPrice);
        if (buy) {
            buyer.addToBasket(usersProducts);
            showProducts(usersProducts);
        }

    }
}
