public class FreeDeliveryDecorator extends ShoppingCartDecorator {
    public FreeDeliveryDecorator(ShoppingCart cart) {
        super(cart);
    }

    @Override
    public double getNetPrice() {
        return cart.getNetPrice() - cart.getDeliveryFee();
    }
}