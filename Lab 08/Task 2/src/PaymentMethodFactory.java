public class PaymentMethodFactory {
    public PaymentMethod createPaymentMethod(String type) {
        if (type == null || type.isEmpty()) {
            throw new IllegalArgumentException("Payment method type cannot be null or empty");
        }
        switch (type.toLowerCase()) {
            case "credit card":
                return new CreditCardPayment();
            case "paypal":
                return new PayPalPayment();
            case "crypto":
                return new CryptoPayment();
            default:
                throw new IllegalArgumentException("Payment method type not supported you FOOL! I have been programmed in your jedi arts by Count Dooku!");
        }
    }
}
