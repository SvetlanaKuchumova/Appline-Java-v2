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
     * @param x First number (double)
     * @param y Second number (double)
     * @param oper operation ‘+’, ‘-’, ‘*’ or ‘/’"
     * @return calculation result
     */

    public static double Calculation(double x, double y, char oper){
        double result = 0;
        switch (oper) {
            case '+':
                result = x + y;
                break;
            case '-':
                result = x - y;
                break;
            case '*':
                result = x * y;
                break;
            case '/':
                result = x / y;
                break;
        }
        return result;
    }
}
