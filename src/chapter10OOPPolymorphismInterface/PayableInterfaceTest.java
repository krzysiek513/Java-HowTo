package chapter10OOPPolymorphismInterface;

// Fig. 10.14: PayableInterfaceTest.java
// Payable interface test program processing Invoices and
// Employees polymorphically.
public class PayableInterfaceTest {
    public static void main(String[] args) {
        // create four-element Payable array
        Payable[] payableObjects = new Payable[] {
                new Invoice("01234", "seat", 2, 375.00),
                new Invoice("56789", "tire", 4, 79.95),
                new SalariedEmployee("John", "Smith", "111-11-1111", 800.00),
                new SalariedEmployee("Lisa", "Barnes", "888-88-8888", 1200.00)
        };

        System.out.println(
                "Invoices and Employees processed polymorphically:");

        // generically process each element in array payableObjects
        for (Payable currentPayable : payableObjects) {
            // output currentPayable and its appropriate payment amount
            System.out.printf("%n%s %npayment due: $%,.2f%n",
                    currentPayable.toString(), // could invoke implicitly
                    currentPayable.getPaymentAmount());
        }
    }
}
