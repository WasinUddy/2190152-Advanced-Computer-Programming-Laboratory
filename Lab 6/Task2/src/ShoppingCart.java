class ShoppingCart {
    
    // An array to store items in the cart
    private Item[] items;

    // Strategy to apply discounts to the total price
    private DiscountStrategy discountStrategy;

    /**
     * Default constructor initializing with an empty item list and 
     * a default discount strategy.
     */
    public ShoppingCart() {
        items = new Item[0];
        discountStrategy = new SampleDiscountStrategy(); // Default strategy
    }

    /**
     * Adds an item to the shopping cart.
     *
     * @param item The item to be added.
     */
    public void addItem(Item item) {
        // Extend the items array to accommodate the new item
        Item[] newItems = new Item[items.length + 1];
        System.arraycopy(items, 0, newItems, 0, items.length);
        newItems[items.length] = item;
        items = newItems;
    }

    /**
     * Sets the discount strategy to be used when calculating total price.
     *
     * @param discountStrategy The discount strategy to be applied.
     */
    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    /**
     * Calculates the total price for items in the cart 
     * and prints the amount after applying the discount.
     * 
     * @return The total price after applying the discount
     */
    public double calculateTotal() {
        double total = 0;

        // Calculate the total price for all items in the cart
        for (Item item : this.items) {
            total += item.getPrice() * item.getQuantity();
        }

        // Apply the discount strategy
        total = discountStrategy.applyDiscount(total);

        return total;
    }
}