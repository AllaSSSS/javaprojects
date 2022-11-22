public class Truthtable {
    public static void main(String[] args) {
        boolean p, q;
        System.out.printf("  p   |   q   | p & q%n");
        System.out.printf("------+-------+------%n");
        System.out.printf("%5s | %-5s | %s%n", p = false, q = false, p & q);
        System.out.printf("%5s | %-5s | %s%n", p = false, q = true , p & q);
        System.out.printf("%5s | %-5s | %s%n", p = true , q = false, p & q);
        System.out.printf("%5s | %-5s | %s%n", p = true , q = true , p & q);
    }
}