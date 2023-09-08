class Azubi implements Employee {
    private String name;
    private double ausbildungsverguetung;

    public Azubi(String name, double ausbildungsverguetung) {
        this.name = name;
        this.ausbildungsverguetung = ausbildungsverguetung;
    }

    public String getName() {
        return name;
    }

    public double getAusbildungsverguetung() {
        return ausbildungsverguetung;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
