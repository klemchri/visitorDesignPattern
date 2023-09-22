package AnderePatterns.Builder;

public class KFZ {

    private int tires;
    private int horsePower;
    private int milesAge;
    private boolean hasGps;
    private boolean hasBluetooth;
    private boolean hasStromabnehmer;

    public int getTires() {
        return tires;
    }

    public void setTires(int tires) {
        this.tires = tires;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getMilesAge() {
        return milesAge;
    }

    public void setMilesAge(int milesAge) {
        this.milesAge = milesAge;
    }

    public boolean isHasGps() {
        return hasGps;
    }

    public void setHasGps(boolean hasGps) {
        this.hasGps = hasGps;
    }

    public boolean isHasBluetooth() {
        return hasBluetooth;
    }

    public void setHasBluetooth(boolean hasBluetooth) {
        this.hasBluetooth = hasBluetooth;
    }
}
