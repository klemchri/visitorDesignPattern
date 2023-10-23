package AnderePatterns.Bridge;

public class Hauptklasse {
    public static void main(String[] args) {
        // Definieren Sie die Laute für Katze und Hund
        LautImplementierung miauImplementierung = new MiauLaut();
        LautImplementierung wuffImplementierung = new WuffLaut();

        // Erzeugen Sie Katze und Hund mit den entsprechenden Lauten
        Tier katze = new Katze(miauImplementierung);
        Tier hund = new Hund(wuffImplementierung);

        // Zeigen Sie die Tiere mit ihren Lauten
        katze.zeigeTier(); // Ausgabe: Ich bin eine Katze. Miau
        hund.zeigeTier(); // Ausgabe: Ich bin ein Hund. Wuff
    }
}




