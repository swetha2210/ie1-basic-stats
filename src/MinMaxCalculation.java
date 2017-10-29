import java.util.ArrayList;
import java.util.Scanner;

public class MinMaxCalculation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> numbers = new ArrayList<>();

        System.out.println("Enter numbers (type 'done' to finish:");
        while (scanner.hasNext()) {
            if (scanner.hasNextDouble()) {
                numbers.add(scanner.nextDouble());
            } else if (scanner.next().equalsIgnoreCase("done")) {
                break;
            } else {
                System.out.println("Input is not valid, please enter a valid number or 'done'.");
            }
        }

        if (numbers.isEmpty()) {
            System.out.println("No numbers input.");
            return;
        }

        double min_num = findMinNumber(numbers);
        double max_num = findMaxNumber(numbers);

        System.out.println("Minimum Number is " + min_num);
        System.out.println("Maximum Number is " + max_num);
    }

    public static double findMinNumber(ArrayList<Double> numbers) {
        double min = Double.MAX_VALUE;
        for (double num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static double findMaxNumber(ArrayList<Double> numbers) {
        double max = Double.MIN_VALUE;
        for (double num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}