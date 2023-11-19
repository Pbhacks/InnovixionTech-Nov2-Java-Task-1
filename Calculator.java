import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            double num1, num2, result;
            char operator;

            System.out.println("Simple Calculator");

            System.out.println("-----------------");
            // Read the first number
            System.out.print("Enter the first number: ");
            num1 = scanner.nextDouble();

            // Read the operator specific
            System.out.print("Enter an operator (+, -, *, /): ");
            operator = scanner.next().charAt(0);

            // Read the second number
            System.out.print("Enter the second number: ");
            num2 = scanner.nextDouble();

            // Perform calculation based on the operators
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error: Division by zero");
                        return;
                    }
                    break;
                default:
                    System.out.println("Error: Invalid operator");
                    return;
            }

            // Display the result
            System.out.println("Result: " + result);

        } // Scanner is automatically closed here
    }
}
