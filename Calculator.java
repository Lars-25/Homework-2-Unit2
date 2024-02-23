public class Calculator {

    // Attributes
    private double number1;
    private double number2;

    // Constructor
    public Calculator(double num1, double num2) {
        this.number1 = num1;
        this.number2 = num2;
    }

    // Methods for arithmetic operations
    public double add() {
        return number1 + number2;
    }

    public double subtract() {
        return number1 - number2;
    }

    public double multiply() {
        return number1 * number2;
    }

    public double divide() {
        if (number2 != 0) {
            return number1 / number2;
        } else {
            System.out.println("Cannot divide by zero.");
        }
        return 0;
    }
}
