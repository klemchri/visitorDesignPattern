public class start {
    public static void main(String[] args) {
        Employee[] employees = {
            new FullTimeEmployee("Max Mustermann", 5000),
            new PartTimeEmployee("Erika Musterfrau", 12)
        };

        Visitor salaryCalculator = new SalaryCalculator();

        for (Employee employee : employees) {
            employee.accept(salaryCalculator);
        }
    }
}