public class FingerprintModule {
    private String fingerprintSerialNumber;
    private String fingerprint;

    public FingerprintModule(String fingerprintSerialNumber) {
        this.fingerprintSerialNumber = fingerprintSerialNumber;
    }
    
    public void registerFinderprint(String fingerprint) {
        this.fingerprint = fingerprint;
    }

    public Boolean checkFingerprint(String fingerprint) {
        return fingerprint == this.fingerprint;
    }

    public String getFingerprintSerialNumber() {
        return fingerprintSerialNumber;
    }
}
