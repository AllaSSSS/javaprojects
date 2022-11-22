import java.util.Scanner;

public class LunarGravity {
    //Сила тяжести на Луне составляет около 17% земной. Напишите программу, которая вычислила бы ваш вес на Луне.
    public static void main(String[] args) {
        System.out.println("Укажите свой вес: ");
        double weight;
        try (Scanner input = new Scanner(System.in)) {
            weight = input.nextDouble();
        }
        double lunarweight = weight / 100 * 17;
        System.out.println(lunarweight);
    }
}
