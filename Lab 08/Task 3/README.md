---

**Objective:**
The objective of this lab is to change from the Factory Pattern to the Factory Method Pattern using the same concept as the previous task.

**Instructions:**

1. Two interfaces are provided as below:

```
interface PaymentMethod {
    void processPayment(double amount);
}

interface PaymentMethodFactory {
    PaymentMethod createPaymentMethod();
}
```

2. Implement concrete classes for different payment methods. These classes should implement the `PaymentMethod` interface and provide the actual payment processing logic for each payment method. Create classes `CreditCardPayment`, `PayPalPayment`, and `CryptoPayment` that implement the PaymentMethod interface. Each class prints `Processing xxx payment of $yyy` where `xxx` denotes the payment method and the `yyy` denotes the amount of payment

3. Create concrete creator classes that implement the `PaymentMethodFactory` interface. These classes are responsible for creating payment method objects and returning them to the client code. Name these classes `CreditCardPaymentFactory`, `PayPalPaymentFactory`, and `CryptoPaymentFactory`.

  * In each concrete creator class, implement the `createPaymentMethod` method to create and return an object of the appropriate payment method class.

**Testing the Implementation**
```
public class PaymentApp {
    public static void main(String[] args) {
        // Implement the Client Code
        PaymentMethodFactory creditCardFactory = new CreditCardPaymentFactory();
        PaymentMethodFactory payPalFactory = new PayPalPaymentFactory();
        PaymentMethodFactory cryptoFactory = new CryptoPaymentFactory();

        PaymentMethod creditCardPayment = creditCardFactory.createPaymentMethod();
        PaymentMethod payPalPayment = payPalFactory.createPaymentMethod();
        PaymentMethod cryptoPayment = cryptoFactory.createPaymentMethod();

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
