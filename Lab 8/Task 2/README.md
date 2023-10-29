
**Objective:**
The objective of this lab is to introduce students to the Factory Pattern with a real-world example and provide hands-on experience in implementing it.

**Instructions:**

1. Create an interface named `PaymentMethod`. This interface should include a method `void processPayment(double amount)` that represents the common operations for processing payments.

2. Implement concrete classes for different payment methods. The code already provides `CreditCardPayment`, `PayPalPayment`, and `CryptoPayment` classes, each of which implements the `PaymentMethod` interface. Each method should print the amount and method of payment on the screen.

3. Implement a Factory class named `PaymentMethodFactory`. This factory class will be responsible for creating payment method objects based on the provided payment type.

4. In the `createPaymentMethod` method of the factory, add logic to create an object of the appropriate payment method class based on the provided payment type ("credit card", "paypal", and "crypto")

**Testing the Implementation**
```
public class PaymentApp {
    public static void main(String[] args) {
        // Implement the Client Code
        PaymentMethodFactory paymentFactory = new PaymentMethodFactory();

        // Create payment objects without knowing the exact class
        PaymentMethod creditCardPayment = paymentFactory.createPaymentMethod("credit card");
        PaymentMethod payPalPayment = paymentFactory.createPaymentMethod("paypal");
        PaymentMethod cryptoPayment = paymentFactory.createPaymentMethod("crypto");

        // Test Your Implementation
        double paymentAmount = 100.0;
        creditCardPayment.processPayment(paymentAmount);
        payPalPayment.processPayment(paymentAmount);
        cryptoPayment.processPayment(paymentAmount);
    }
}
```
Expected Result:
```
Processing credit card payment of $100.0
Processing PayPal payment of $100.0
Processing cryptocurrency payment of $100.0
```