import java.util.Arrays;
import java.util.Enumeration;

public class Main {

    private Main(){

    }

    public static void main(String[] args) {
        int[] integers = {1, 4, 7, 9, 11, 10, 12, 33, 24, 20};

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int integer : integers){
            min = Math.min(min, integer);
        }
        System.out.println(min);

        for (int integer : integers){
            max = Math.max(max, integer);
        }
        System.out.println(max);

        int sum = 0;
        for (int integer : integers){
            sum += integer;
        }

        double average = (double) sum / integers.length;
        System.out.println(average);

        for (int integer : integers){
            if (integer % 2 == 0){
                System.out.println(integer);
            }
        }

    }
}
