public class App {
    public static void main(String[] args) throws Exception {
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
    }
}
