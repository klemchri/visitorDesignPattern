package AnderePatterns.Builder;

public class Main {
    private static final Director director = new Director();

    public static void main(String[] args) {
        KFZ car = director.buildDefaultCar();
        System.out.println(car.getTires());
        System.out.println(car.getMilesAge());
        System.out.println(car.getHorsePower());
        System.out.println(car.isHasGps());
        System.out.println(car.isHasBluetooth());



        KFZ trein = director.buildNewTrain();
        System.out.println(trein.getTires());
        System.out.println(trein.getMilesAge());
        System.out.println(trein.getHorsePower());
        System.out.println(trein.isHasGps());
        System.out.println(trein.isHasBluetooth());
        System.out.println(trein.setStromabnehmer());
    }
}