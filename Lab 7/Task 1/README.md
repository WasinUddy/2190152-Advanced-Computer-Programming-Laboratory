## Lab Sheet: Building a Shopping Cart with Decorator Pattern

### Objective

The objective of this lab is to design and implement a shopping cart class that allows customers to add items to their cart, apply various types of coupons for discounts, and calculate the total cost, including delivery fees.

### Requirements

1. Create a `ShoppingCart` class that stores items in an `ArrayList` of `String`. Each item in the cart should be represented as a string in the format: `"ItemName:Quantity:Price"` where `ItemName` is the name of the item, `Quantity` is the number of items, and `Price` is the price of one item.

2. Implement the `calculateTotal()` method in the `ShoppingCart` class, which calculates the total price of all items in the cart.

3. Implement the `addDeliveryFee(int fee)` method in the `ShoppingCart` class. This method takes an integer `fee` as an input parameter and adds the specified delivery fee to the cart's total cost. The delivery fee should be added before applying any discounts.

4. Implement three types of coupons as decorators:
    - `DiscountByPercentDecorator`: This decorator should apply a discount by a certain percentage to the total cost before adding the delivery fee. It can be applied only once of this type but can be applied along with other types of coupons.
    - `DiscountByAmountDecorator`: This decorator should apply a discount by a specified amount to the total cost before adding the delivery fee. It can be applied only once of this type but can be applied along with other types of coupons.
    - `FreeDeliveryDecorator`: This decorator should provide free delivery with no additional cost. It can be applied only once of this type but can be applied along with other types of coupons.
    
    - This modification allows multiple types of coupons to be applied together while ensuring that each specific type of coupon is applied only once. If a user accidentally applies the same type of coupon more than once, the system will simply ignore the redundant application without displaying an error or halting the program.

5. Implement a `getNetPrice()` method in the `ShoppingCart` class, which calculates the net price after applying all the coupons. This method should return the total price after subtracting all discounts.

6. Create a test program to demonstrate the functionality of the `ShoppingCart` class. You should add items to the cart, apply different coupons, and calculate and display the total and net prices.