public class Product {

    // 속성

    private String name;
    private double price;
    private int stock;

    // 생성자
    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    // 기능
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void decreaseStock(int quantity) {
        this.stock -= quantity;

    }

}
