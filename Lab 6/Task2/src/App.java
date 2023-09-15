public class App {
    public static void main(String[] args) {
        App app = new App();
        System.out.println("Testing Discount Strategies");
        System.out.println("TOTAL PRICE : 60");
        System.out.println("EXPECTED PRICE AFTER 10% DISCOUNT : 54");
        System.out.println("EXPECTED PRICE AFTER $10 DISCOUNT : 50");
        System.out.println("|");
        System.out.println("Testing PercentageDiscountStrategy 10%");
        System.out.print("ProgramOutput : ");
        System.out.println(app.testPercentageDiscountStrategy());
        System.out.println("|");
        System.out.println("Testing FixedDiscountStrategy $10");
        System.out.print("ProgramOutput : ");
        System.out.println(app.testFixedDiscountStrategy());
    }

    public ShoppingCart createSampleCart() {
        // Total OG price = 10 * 3 + 5 * 2 + 20 * 1 = 60
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(new Item("Apple|10|3"));
        cart.addItem(new Item("Orange|5|2"));
        cart.addItem(new Item("Banana|20|1"));
        return cart;
    }

    public double testPercentageDiscountStrategy() {
        ShoppingCart cart = createSampleCart();
        cart.setDiscountStrategy(new PercentageDiscountStrategy(10));
        return cart.calculateTotal();
    }

    public double testFixedDiscountStrategy() {
        ShoppingCart cart = createSampleCart();
        cart.setDiscountStrategy(new FixedDiscountStrategy(10));
        return cart.calculateTotal();
    }
}