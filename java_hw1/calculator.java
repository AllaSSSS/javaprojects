import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int number1 = iScanner.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = iScanner.nextInt();
        System.out.print("Choose the operation type (+, -, *, /): ");
        //String operation = iScanner.next("[\\+\\-\\*\\/]");
        String operation = iScanner.next();
        iScanner.close();
        switch(operation) {
            case "+":
                System.out.println(number1 + number2);
                break;
            case "-":
                System.out.println(number1 - number2);
                break;
            case "*":
                System.out.println(number1 * number2);
                break;
            case "/":
                System.out.println(number1 / number2);
                break;
            default:
                System.err.println("Invalid operation");
                break;
        }

    }
    
}
