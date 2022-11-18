import java.time.LocalDateTime;
import java.util.Scanner;

public class hello {

//     public static void main(String[] args) {
//         System.out.println("hello, world");
//         System.out.println(LocalDateTime.now());
//     }
// }


    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Как вас зовут?");
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s%n", name);
        iScanner.close();

    }

}