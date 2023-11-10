public interface PaymentMethodFactory {
    public PaymentMethod createPaymentMethod();
}

class CreditCardPaymentFactory implements PaymentMethodFactory{
    @Override
    public PaymentMethod createPaymentMethod() {
        return new CreditCardPayment();
    }
}

class PayPalPaymentFactory implements PaymentMethodFactory{
    @Override
    public PaymentMethod createPaymentMethod() {
        return new PayPalPayment();
    }
}

class CryptoPaymentFactory implements PaymentMethodFactory{
    @Override
    public PaymentMethod createPaymentMethod() {
        return new CryptoPayment();
    }
}