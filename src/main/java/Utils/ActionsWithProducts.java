package Utils;

import Product.Product;

import java.util.List;

public class ActionsWithProducts {
    public static void showProducts(List<Product> products) {
        for (Product product : products) {
            System.out.println(product.getName() + ": " + product.getCnt());
        }
    }
}
