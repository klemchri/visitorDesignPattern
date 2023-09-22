package AnderePatterns.Builder;

class CarBuilder implements KFZBuilder{
    private KFZ car = new KFZ();

    @Override
    public CarBuilder setTires(int tires) {
        car.setTires(tires);
        return this;
    }

    @Override
    public CarBuilder setHorsePower(int horsePower) {
        car.setHorsePower(horsePower);
        return this;
    }

    @Override
    public CarBuilder setMileage(int miles) {
        car.setMilesAge(miles);
        return this;
    }

    public CarBuilder setGPS(boolean hasGPS) {
        car.setHasGps(hasGPS);
        return this;
    }

    public CarBuilder setBluetooth(boolean hasBluetooth) {
        car.setHasBluetooth(hasBluetooth);
        return this;
    }

    public KFZ build(){
        return car;
    }
}
