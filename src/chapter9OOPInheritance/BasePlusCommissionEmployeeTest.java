package chapter9OOPInheritance;

// Fig. 9.7: BasePlusCommissionEmployeeTest.java
// BasePlusCommissionEmployee test program.

public class BasePlusCommissionEmployeeTest {
    public static void main(String[] args) {
        // instantiate BasePlusCommissionEmployee object
        BasePlusCommissionEmployee employee =
                new BasePlusCommissionEmployee(
                        "Bob", "Lewis", "333-33-3333",
                        5000, .04, 300);
        BasePlusCommissionEmployee2 employee2 =
                new BasePlusCommissionEmployee2(
                        "Bob2", "Lewis2", "2-333-33-3333",
                        2000, .02, 200);
        BasePlusCommissionEmployee3 employee3 =
                new BasePlusCommissionEmployee3(
                        "Bob3", "Lewis3", "3-333-33-3333",
                        3000, .03, 3300);

        // get base-salaried commission employee data
        System.out.printf(
                "Employee information obtained by get methods:%n");
        System.out.printf("%s %s%n", "First name is",
                employee.getFirstName());
        System.out.printf("%s %s%n", "Last name is",
                employee.getLastName());
        System.out.printf("%s %s%n", "Social security number is",
                employee.getSocialSecurityNumber());
        System.out.printf("%s %.2f%n", "Gross sales is",
                employee.getGrossSales());
        System.out.printf("%s %.2f%n", "Commission rate is",
                employee.getCommissionRate());
        System.out.printf("%s %.2f%n", "Base salary is",
                employee.getBaseSalary());

        employee.setBaseSalary(1000);

        System.out.printf("%n%s:%n%n%s%n",
                "Updated employee information obtained by toString",
                employee.toString());
    }
}
