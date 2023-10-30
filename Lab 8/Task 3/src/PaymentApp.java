public class PaymentApp {
    public static void main(String[] args) {
        PaymentMethodFactory creditCardMethodFactory = new CreditCardPaymentFactory();
        PaymentMethodFactory payPalMethodFactory = new PayPalPaymentFactory();
        PaymentMethodFactory cryptoMethodFactory = new CryptoPaymentFactory();

        PaymentMethod creditCardPayment = creditCardMethodFactory.createPaymentMethod();
        PaymentMethod payPalPayment = payPalMethodFactory.createPaymentMethod();
        PaymentMethod cryptoPayment = cryptoMethodFactory.createPaymentMethod();


        double paymentAmount = 100.0;
        creditCardPayment.processPayment(paymentAmount);
        payPalPayment.processPayment(paymentAmount);
        cryptoPayment.processPayment(paymentAmount);
    }
}
