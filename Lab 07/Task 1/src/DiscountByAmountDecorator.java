/**
 * DiscountByAmountDecorator class to provide a fixed amount discount to the ShoppingCart.
 */
public class DiscountByAmountDecorator extends ShoppingCartDecorator {

    /**
     * The fixed amount to be discounted.
     */
    private double amount;

    /**
     * Flag to indicate whether the fixed amount discount is active.
     */
    private boolean active;

    /**
     * Constructor to initialize the decorator with a ShoppingCart instance and a fixed discount amount.
     *
     * @param cart  The ShoppingCart instance to wrap.
     * @param amount The fixed discount amount to be applied.
     */
    public DiscountByAmountDecorator(ShoppingCart cart, double amount) {
        super(cart);
        this.amount = amount;

        // Check if a fixed discount is already active
        boolean[] status = cart.getDiscountStatus();
        
        // If a fixed discount is not active, set it to active
        this.active = !status[1];
        
        // Update the discount status to indicate that a fixed discount is now active
        status[1] = true;
        this.cart.setDiscountStatus(status);
    }

    /**
     * Gets the net price after applying the fixed amount discount, if active.
     *
     * @return The final cost after applying all discounts and fees, including fixed amount discount if active.
     */
    @Override
    public double getNetPrice() {
        // If the fixed discount is not active, return the original net price
        if (!this.active) {
            return this.cart.getNetPrice();
        }

        // Calculate and return the net price after applying the fixed discount
        return this.cart.getNetPrice() - this.amount;
    }
}
