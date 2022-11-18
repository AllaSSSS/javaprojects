// Вывести все простые числа от 1 до 1000

public class allPrimes {
    public static void main(String[] args) {
        System.out.print(2);
        for(int i = 3; i <= 1000; i++) {
            boolean found = false;
            for(int j = 2; j < i; j++) {
                if (i % j == 0) {
                    found = true;
                    break;
                }
            }
            if (found) continue;
            System.out.print(" " + i);
        }
        System.out.println();
    }

}
