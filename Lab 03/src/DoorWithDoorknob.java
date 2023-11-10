public class DoorWithDoorknob extends Door {
    private Doorknob doorknob;

    public DoorWithDoorknob(String doorID) {
        super(doorID);

    }

    public void installDoorknob(Doorknob doorknob) {
        this.doorknob = doorknob;

        System.out.println("A doorknob with ID " + doorknob.getDoorknobID() + " already installed.");
    }

    public void unlock(Key key) {
        if (doorknob.canUnlock(key)) {
            super.unlock();
        }
    }
    
    
}
