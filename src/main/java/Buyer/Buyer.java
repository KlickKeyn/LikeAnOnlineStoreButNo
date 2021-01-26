package Buyer;

import Product.Product;

import java.util.ArrayList;
import java.util.List;

import static Utils.RandomUtil.rnd;

public class Buyer extends BuyerAbstract{
    public Buyer(int money) {
        super(money);
    }

    public void addToBasket(List<Product> products) {
        boolean added = false;

        for (Product product : products) {
            for (Product usersProduct : basket) {
                if (product.getName().equals(usersProduct.getName())) {
                    usersProduct.setCnt(usersProduct.getCnt() + product.getCnt());
                    added = true;
                }
            }
            if (!added) {
                basket.add(product);
            }
            added = false;
        }
    }

    public List<Product> chooseProducts(List<Product> productList) {
        List<Product> likedProducts = new ArrayList<Product>();
        Product likedProduct;

        for (Product product : productList) {
            int rollOfTheDice = rnd(0, 100);
            if (rollOfTheDice > 50) {
                likedProduct = product;
                likedProduct.setCnt(rnd(1, 2));
                likedProducts.add(likedProduct);
            }
        }

        return likedProducts;
    }
}
