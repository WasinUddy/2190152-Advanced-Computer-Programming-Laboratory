interface DiscountStrategy {
    /**
     * Apply a discount to the price
     * 
     * @param price    The price of the item
     *
     * @return The discounted price
     */
    public double applyDiscount(double price);
}

class PercentageDiscountStrategy implements DiscountStrategy {
    private double magnitude;

    /**
     * Constructor for PercentageDiscountStrategy
     * 
     * @param magnitude The magnitude of the discount
     */
    public PercentageDiscountStrategy(double magnitude) {
        this.magnitude = magnitude;
    }

    
    /**
     * Apply a percentage discount to the price
     * 
     * @param price    The price of the item
     * 
     * @return The discounted price
     */
    @Override
    public double applyDiscount(double price) {
        return price * ((100 - this.magnitude) / 100);
    }
}


class FixedDiscountStrategy implements DiscountStrategy {
    private double magnitude;
    
    /**
     * Constructor for FixedDiscountStrategy
     * 
     * @param magnitude The magnitude of the discount
     */
    public FixedDiscountStrategy(double magnitude) {
        this.magnitude = magnitude;
    }
    
    /**
     * Apply a fixed discount to the price
     * 
     * @param price    The price of the item
     * 
     * @return The discounted price
     */
    @Override
    public double applyDiscount(double price) {
        return price - this.magnitude;
    }
}


class SampleDiscountStrategy implements DiscountStrategy {

    /**
     * Constructor for SampleDiscountStrategy
     */
    public SampleDiscountStrategy() {
    }

    /**
     * Apply a sample discount to the price
     * 
     * @param price    The price of the item
     * 
     * @return The discounted price
     */
    @Override
    public double applyDiscount(double price) {
        return price;
    }
}