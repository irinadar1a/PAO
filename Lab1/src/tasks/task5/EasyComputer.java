package tasks.task5;

import java.util.Scanner;


public class EasyComputer {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert the operation");
        char operation = sc.next().charAt(0);

        System.out.println("Insert the first number");
        float firstNumber = sc.nextFloat();

        System.out.println("Insert the second number");
        float secondNumber = sc.nextFloat();

        float result;
        switch (operation){
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
            default:
                System.out.println("Operation not recognized !");
                result = 0;
        }

        System.out.println("The result is: " + result);

    }
}
