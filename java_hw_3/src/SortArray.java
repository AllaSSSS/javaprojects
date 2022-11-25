import java.util.Arrays;
import java.util.Scanner;

public class SortArray {

    public static void main(String[] args) {
        int[] big = new int[20];
        try (Scanner scanner = new Scanner(System.in)) {
            for(int i=0; i < big.length; i++){
                System.out.println("Введите число " + (i+1) + ": ");
                big[i] = scanner.nextInt();
            }
        }

        Arrays.sort(big);
        int[] lo = Arrays.copyOf(big,10);
        int[] hi = Arrays.copyOfRange(big, 10, 20);
        System.out.println(Arrays.toString(lo));
        System.out.println(Arrays.toString(hi));
    }
}
