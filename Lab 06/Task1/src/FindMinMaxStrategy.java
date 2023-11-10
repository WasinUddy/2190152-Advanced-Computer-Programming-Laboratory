import java.util.NoSuchElementException;

/**
 * An interface defining operations for finding minimum, maximum, sorting an array, and appending a value.
 */
interface FindMinMaxStrategy {
    int findMin(int[] array);
    int findMax(int[] array);
    int[] sortArray(int[] array);
    int[] append(int value, int[] array);
}

/**
 * Strategy for finding the minimum and maximum values from an unsorted array.
 */
class UnsortedFindMinMaxStrategy implements FindMinMaxStrategy {
    
    /**
     * Find the minimum value from an unsorted array.
     *
     * @param array The array to search.
     * @return The minimum value.
     * @throws NoSuchElementException if the array is empty.
     */
    @Override
    public int findMin(int[] array) {
        if (array.length == 0) {
            throw new NoSuchElementException("No element in array");
        }
        int min = Integer.MAX_VALUE;
        for (int a : array) {
            if (a < min) {
                min = a;
            }
        }
        return min;
    }

    /**
     * Find the maximum value from an unsorted array.
     *
     * @param array The array to search.
     * @return The maximum value.
     * @throws NoSuchElementException if the array is empty.
     */
    @Override
    public int findMax(int[] array) {
        if (array.length == 0) {
            throw new NoSuchElementException("No element in array");
        }
        int max = Integer.MIN_VALUE;
        for (int a : array) {
            if (a > max) {
                max = a;
            }
        }
        return max;
    }

    /**
     * Return the original unsorted array.
     *
     * @param array The array to be returned.
     * @return The original array.
     */
    @Override
    public int[] sortArray(int[] array) {
        return array;
    }

    /**
     * Append a value to the end of an array.
     *
     * @param value The value to append.
     * @param array The original array.
     * @return A new array with the value appended.
     */
    @Override
    public int[] append(int value, int[] array) {
        int[] result = new int[array.length + 1];
        System.arraycopy(array, 0, result, 0, array.length);
        result[array.length] = value;
        return result;
    }
}

/**
 * Strategy for finding the minimum and maximum values from a sorted array.
 */
class SortedFindMinMaxStrategy implements FindMinMaxStrategy {
    
    /**
     * Find the minimum value from a sorted array.
     *
     * @param array The array to search.
     * @return The minimum value.
     * @throws NoSuchElementException if the array is empty.
     */
    @Override
    public int findMin(int[] array) {
        if (array.length == 0) {
            throw new NoSuchElementException("No element in array");
        }
        return array[0];
    }

    /**
     * Find the maximum value from a sorted array.
     *
     * @param array The array to search.
     * @return The maximum value.
     * @throws NoSuchElementException if the array is empty.
     */
    @Override
    public int findMax(int[] array) {
        if (array.length == 0) {
            throw new NoSuchElementException("No element in array");
        }
        return array[array.length - 1]; // corrected the index
    }

    /**
     * Sorts the array using the bubble sort algorithm.
     *
     * @param array The array to be sorted.
     * @return The sorted array.
     */
    @Override
    public int[] sortArray(int[] array) {
        for (int lastIndex = array.length - 1; lastIndex >= 1; lastIndex--) {
            for (int i = 0; i < lastIndex; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        return array;
    }

    /**
     * Append a value to a sorted array while maintaining the order.
     *
     * @param value The value to append.
     * @param array The original sorted array.
     * @return A new sorted array with the value appended.
     */
    @Override
    public int[] append(int value, int[] array) {
        int[] result = new int[array.length + 1];
        int i = 0;
        while (i < array.length && value > array[i]) {
            result[i] = array[i];
            i++;
        }
        result[i++] = value;
        System.arraycopy(array, i - 1, result, i, array.length - i + 1);
        return result;
    }
}
