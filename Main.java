public class Main {
    public static void main(String[] args) {

        // Create a Calculator object
        Calculator calculator = new Calculator(10.5, 6.39);

        // Perform some operations and display the results
        System.out.println("Addition: " + calculator.add());
        System.out.println("Subtraction: " + calculator.subtract());
        System.out.println("Multiplication: " + calculator.multiply());
        System.out.println("Division: " + calculator.divide());
    }

}
