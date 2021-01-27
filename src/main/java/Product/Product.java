package Product;

public class Product {
    private String name;
    private int cnt;
    private int price;

    public Product(String name, int cnt, int price) {
        this.name = name;
        this.cnt = cnt;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getCnt() {
        return cnt;
    }

    public int getPrice() {
        return price;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
