import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Benchmark {

    public static void main(String[] args) {
        System.out.printf("ArrayList - %dms%n", getTimeMs(new ArrayList<>()));
        System.out.printf("LinkedList - %dms%n", getTimeMs(new LinkedList<>()));
    }


    static final int OP_ADD = 0;
    static final int OP_REM = 1;
    static final int OP_GET = 2;
    static final int OP_SET = 3;

    static long getTimeMs(List<Integer> arr) {
        Random random = new Random();
        long start = System.nanoTime();
        for (int i=0; i < 10_000; i++) {
            switch (random.nextInt(4)) {
                case OP_ADD -> { arr.add(random.nextInt(10_000)); }
                case OP_REM -> { if (!arr.isEmpty()) arr.remove(random.nextInt(arr.size())); }
                case OP_GET -> { if (!arr.isEmpty()) arr.get(random.nextInt(arr.size())); }
                case OP_SET -> { if (!arr.isEmpty()) arr.set(random.nextInt(arr.size()), random.nextInt(10_000)); }
            }
        }
        return TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - start);
    }
}
