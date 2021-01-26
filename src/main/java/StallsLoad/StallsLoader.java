package StallsLoad;

import Product.Product;

import java.util.ArrayList;
import java.util.List;

public class StallsLoader {
    private static List<String> crtProductList() {
        List<String> productNames = new ArrayList<String>();
        productNames.add("Картоха");
        productNames.add("Презики");
        productNames.add("Мазик");
        productNames.add("Сало");
        productNames.add("Яички");
        productNames.add("Мясо");

        return productNames;
    }

    private static int rnd(int min, int max)
    {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

    public static void load(List<Product> stall) {
        List<String> productNames = crtProductList();
        for (String name : productNames) {

            Product product = new Product(name, rnd(10, 20), rnd(100, 500));
            stall.add(product);
        }
    }
}
