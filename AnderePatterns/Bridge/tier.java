package AnderePatterns.Bridge;

// Abstrakte Tierklasse
abstract class Tier {
    protected LautImplementierung lautImplementierung;

    public Tier(LautImplementierung lautImplementierung) {
        this.lautImplementierung = lautImplementierung;
    }

    abstract void zeigeTier();
}
