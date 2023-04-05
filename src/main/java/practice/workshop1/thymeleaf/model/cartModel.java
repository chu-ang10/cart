package practice.workshop1.thymeleaf.model;

public class cartModel{
    String item;
    int quantity;

    public cartModel() {
    }

    public cartModel(String item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "cartModel [item=" + item + ", quantity=" + quantity + "]";
    }

    
    
}
