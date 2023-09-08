class Lichterkette implements Observer {
    private Spielzeugsammlung sammlung;

    public Lichterkette(Spielzeugsammlung sammlung) {
        this.sammlung = sammlung;
        sammlung.fügeBeobachterHinzu(this);
    }



    @Override
    public void aktualisiere() {
        System.out.println("Die Lichterkette fängt an zu blinken! Es gibt jetzt " + sammlung.getAnzahlSpielzeuge() + " Spielzeuge.");
    }
}
