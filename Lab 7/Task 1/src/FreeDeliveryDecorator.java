/**
 * FreeDeliveryDecorator class to provide free delivery functionality to the ShoppingCart.
 */
public class FreeDeliveryDecorator extends ShoppingCartDecorator {

    /**
     * Flag to indicate whether the free delivery discount is active.
     */
    private boolean active;

    /**
     * Constructor to initialize the decorator with a ShoppingCart instance.
     *
     * @param cart The ShoppingCart instance to wrap.
     */
    public FreeDeliveryDecorator(ShoppingCart cart) {
        super(cart);

        // Check if free delivery is already active
        boolean[] status = cart.getDiscountStatus();
        
        // If free delivery is not active, set it to active
        this.active = !status[2];
        
        // Update the discount status to indicate that free delivery is now active
        status[2] = true;
        this.cart.setDiscountStatus(status);
    }

    /**
     * Gets the net price after applying the free delivery, if active.
     *
     * @return The final cost after applying all discounts and fees, including free delivery if active.
     */
    @Override
    public double getNetPrice() {
        // If free delivery is not active, return the original net price
        if (!this.active) {
            return this.cart.getNetPrice();
        }
        
        // If free delivery is active, subtract the delivery fee from the net price
        return this.cart.getNetPrice() - this.cart.getDeliveryFee();
    }
}
