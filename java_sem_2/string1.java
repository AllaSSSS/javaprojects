package javaprojects.java_sem_2;

public package Task1;

/**
 * Program
 */
public class Program {
    private static String generateString(char c1, char c2, int length){
        StringBuilder builder = new StringBuilder();
        for(int i=0;i<length/2;i++)
            builder.append(new char[]{c1,c2});
        return builder.toString();
    }

    public static void main(String[] args) {
        String result = generateString('a', 'b', 10);
        System.out.println(String.format("Generated string: %s", result));

    }
    
}
