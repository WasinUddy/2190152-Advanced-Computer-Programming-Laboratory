import java.util.ArrayList;
import java.util.List;

/**
 * ShoppingCart class to manage a simple shopping cart.
 */
public class ShoppingCart {

    /**
     * List to hold items in the cart in the format "ItemName:Quantity:Price".
     */
    private List<String> items;

    /**
     * Variable to hold the delivery fee.
     */
    private double deliveryFee;

    /**
     * Flags to track if a specific type of coupon has been applied.
     * [Percentage, Fixed, Free Delivery]
     */
    private boolean[] discountStatus;

    /**
     * Constructor to initialize the shopping cart.
     */
    public ShoppingCart() {
        this.items = new ArrayList<>();
        this.discountStatus = new boolean[] {false, false, false};
    }

    /**
     * Method to add an item to the cart.
     *
     * @param item Item to be added in the format "ItemName:Quantity:Price".
     */
    public void addItem(String item) {
        this.items.add(item);
    }

    /**
     * Method to calculate the total price of items in the cart.
     *
     * @return The total cost of items in the cart.
     */
    public double calculateTotal() {
        double total = 0.0;
        
        // Loop through each item in the cart.
        for (String item : items) {
            String[] parts = item.split(":");
            double quantity = Double.parseDouble(parts[1]);
            double price = Double.parseDouble(parts[2]);
            
            // Calculate total cost for each item and add to the total.
            total += quantity * price;
        }
        
        return total;
    }

    /**
     * Setter for updating the discount status.
     *
     * @param status An array of booleans indicating which discounts have been applied.
     */
    public void setDiscountStatus(boolean[] status) {
        this.discountStatus = status;
    }

    /**
     * Getter for retrieving the current discount status.
     *
     * @return An array of booleans indicating which discounts have been applied.
     */
    public boolean[] getDiscountStatus() {
        return this.discountStatus;
    }

    /**
     * Method to add a delivery fee.
     *
     * @param fee The amount to be added as a delivery fee.
     */
    public void addDeliveryFee(int fee) {
        this.deliveryFee = fee;
    }

    /**
     * Getter for the delivery fee.
     *
     * @return The amount set as the delivery fee.
     */
    public double getDeliveryFee() {
        return this.deliveryFee;
    }

    /**
     * Method to calculate the net price after all discounts and delivery fees.
     *
     * @return The final cost after applying all discounts and fees.
     */
    public double getNetPrice() {
        return calculateTotal() + this.deliveryFee;
    }
}
