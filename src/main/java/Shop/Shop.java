package Shop;

import Buyer.BuyerAction;
import DataBase.DataBase;
import Product.Product;
import StallsLoad.Loader;
import java.util.List;

public class Shop extends ShopAbstract {
    public Shop(int money, Loader loader, DataBase dataBase) {
        super(money, loader, dataBase);
    }

    public boolean registration(BuyerAction buyer) {
        dataBase.addUser(buyer);
        return true;
    }

    public List<Product> getProductList() {
        return stall;
    }

    public void addProductsToBasket(BuyerAction buyer, List<Product> products) {
        dataBase.addToUserBasket(buyer, products);
    }

    public List<Product> sell(BuyerAction buyer) {
        int sum;
        List<Product> basket = dataBase.getUserBasket(buyer);

        sum = basket.stream().mapToInt(product -> product.getPrice() * product.getCnt()).sum();
        int buyerMoney = buyer.getMoney();
        if (buyerMoney - sum >= 0) {
            money += sum;
            buyer.setMoney(buyerMoney - sum);
            System.out.println("Покупатель красавчик, бабки есть");
            return basket;
        }

        System.out.println("Покупатель бомжара дырявый, бабок нет");
        return null;
    }

}
