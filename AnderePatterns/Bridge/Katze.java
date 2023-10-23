package AnderePatterns.Bridge;

class Katze extends Tier {
    public Katze(LautImplementierung lautImplementierung) {
        super(lautImplementierung);
    }

    @Override
    void zeigeTier() {
        System.out.print("Ich bin eine Katze. ");
        lautImplementierung.macheLaut();
    }
}