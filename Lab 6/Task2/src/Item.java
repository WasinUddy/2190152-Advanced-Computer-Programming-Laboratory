/**
 * Represents an item with a name, quantity, and price.
 */
public class Item {

    // The name of the item
    private final String name;
    
    // The quantity of the item
    private final int quantity;
    
    // The price of the item
    private final double price;

    /**
     * Constructs an Item object using an input string.
     * The input string should have a format of "name|quantity|price".
     *
     * @param inputString A string containing the item's data.
     * @throws IllegalArgumentException if the inputString doesn't adhere to the expected format.
     */
    public Item(String inputString) {
        String[] input = inputString.split("\\|");

        if (input.length != 3) {
            throw new IllegalArgumentException("Input string should have the format: name|quantity|price");
        }

        this.name = input[0];
        this.quantity = Integer.parseInt(input[1]);
        this.price = Double.parseDouble(input[2]);
    }

    /**
     * Gets the name of the item.
     *
     * @return The name of the item.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the quantity of the item.
     *
     * @return The quantity of the item.
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Gets the price of the item.
     *
     * @return The price of the item.
     */
    public double getPrice() {
        return price;
    }
}
