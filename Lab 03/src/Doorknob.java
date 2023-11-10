public class Doorknob {
    private String doorknobID;

    public Doorknob(String doorknobID) {
        this.doorknobID = doorknobID;
    }

    public Boolean canUnlock(Key key) {
        String k = key.getKeyID();
        return k == this.doorknobID;
    }

    public String getDoorknobID() {
        return doorknobID;
    }
}
