package Utils;

import Product.Product;

import java.util.List;

public class arrayAction {
    public static Product returnObjectOfArrayName(List<Product> productList, String nameSearch) {
        return productList.stream().filter(product -> product.getName().equals(nameSearch)).findFirst().orElse(null);
    }
}
