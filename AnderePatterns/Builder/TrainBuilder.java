package AnderePatterns.Builder;

class TrainBuilder implements KFZBuilder{
    private KFZ train = new KFZ();
    private boolean hasStromabnehmer;

    @Override
    public TrainBuilder setTires(int tires) {
        train.setTires(tires);
        return this;
    }

    @Override
    public TrainBuilder setHorsePower(int horsePower) {
        train.setHorsePower(horsePower);
        return this;
    }

    @Override
    public TrainBuilder setMileage(int miles) {
        train.setMilesAge(miles);
        return this;
    }

    public TrainBuilder setGPS(boolean hasGPS) {
        train.setHasGps(hasGPS);
        return this;
    }

    public TrainBuilder setBluetooth(boolean hasBluetooth) {
        train.setHasBluetooth(hasBluetooth);
        return this;
    }

    public TrainBuilder setStromabnehmer(boolean hasStromabnehmer) {
        this.hasStromabnehmer = hasStromabnehmer;
        return this;
    }

    public TrainBuilder getStromabnehmer() {
        return this.hasStromabnehmer;
    }

    public KFZ build(){
        return train;
    }
}
