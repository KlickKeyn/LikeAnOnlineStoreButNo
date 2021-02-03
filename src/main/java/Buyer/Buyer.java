package Buyer;

import Product.Product;

import java.util.ArrayList;
import java.util.List;

import static Utils.RandomUtil.rnd;
import static Utils.arrayAction.returnObjectOfArrayName;

public class Buyer extends BuyerAbstract {

    public Buyer(int money) {
        super(money);
    }

    @Override
    public void addToBasket(List<Product> products) {
        List<Product> bufferProductsList = new ArrayList<Product>();

        products.forEach(product -> {
            boolean flag = basket.stream().anyMatch(productInBasket -> productInBasket.getName().equals(product.getName()));
            if (flag) {
                bufferProductsList.add(product);
                product.setCnt(product.getCnt() + returnObjectOfArrayName(basket, product.getName()).getCnt());
            } else {
                bufferProductsList.add(product);
            }
        });

        basket.forEach(productInBasket -> {
            if (bufferProductsList.stream().noneMatch(productInBuffer -> productInBuffer.getName().equals(productInBasket.getName()))) {
                bufferProductsList.add(productInBasket);
            }
        });

        basket = bufferProductsList;
    }

    @Override
    public List<Product> chooseProducts(List<Product> productList) {
        List<Product> likedProducts = new ArrayList<Product>();
        Product likedProduct;

        for (Product product : productList) {
            int rollOfTheDice = rnd(0, 100);
            if (rollOfTheDice > 50) {
                likedProduct = product; // ты копируешь ссылку туть
                likedProduct.setCnt(rnd(1, 2));
                likedProducts.add(likedProduct);
            }
        }

        return likedProducts;
    }
}
