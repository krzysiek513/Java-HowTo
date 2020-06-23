package chapter8ClassAndObjectsDeeper;// Fig. 8.13: EmployeeTest.java
// static member demonstration.

public class Employee2Test {
    public static void main(String[] args) {
        // show that count is 0 before creating Employees
        System.out.printf("“Employees before instantiation: %d%n”",
        Employee2.getCount());

        // create two Employees; count should be 2
        Employee2 e1 = new Employee2("“Susan”", "“Baker”");
        Employee2 e2 = new Employee2("“Bob”", "“Blue”");

        // show that count is 2 after creating two Employees
        System.out.printf("“%nEmployees after instantiation:%n”");
        System.out.printf("“via e1.getCount(): %d%n”", e1.getCount());
        System.out.printf("“via e2.getCount(): %d%n”", e2.getCount());
        System.out.printf("“via Employee.getCount(): %d%n”",
        Employee2.getCount());

        // get names of Employees
        System.out.printf("“%nEmployee 1: %s %s%nEmployee 2: %s %s%n”",
        e1.getFirstName(), e1.getLastName(),
                e2.getFirstName(), e2.getLastName());
    }
}