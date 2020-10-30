package chapter5ControlStatements2LogicOperatiors;

// Fig. 5.1: WhileCounter.java
// Counter-controlled iteration with the while iteration statement.

public class WhileCounter {
    public static void main(String[] args) {
        int counter = 1; // declare and initialize control variable

        while (counter <= 10) { // loop-continuation condition
            System.out.printf("%d ", counter);
            ++counter; // increment control variable
        }

        System.out.println();
    }
}
