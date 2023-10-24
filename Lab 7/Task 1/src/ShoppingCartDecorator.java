public abstract class ShoppingCartDecorator extends ShoppingCart {
    protected ShoppingCart cart;

    public ShoppingCartDecorator(ShoppingCart cart) {
        this.cart = cart;
        
    }

    @Override
    public double getDeliveryFee() {
        return cart.getDeliveryFee();
    }

    @Override
    public double getNetPrice() {
        return cart.getNetPrice();
    }

    @Override
    public double calculateTotal() {
        return cart.calculateTotal();
    }

}
