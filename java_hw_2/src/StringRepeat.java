import java.util.Scanner;

public class StringRepeat {
    // Напишитепрограмму для объединения данной строки с самой собой заданное количество раз
    // (количество и строку мы вводим).
    public static void main(String[] args) {
        String string;
        int count;
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Введите строку: ");
            string = input.nextLine();
            System.out.println("Сколько раз повторить строку? ");
            count = input.nextInt();
        }
        StringBuilder buffer = new StringBuilder(string.length() * count);
        for (int i=0; i < count; i++){
            buffer.append(string);
        }
        System.out.println(buffer);
    }
}
