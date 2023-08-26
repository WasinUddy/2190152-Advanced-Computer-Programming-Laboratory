public class Door {
    private String doorID;
    private boolean locked;
    public Door(String doorID) {
        this.doorID = doorID;
        this.locked = false;
    }
    public String getDoorID() {
        return doorID;
    }
    public boolean isLocked() {
        return locked;
    }
    public void lock() {
        locked = true;
        System.out.println("Door "+this.doorID+" is locked.");
    }
    public void unlock() {
        locked = false;
        System.out.println("Door "+this.doorID+" is unlocked.");
    }
    public void open() {
        if (!locked) {
            System.out.println("Door "+this.doorID+" is opened.");
        } else {
            System.out.println("Door "+this.doorID+" cannot be opened. Please unlock the door first.");
        }
    }
    public void close() {
        locked = false;
        System.out.println("Door "+this.doorID+" is closed and unlocked.");
    }
}