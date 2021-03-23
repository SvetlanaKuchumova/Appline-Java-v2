package calculator5;

import calculator5.operations.Addition;
import calculator5.operations.Division;
import calculator5.operations.Multiplication;
import calculator5.operations.Subtraction;

import java.util.Scanner;

public class Calculator {
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
            switch (operation) {
                case '+':
                    Addition add = new Addition(firstNumber, secondNumber);
                    System.out.println(add.toString());
                    break;
                case '-':
                    Subtraction sub = new Subtraction(firstNumber, secondNumber);
                    System.out.println(sub.toString());
                    break;
                case '*':
                    Multiplication mult = new Multiplication(firstNumber, secondNumber);
                    System.out.println(mult.toString());
                    break;
                case '/':
                    Division div = new Division(firstNumber, secondNumber);
                    System.out.println(div.toString());
                    break;
            }
        } else {
            System.err.println("Input Error");
        }
        scan.close();
    }
}
