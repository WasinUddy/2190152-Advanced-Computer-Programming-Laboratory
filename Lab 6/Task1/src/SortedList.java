class SortedList extends PythonList {

    /**
     * Constructor for SortedList.
     * 
     * @param array to initialize the list with.
     */
    public SortedList(int[] array) {
        super(array);
        
        this.setStrategy(new SortedFindMinMaxStrategy());
        this.array = this.strategy.sortArray(this.array);
    }

    /**
     * Check if the list contains a value.
     * Optimized for sorted lists.
     * 
     * @param v the value to check.
     * @return true if the value is found.
     */
    public boolean contains(int v) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
   
            // If the middle element is equal to v, return true
            if (array[mid] == v) {
                return true;
            }
   
            // If v is less than the middle element, search in the left half
            if (array[mid] > v) {
                right = mid - 1;
            }
            // If v is greater than the middle element, search in the right half
            else {
                left = mid + 1;
            }
        }
   
        // If the loop finishes without finding v, return false
        return false;
    }
}