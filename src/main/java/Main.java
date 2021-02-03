import Buyer.Buyer;
import Buyer.BuyerAction;
import DataBase.DataBase;
import Product.Product;
import Simulation.Simulation;
import DataBase.DataBaseInterface;

import java.util.ArrayList;
import java.util.List;

import static Utils.arrayAction.returnObjectOfArrayName;

public class Main {
    public static void main(String[] args) {
        BuyerAction buyer1 = new Buyer(1000);
        Product product1 = new Product("df", 3, 34);
        Product product2 = new Product("dgsfghdf", 5, 3456);
        Product product3 = new Product("def", 1, 34);

        List<Product> productList = new ArrayList<Product>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        buyer1.addToBasket(productList);

        product1 = new Product("df", 2, 34);
        product2 = new Product("dtytttrr5f", 1, 456);

        List<Product> productList2 = new ArrayList<Product>();
        productList2.add(product1);
        productList2.add(product2);

        buyer1.addToBasket(productList2);

        Product p = returnObjectOfArrayName(productList, "ddf");

        System.out.println();
    }
}
