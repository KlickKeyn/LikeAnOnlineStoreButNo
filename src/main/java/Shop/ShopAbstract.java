package Shop;

import Buyer.Buyer;
import Product.Product;

import java.util.ArrayList;
import java.util.List;

public abstract class ShopAbstract implements ShopAction {
    protected int money;
    protected List<Product> stall;

    public ShopAbstract(int money) {
        this.money = money;
        stall = new ArrayList<Product>();
        loadProductsOnStalls(stall);
    }

    public abstract boolean registration(Buyer buyer);

    public abstract List<Product> getProductList();

    public abstract void addProductsToBasket(List<Product> products);

    public abstract List<Product> giveProductsToUser();

    public abstract int sell(List<Product> products);

    protected abstract void loadProductsOnStalls(List<Product> stall);
}
