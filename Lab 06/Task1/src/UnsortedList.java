class UnsortedList extends PythonList {
    
    /**
     * Constructor for UnsortedList.
     * 
     * @param array
     */
    public UnsortedList(int[] array) {
        super(array);
        
        this.setStrategy(new UnsortedFindMinMaxStrategy());
    }

    
    /**
     * Check if the list contains a value.
     * 
     * @param v the value to check.
     * @return true if the value is found.
     */
    public boolean contains(int v) {
        for(int a: array) {
            if(a==v) return true;
        }
        return false;
    }
}