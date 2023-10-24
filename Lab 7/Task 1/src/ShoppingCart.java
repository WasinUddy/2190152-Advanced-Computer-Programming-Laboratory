import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    public List<String> items;
    protected double deliveryFee;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addItem(String item) {
        items.add(item);
    }

    public double calculateTotal() {
        double total = 0.0;
        
        for (String item : items) {
            String[] parts = item.split(":");
            double quantity = Double.parseDouble(parts[1]);
            double price = Double.parseDouble(parts[2]);
            
            total += quantity * price;
        }
        
        return total;
    }
    

    public void addDeliveryFee(int fee) {
        this.deliveryFee = fee;
    }

    public double getDeliveryFee() {
        return deliveryFee;
    }

    public double getNetPrice() {
        return calculateTotal() + deliveryFee;
    }
}
