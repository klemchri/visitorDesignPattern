class Glockenspiel implements Observer {
    private Spielzeugsammlung sammlung;

    public Glockenspiel(Spielzeugsammlung sammlung) {
        this.sammlung = sammlung;
        sammlung.fügeBeobachterHinzu(this);
    }

    @Override
    public void aktualisiere() {
        System.out.println("Das Glockenspiel spielt eine Melodie! Es gibt jetzt " + sammlung.getAnzahlSpielzeuge() + " Spielzeuge.");
    }
}
