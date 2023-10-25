/**
 * Abstract class to serve as the base for various decorators for the ShoppingCart class.
 */
public abstract class ShoppingCartDecorator extends ShoppingCart {

    /**
     * The ShoppingCart instance that this decorator wraps.
     */
    protected ShoppingCart cart;

    /**
     * Constructor to initialize the decorator with a ShoppingCart instance.
     *
     * @param cart The ShoppingCart instance to wrap.
     */
    public ShoppingCartDecorator(ShoppingCart cart) {
        this.cart = cart;
    }

    /**
     * Gets the discount status of the wrapped ShoppingCart.
     *
     * @return An array of booleans indicating which discounts have been applied.
     */
    @Override
    public boolean[] getDiscountStatus() {
        return this.cart.getDiscountStatus();
    }

    /**
     * Sets the discount status for the wrapped ShoppingCart.
     *
     * @param status An array of booleans indicating which discounts to apply.
     */
    @Override
    public void setDiscountStatus(boolean[] status) {
        this.cart.setDiscountStatus(status);
    }

    /**
     * Gets the delivery fee of the wrapped ShoppingCart.
     *
     * @return The amount set as the delivery fee.
     */
    @Override
    public double getDeliveryFee() {
        return this.cart.getDeliveryFee();
    }

    /**
     * Gets the net price of the wrapped ShoppingCart.
     *
     * @return The final cost after applying all discounts and fees.
     */
    @Override
    public double getNetPrice() {
        return this.cart.getNetPrice();
    }

    /**
     * Calculates the total price of items in the wrapped ShoppingCart.
     *
     * @return The total cost of items in the cart.
     */
    @Override
    public double calculateTotal() {
        return this.cart.calculateTotal();
    }
}
