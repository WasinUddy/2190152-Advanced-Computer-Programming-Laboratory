public class App {
    public static void main(String[] args) {
        // Create a shopping cart
        ShoppingCart cart = new ShoppingCart();

        // Add items to the cart
        cart.addItem("Item1:2:50.0"); // net price is 100.0
        cart.addItem("Item2:1:30.0"); // net price is 130.0

        // Add delivery fee
        cart.addDeliveryFee(10); // Add a $10 delivery fee

        System.out.println("Delivery fee expected: 10.0");
        System.out.println("Delivery fee: " + cart.deliveryFee + "\n"); // 10.0

        
        // Print the net price
        System.out.println("Net price before discount expected: 140.0 (100 + 30 + 10)");
        System.out.println("Net price: " + cart.getNetPrice() + "\n"); // 140.0
        
        // Add a 10% discount
        cart = new DiscountByPercentDecorator(cart, 10); 
        System.out.println("Net price after 10% discount expected: 127.0 (130 * 0.9 + 10)");
        System.out.println("Net price: " + cart.getNetPrice() + "\n");
        

        // Add free delivery
        cart = new FreeDeliveryDecorator(cart);
        System.out.println("Net price after free delivery expected: 117.0 (127 - 10)");
        System.out.println("Net price: " + cart.getNetPrice() + "\n");

        // Calculate and display the total price and net price
        double total = cart.calculateTotal();
        double netPrice = cart.getNetPrice();
        System.out.println("Total Price: $" + total);
        System.out.println("Net Price: $" + netPrice);
        
    }
}
