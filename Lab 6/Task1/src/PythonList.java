class PythonList {
    protected FindMinMaxStrategy strategy;
    protected int[] array;

    /**
     * Create a new PythonList.
     *
     * @param array to be started with. (Will be copied)
     */
    public PythonList(int[] array) {
        setArray(array);
    }


    /**
     * Copies the array. to prevent aliasing. set it to this.array.
     * 
     * @param array to be copied.
     */
    private void setArray(int[] a) {
        // Create a copy of the array.
        this.array = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            this.array[i] = a[i];
        }
    }


    /**
     * Set the strategy to be used.
     * 
     * @param strategy to be used.
     */
    public void setStrategy(FindMinMaxStrategy strategy) {
        this.strategy = strategy;
    }

    
    /**
     * Find the Minimum value in the array. using the strategy.
     * 
     * @return the minimum value.
     */
    public int findMin() {
        return this.strategy.findMin(this.array);
    }

    
    /**
     * Find the Maximum value in the array. using the strategy.
     * 
     * @return the maximum value.
     */
    public int findMax() {
        return this.strategy.findMax(this.array);
    }

    
    /**
     * Append a value to the array. using the strategy.
     * 
     * @param value to be appended.
     */
    public void append(int value) {
        this.array = this.strategy.append(value, this.array);
    }


    /**
     * Check if the value can be found in the array.
     * 
     * @param value to be checked.
     * @return true if the value is found. 
     */
    public boolean contains(int value) {
        for (int i = 0; i < this.array.length; i++) {
            if (this.array[i] == value) {
                return true;
            }
        }

        return false;
    }


    /**
     * Convert the array to a string.
     * 
     * @return the string representation of the array.
     */
    public String toString() {
        String result = "[";
        for (int i = 0; i < this.array.length; i++) {
            result += this.array[i];
            if (i < this.array.length - 1) {
                result += ", ";
            }
        }
        result += "]";
        return result;
    }

}
