package StallsLoad;

import Product.Product;

import java.util.ArrayList;
import java.util.List;

import static Utils.RandomUtil.rnd;

// добавить интерфейс, так как загрузчиков может быть много
public class StallsLoader implements Loader{
    private List<String> crtProductList() {
        List<String> productNames = new ArrayList<>(); // заюзать List.of
        productNames.add("Картоха");
        productNames.add("Презики");
        productNames.add("Мазик");
        productNames.add("Сало");
        productNames.add("Яички");
        productNames.add("Мясо");

        return productNames;
    }

    // переписать на функцию
    public List<Product> load() {
        List<Product> stall = new ArrayList<Product>();

        List<String> productNames = crtProductList();
        for (String name : productNames) {
            Product product = new Product(name, rnd(10, 20), rnd(100, 500));
            stall.add(product);
        }

        return stall;
    }
}
