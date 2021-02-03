package Shop;

import DataBase.DataBase;
import Product.Product;
import StallsLoad.Loader;

import java.util.List;

public abstract class ShopAbstract implements ShopAction {
    protected int money;
    protected List<Product> stall;
    protected Loader loader;
    protected DataBase dataBase;

    public ShopAbstract(int money, Loader loader, DataBase dataBase) {
        this.money = money;
        this.loader = loader;
        this.dataBase = dataBase;

        stall = this.loader.load();
    }
}
