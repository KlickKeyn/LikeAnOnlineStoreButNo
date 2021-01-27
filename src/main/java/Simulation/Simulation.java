package Simulation;

import Buyer.Buyer;
import Product.Product;
import Shop.Shop;
import StallsLoad.Loader;
import StallsLoad.StallsLoader;

import java.util.List;

import static Utils.ActionsWithProducts.showProducts;


public class Simulation {

    public static void simulate() {
        Buyer buyer = new Buyer(1500);
        Loader loader = new StallsLoader();
        Shop shop = new Shop(100, loader);

        shop.registration(buyer); // больше логики для этого метода. Магазин должен распознавать покупателей

        List<Product> productList = shop.getProductList();
        List<Product> likedProducts = buyer.chooseProducts(productList);
        shop.addProductsToBasket(likedProducts);
        List<Product> usersProducts = shop.giveProductsToUser();
        int totalPrice = shop.sell(usersProducts);

        // вытекла абстакция, сука
        boolean isBuy = buyer.buyProducts(totalPrice);
        if (isBuy) {
            buyer.addToBasket(usersProducts);
            showProducts(usersProducts);
        }

    }
}
