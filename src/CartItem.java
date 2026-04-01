public class CartItem {

    // 속성
    private Product product;
    private int quantity;

    // 생성자
    public CartItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    // 기능
    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;

    }


}
