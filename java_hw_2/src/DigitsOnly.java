import java.util.Scanner;

public class DigitsOnly {
    public static void main(String[] args) {
        //Напишите программу, чтобы проверить, содержит ли данная строка только цифры.
        System.out.println("Введите строку: ");
        String string;
        try (Scanner input = new Scanner(System.in)) {
            string = input.nextLine();
        }
        for (int i = 0; i < string.length(); i++){
            if (!Character.isDigit(string.charAt(i))){
                System.out.println("В строке не только цифры");
                return;
            }
        }
        System.out.println("Только цифры");
    }
}