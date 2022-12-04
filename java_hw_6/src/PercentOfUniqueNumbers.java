import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class PercentOfUniqueNumbers {

    public static void main(String[] args) {
        PercentOfUniqueNumbers uniqueNumbers = new PercentOfUniqueNumbers();
        int[] array = uniqueNumbers.initArray();
        System.out.println(uniqueNumbers.getPercentUniqueValues(array) + "%");
    }

    public int[] initArray(){
        return new Random().ints(1000, 0, 25).toArray();
    }


    public double getPercentUniqueValues(int[] array){
        return IntStream.of(array).boxed().distinct().count() * 100.0 / array.length;
    }
}