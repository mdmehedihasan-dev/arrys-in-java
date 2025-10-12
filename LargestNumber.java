import java.util.*;

public class LargestNumber {

    public static int getLarge(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 5, 4, 7, 8, 9, 6};
        int index = getLarge(numbers);
        System.out.println(index);
    }
}
