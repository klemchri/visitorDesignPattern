import java.util.ArrayList;
import java.util.List;

class Spielzeugsammlung {
    private List<Observer> observers = new ArrayList<>();
    private int anzahlSpielzeuge;
 
    public int getAnzahlSpielzeuge() {
        return anzahlSpielzeuge;
    }
 
    public void setAnzahlSpielzeuge(int anzahlSpielzeuge) {
        this.anzahlSpielzeuge = anzahlSpielzeuge;
        benachrichtigeAlleBeobachter();
    }
 
    public void fügeBeobachterHinzu(Observer observer) {
        observers.add(observer);
    }
 
    public void entferneBeobachter(Observer observer) {
        observers.remove(observer);
    }
 
    public void benachrichtigeAlleBeobachter() {
        for (Observer observer : observers) {
            observer.aktualisiere();
        }
    }
}