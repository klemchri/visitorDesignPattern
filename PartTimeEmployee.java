class PartTimeEmployee implements Employee {
    private String name;
    private double hourlyRate;

    public PartTimeEmployee(String name, double hourlyRate) {
        this.name = name;
        this.hourlyRate = hourlyRate;
    }

    public String getName() {
        return name;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}