public interface PaymentMethod {
    void processPayment(double amount);
}

class CreditCardPayment implements PaymentMethod{
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }

}

class PayPalPayment implements PaymentMethod{
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }

}

class CryptoPayment implements PaymentMethod{
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing cryptocurrency payment of $" + amount);
    }

}