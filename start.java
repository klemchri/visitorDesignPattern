public class start {
    public static void main(String[] args) {
        Employee[] employees = {
            new FullTimeEmployee("Max Mustermann", 5000),
            new PartTimeEmployee("Erika Musterfrau", 12),
            new Azubi("Dr. med. Denrasen", 2000)
        };

        Visitor salaryCalculator = new SalaryCalculator();

        for (Employee employee : employees) {
            employee.accept(salaryCalculator);
        }
    }
}