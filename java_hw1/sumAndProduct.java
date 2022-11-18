public class sumAndProduct {
    // Вычислить n-ое треугольное число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
    public static void main(String[] args) {
        int number = 5;
        int sum = calcTotalAmount(number);
        int product = calcTotalProduct(number);
        System.out.println(sum);
        System.out.println(product);
    }

    public static int calcTotalAmount(int value) {
        int result = 0;
        for (int i = 1; i <= value; i++) {
            result += i;
        }
        return result;
    }

    public static int calcTotalProduct(int value) {
        int result = 1;
        for (int i = 1; i <= value; i++) {
            result *= i;
        }
        return result;
    }

}
