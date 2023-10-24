public class DiscountByPercentDecorator extends ShoppingCartDecorator {
    private double percentage;

    public DiscountByPercentDecorator(ShoppingCart cart, double percentage) {
        super(cart);
        this.percentage = percentage;

        
    }

    @Override
    public double getNetPrice() {
        return cart.deliveryFee + (cart.calculateTotal() * (1 - percentage / 100));
    }
}