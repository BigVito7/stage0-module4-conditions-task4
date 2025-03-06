package school.mjc.stage0.conditions.task4;

public class TernaryAssignment {
    public void assignAndPrintBasedOnWhichBigger(int first, int second) {
        // Use ternary operator to assign value to result
        int result = (first > second) ? 10 : -10;

        // Print the result
        System.out.println("Result: " + result);
    }
}
