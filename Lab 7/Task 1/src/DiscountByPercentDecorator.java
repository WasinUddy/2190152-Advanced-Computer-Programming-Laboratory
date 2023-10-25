/**
 * DiscountByPercentDecorator class to provide a percentage discount to the ShoppingCart.
 */
public class DiscountByPercentDecorator extends ShoppingCartDecorator {

    /**
     * The percentage discount to be applied.
     */
    private double percentage;

    /**
     * Flag to indicate whether the percentage discount is active.
     */
    private boolean active;

    /**
     * Constructor to initialize the decorator with a ShoppingCart instance and a percentage for the discount.
     *
     * @param cart The ShoppingCart instance to wrap.
     * @param percentage The percentage discount to be applied.
     */
    public DiscountByPercentDecorator(ShoppingCart cart, double percentage) {
        super(cart);
        this.percentage = percentage;

        // Check if a percentage discount is already active
        boolean[] status = cart.getDiscountStatus();
        
        // If a percentage discount is not active, set it to active
        this.active = !status[0];
        
        // Update the discount status to indicate that a percentage discount is now active
        status[0] = true;
        this.cart.setDiscountStatus(status);
    }

    /**
     * Gets the net price after applying the percentage discount, if active.
     *
     * @return The final cost after applying all discounts and fees, including percentage discount if active.
     */
    @Override
    public double getNetPrice() {
        // If the percentage discount is not active, return the original net price
        if (!this.active) {
            return this.cart.getNetPrice();
        }

        // Calculate and return the net price after applying the percentage discount
        return this.cart.getDeliveryFee() + (this.cart.calculateTotal() * (1 - this.percentage / 100));
    }
}
