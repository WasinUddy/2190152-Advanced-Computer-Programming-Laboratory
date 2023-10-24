public class DiscountByAmountDecorator extends ShoppingCartDecorator {
    private double amount;

    public DiscountByAmountDecorator(ShoppingCart cart, double amount) {
        super(cart);
        this.amount = amount;

        
    }

    @Override
    public double getNetPrice() {
        return super.getNetPrice() - amount;
    }
}