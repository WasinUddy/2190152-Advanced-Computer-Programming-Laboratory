public class App {
    public static void main(String[] args) {
        Door D1 = new Door("D1");
        Door D2 = new Door("D2");
        Door D3 = new Door("D3");

        ControlCenter controlCenter = new ControlCenter();

        controlCenter.registerObserver(D1);
        controlCenter.registerObserver(D2);
        controlCenter.registerObserver(D3);

        D1.open();
        D2.open();
        D1.close();

        controlCenter.openAllDoors();
        controlCenter.closeAllDoors();

        Door D4 = new Door("D4");
        controlCenter.registerObserver(D4);
        controlCenter.openAllDoors();
    }
}
