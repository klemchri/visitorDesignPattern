package AnderePatterns.Builder;

public class Director {

    public KFZ buildNewCar() {
        CarBuilder carBuilder = new CarBuilder();
        return carBuilder.setTires(4)
                .setMileage(0)
                .setHorsePower(110)
                .setBluetooth(true)
                .setGPS(true)
                .build();
    }

    public KFZ buildNewTrain() {
        CarBuilder TrainBuilder = new TrainBuilder();
        return carBuilder.setTires(4)
                .setMileage(0)
                .setHorsePower(110)
                .setBluetooth(true)
                .setGPS(true)
                .setStromabnehmer(true)
                .build();
    }


    public KFZ buildDefaultCar() {
        CarBuilder carBuilder = new CarBuilder();
        return carBuilder.build();
    }
}