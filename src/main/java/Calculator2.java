import java.util.Scanner;

/**
 * @author Svetlana
 */

public class Calculator2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Enter numbers
        System.out.println("Enter the first number: ");
        double firstNumber = scan.nextDouble();
        System.out.println("Enter the second number: ");
        double secondNumber = scan.nextDouble();

        //Select the operation + - / *
        System.out.println("Select the operation: ‘+’, ‘-’, ‘*’ or ‘/’");
        char operation = scan.next().charAt(0);

        //Output the result
        if ((operation == '+') || (operation == '-') || (operation == '*') || (operation == '/')) {
            //Calculate
            double result = Calculation(firstNumber, secondNumber, operation);
            System.out.printf("%.4f %c %.4f = %.4f ", firstNumber, operation, secondNumber, result);
        }
        else {
            System.err.println("Input Error");
        }
        scan.close();
    }

    /**
     *
     * @param firstNumber First number (double)
     * @param secondNumber Second number (double)
     * @param operation operation ‘+’, ‘-’, ‘*’ or ‘/’"
     * @return calculation result
     */

    public static double Calculation(double firstNumber, double secondNumber, char operation){
        double result = 0;
        switch (operation) {
            case '+':
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
            case '*':
                result = firstNumber * secondNumber;
                break;
            case '/':
                result = firstNumber / secondNumber;
                break;
        }
        return result;
    }
}
