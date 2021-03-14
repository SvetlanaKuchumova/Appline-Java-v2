import java.util.Scanner;

public class MaxElemOfArrayAndCalculator3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Choose a task 1 - calculator, 2 - max string of array
        System.out.println("Enter number of task: (1 - calculator, 2 - find an element with a maximum length): ");
        int numberTask = scan.nextInt();

        switch (numberTask) {
            case 1:
                Calculator();
                break;
            case 2:
                MaxElementOfArray();
                break;
            default:
                System.err.println("Incorrect number of the task");
        }
        scan.close();
    }

    //Find an element with a maximum length
    public static void MaxElementOfArray() {
        Scanner scan = new Scanner(System.in);

        // Enter the number of elements of the array
        System.out.println("Enter the number of elements of the array: ");
        int numberElemArray = scan.nextInt();
        String[] wordArray = new String[numberElemArray]; // array of words

        wordArray[0] = scan.nextLine(); // Enter after nextInt()

        System.out.println("Enter elements of the array: ");
        for (int i = 0; i < numberElemArray; i++) {
            wordArray[i] = scan.nextLine();
        }

        // Initialize element with a maximum length
        int max = wordArray[0].length();
        int indexMax = 0;

        // Find element with a maximum length
        for (int i = 1; i < numberElemArray; i++) {
            if (wordArray[i].length() > max) {
                max = wordArray[i].length();
                indexMax = i;
            }
        }
        System.out.println("Element with a max length is: " + wordArray[indexMax]);
        scan.close();
    }

    // Calculator
    public static void Calculator() {
        Scanner scan = new Scanner(System.in);

        // Enter numbers
        System.out.println("This is a calculator: ");
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
        } else {
            System.err.println("Input Error");
        }
        scan.close();
    }

    // Calculation for Calculator (+ - * /)
    public static double Calculation(double x, double y, char oper) {
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
