package Buyer;

import java.util.Map;

public class Buyer extends BuyerAbstract{
    public Buyer(int money) {
        super(money);
    }

    public void addToBasket(Map<String, Integer> products) {
        for (Map.Entry<String, Integer> product : products.entrySet()) {
            String productName = product.getKey();
            Integer productCnt = product.getValue();
            if (basket.containsKey(productName)) {
                Integer productCntBusket = basket.get(productName);
                basket.put(productName, productCnt + productCntBusket);
            } else {
                basket.put(productName, productCnt);
            }
        }
    }

}
