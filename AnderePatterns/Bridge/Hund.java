package AnderePatterns.Bridge;



class Hund extends Tier {
    public Hund(LautImplementierung lautImplementierung) {
        super(lautImplementierung);
    }

    @Override
    void zeigeTier() {
        System.out.print("Ich bin ein Hund. ");
        lautImplementierung.macheLaut();
    }
}