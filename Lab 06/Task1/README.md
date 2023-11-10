# **Task 1: Add more methods to PythonList, SortedList, and Unsorted List**

There are some methods which should be added to the classes we have done during the lecture class. All of them are listed below:

1. `append(int v)` for unsorted list.
```
    public void append(int v) {
        int[] a = new int[array.length+1];
        for(int i=0;i<array.length;i++) {
            a[i] = array[i];
        }
        a[array.length]=v;
        array=a;
    }
```
2. `append(int v)` for sorted list.
```
    public void append(int v) {
        int[] a = new int[array.length+1];
        int i = 0;
        while(v > array[i]) {
            a[i] = array[i];
            i++;
        }
        a[i++] = v;
        for(int j=i-1;j<array.length;j++) {
            a[i++] = array[j];
        }
        array=a;
    }   
```
3. `contains(int v)` for ***any*** lists.
```
    public boolean contains(int v) {
        for(int a: array) {
            if(a==v) return true;
        }
        return false;
    }
```
4. `contains(int v)` for ***sorted*** lists.
```
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
```
5. toString() for both kinds of llist
```
    public String toString() {
        if(array.length == 0) return "[]";
        String out = "[";
        for(int a:array) {
            out += a+", ";
        }
        out = out.substring(0,out.length()-2)+"]";
        return out;
    }
```
Please add all of them to suitable class(es) and make sure that the testMethod below gives the correct results.

```
      int[] d1 = {3,8,2,10,4,5};
      SortedList l1 = new SortedList(d1);
      System.out.println(l1.findMax());
      System.out.println(l1.findMin());
      System.out.println(l1.contains(10));
      System.out.println(l1.contains(7));
      System.out.println(l1);
      l1.append(7);
      System.out.println(l1.contains(7));
      System.out.println(l1);
      int[] d2 = {3,8,2,10,4,5};
      UnsortedList l2 = new UnsortedList(d2);
      System.out.println(l2.findMax());
      System.out.println(l2.findMin());
      System.out.println(l2.contains(10));
      System.out.println(l2.contains(7));
      System.out.println(l2);
      l2.append(7);
      System.out.println(l2.contains(7));
      System.out.println(l2);
```
Expected Result
```
10
2
true
false
[2, 3, 4, 5, 8, 10]
true
[2, 3, 4, 5, 7, 8, 10]
10
2
true
false
[3, 8, 2, 10, 4, 5]
true
[3, 8, 2, 10, 4, 5, 7]
```

