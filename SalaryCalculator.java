class SalaryCalculator implements Visitor {
    @Override
    public void visit(FullTimeEmployee employee) {
        double salary = employee.getMonthlySalary();
        System.out.println(employee.getName() + " erhält einen Gehaltsscheck von " + salary);
    }

    @Override
    public void visit(PartTimeEmployee employee) {
        double salary = employee.getHourlyRate() * 20 * 8; // Annahme: 20 Arbeitstage, 8 Stunden pro Tag
        System.out.println(employee.getName() + " erhält einen Gehaltsscheck von " + salary);
    }
}
