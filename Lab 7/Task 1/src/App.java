/**
 * Test class to demonstrate the functionality of the ShoppingCart and its decorators.
 */
public class App {
    public static void main(String[] args) {
        // Step 1: Create a shopping cart
        ShoppingCart cart = new ShoppingCart();

        // Step 2: Add items to the shopping cart
        cart.addItem("Apple:2:50.0");  // Adding 2 apples at $50 each
        cart.addItem("Orange:1:30.0"); // Adding 1 orange at $30

        // Step 3: Add a delivery fee
        cart.addDeliveryFee(10);  // Adding a $10 delivery fee
        System.out.println("Expected Delivery fee: $10.0");
        System.out.println("Actual Delivery fee: $" + cart.getDeliveryFee() + "\n");

        // Step 4: Calculate and display the initial net price
        System.out.println("Expected Net price before any discounts: $140.0 (100 for apples + 30 for orange + 10 delivery fee)");
        System.out.println("Actual Net price: $" + cart.getNetPrice() + "\n");

        // Step 5: Apply a 10% discount using the decorator
        cart = new DiscountByPercentDecorator(cart, 10);
        System.out.println("Expected Net price after 10% discount: $127.0 ((100 + 30) * 0.9 + 10 delivery fee)");
        System.out.println("Actual Net price: $" + cart.getNetPrice() + "\n");

        // Step 6: Apply a $10 flat discount using the decorator
        cart = new DiscountByAmountDecorator(cart, 10);
        System.out.println("Expected Net price after additional $10 discount: $117.0 (127 - 10)");
        System.out.println("Actual Net price: $" + cart.getNetPrice() + "\n");

        // Step 7: Try applying another $10 discount (should be ignored due to our "one of each type" rule)
        cart = new DiscountByAmountDecorator(cart, 10);
        System.out.println("Expected Net price (no additional $10 discount should be applied): $117.0");
        System.out.println("Actual Net price: $" + cart.getNetPrice() + "\n");

        // Step 8: Apply free delivery
        cart = new FreeDeliveryDecorator(cart);
        System.out.println("Expected Net price after free delivery: $107.0 (117 - 10)");
        System.out.println("Actual Net price: $" + cart.getNetPrice() + "\n");

        // Final calculations
        double total = cart.calculateTotal();
        double netPrice = cart.getNetPrice();
        System.out.println("Final Total Price: $" + total);
        System.out.println("Final Net Price: $" + netPrice);
    }
}
