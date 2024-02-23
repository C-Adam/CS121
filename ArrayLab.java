import java.util.*;

public class ArrayLab {

    public static void main(String[] args) {

        int capacity = 20;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter up to" + " " + capacity + " values");

        Double[] number_array = new Double[capacity];

        for(int i = 0; i < capacity; i++){
            double next_double = scanner.nextDouble();
            number_array[i] = next_double;
        }

        System.out.println(Arrays.toString(number_array));

    }
}
