package chapter5ControlStatements2LogicOperatiors;

// Fig. 5.2: ForCounter.java
// Counter-controlled iteration with the for iteration statement.

public class ForCounter {
    public static void main(String[] args) {
        // for statement header includes initialization,
        // loop-continuation condition and increment
        for (int counter = 1; counter <= 10; counter++) {
            System.out.printf("%d ", counter);
        }

        System.out.println();
    }
}
