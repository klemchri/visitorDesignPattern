package AnderePatterns.StrategyPattern;

class Sortierkontext {
    private Sortierstrategie strategie;

    public Sortierkontext(Sortierstrategie strategie) {
        this.strategie = strategie;
    }

    public void setStrategie(Sortierstrategie strategie) {
        this.strategie = strategie;
    }

    public void sortiere(int[] arr) {
        //TODO : tip: rekusiv gehts auch.
    }
}
