public class Door implements Observer {
    private String doorName;

    public Door(String doorName) {
        this.doorName = doorName;
    }

    public void open() {
        System.out.println("Door " + doorName + " opened");
    }

    public void close() {
        System.out.println("Door " + doorName + " closed");
    }

    @Override
    public void updateDoorOpen() {
        open();
    }

    @Override
    public void updateDoorClose() {
        close();
    }
}