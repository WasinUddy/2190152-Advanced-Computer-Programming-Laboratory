# **Task 2: Apply Strategy Pattern to a new problem**

**Objective:** In this task, you will implement the strategy pattern to enhance the functionality of a simple shopping cart system. The goal is to allow the cart to apply different discount strategies to items added to it.

**Background:** You are provided with the basic structure of a shopping cart and a sample discount strategy. Your task is to extend the system to support multiple discount strategies and allow users to apply different strategies at runtime.

**Instructions:**

1. **Setup:** The starter code provided below, which includes the following classes:
   - `Item`: Represents an item that can be added to the shopping cart. Each item is represented as a string containing the item name, the number of items, and the price of each item, separated by a vertical line "|". For example, `"Widget|3|10.99"` represents 3 widgets at a price of $10.99 each.
   - `ShoppingCart`: Represents the shopping cart and currently supports adding items and calculating the total cost.

2. **Implement Additional Discount Strategies:** Create two new discount strategy classes that implement the `DiscountStrategy` interface,
  * `PercentageDiscountStrategy` (for example 10% discount or 20% discount, the percent should be able to input from by a parameter in the method)
  *  `FixedDiscountStrategy` (for example 5$ discount or 10$ discount, the amount should be able to input from by a parameter in the method).

3. **Integrate Discount Strategies:** Modify the `ShoppingCart` class to allow users to set a discount strategy. Implement a setter method to set the current discount strategy for the cart.

4. **Apply Discounts:** Modify the `calculateTotal()` method in the `ShoppingCart` class to apply the chosen discount strategy when calculating the total cost.

5. **Test the System:** Create a test program that demonstrates the functionality of the shopping cart system. In the test program:
   - Create a shopping cart.
   - Add various items to the cart (in the specified format).
   - Set different discount strategies on the cart.
   - Calculate and display the total cost with different discount strategies.

