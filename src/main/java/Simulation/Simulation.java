package Simulation;

import Buyer.Buyer;
import DataBase.DataBase;
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
        DataBase dataBase = new DataBase();

        Shop shop = new Shop(100, loader, dataBase);

        shop.registration(buyer);

        List<Product> productList = shop.getProductList();
        List<Product> productListLiked = buyer.chooseProducts(productList);
    }
}
