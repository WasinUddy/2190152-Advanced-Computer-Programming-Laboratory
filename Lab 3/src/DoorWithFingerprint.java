public class DoorWithFingerprint extends Door {
    private FingerprintModule fingerprintModule;

    public DoorWithFingerprint(String doorID) {
        super(doorID);
    }

    public void installFingerprintModule(FingerprintModule fingerprintModule) {
        this.fingerprintModule = fingerprintModule;
        System.out.println("A fingerprint module with serial " + fingerprintModule.getFingerprintSerialNumber() + " already installed.");
    }

    public void close(String fingerprint) {
        fingerprintModule.registerFinderprint(fingerprint);
        super.lock();
    }

    public void open(String fingerprint) {
        if (fingerprintModule.checkFingerprint(fingerprint)) {
            super.unlock();
            super.open();
        }else{
            System.out.println("Door "+this.getDoorID()+" cannot be opened. Please unlock the door first.");
        }
    }
    
}
