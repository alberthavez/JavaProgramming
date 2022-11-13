package day02_HelloWorld;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give me the first number");
        double number1 = scan.nextInt();

        System.out.println("Give me an operand. Hint: + / * -");
        char ops = scan.next().charAt(0);

        System.out.println("Give me the second number");
        double number2 = scan.nextInt();
        scan.close();

      //  System.out.println(ops);

        if (ops == '-') {
            System.out.println("The result of the Subtraction = " + (number1 - number2));

        } else if ('*' == ops) {
            System.out.println("The result of the Multiplication = " + (number1 * number2));

        } else if ('/' == ops) {
            System.out.println("The result of the Division = " + (number1 / number2));

        } else if ('+' == ops) {
            System.out.println("The result of the Addition = " + (number1 + number2));

        } else {
            System.out.println("Sorry! The " + ops +" operand is not defined.");

        }

    }
}