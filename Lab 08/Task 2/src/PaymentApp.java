public class PaymentApp {
    public static void main(String[] args) {
        PaymentMethodFactory paymentFactory = new PaymentMethodFactory();

        PaymentMethod creditCardPayment = paymentFactory.createPaymentMethod("credit card");
        PaymentMethod payPalPayment = paymentFactory.createPaymentMethod("paypal");
        PaymentMethod cryptoPayment = paymentFactory.createPaymentMethod("crypto");

        double paymentAmount = 100.0;
        creditCardPayment.processPayment(paymentAmount);
        payPalPayment.processPayment(paymentAmount);
        cryptoPayment.processPayment(paymentAmount);
    }
}
