package Shop;

import Product.Product;
import StallsLoad.Loader;

import java.util.List;

public abstract class ShopAbstract implements ShopAction {
    protected int money;
    protected List<Product> stall;
    protected Loader loader;

    public ShopAbstract(int money, Loader loader) {
        this.money = money;
        this.loader = loader;

        stall = this.loader.load();
    }
}
