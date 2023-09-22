package AnderePatterns.Builder;

public interface KFZBuilder {
    KFZBuilder setTires(int tires);
    KFZBuilder setHorsePower(int horsePower);
    KFZBuilder setMileage(int miles);
    KFZ build();
}