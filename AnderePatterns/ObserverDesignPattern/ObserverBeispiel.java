public class ObserverBeispiel {
    public static void main(String[] args) {
        Spielzeugsammlung sammlung = new Spielzeugsammlung();
        
        Glockenspiel glockenspiel = new Glockenspiel(sammlung);
        Lichterkette l1 = new Lichterkette(sammlung);

        sammlung.setAnzahlSpielzeuge(2);  // Das Glockenspiel wird benachrichtigt und spielt eine Melodie
    }
}