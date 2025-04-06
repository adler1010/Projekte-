import java.util.HashMap;
import java.util.Map;

public class Statistics {

    public static void main(String[] args) {
        double sum = 0;
        double squaredSum = 0;
        int n = args.length;

        Map<Integer, Integer> histogram = new HashMap<>();

        for (String arg : args) {
            int value = Integer.parseInt(arg);
            sum += value;
            squaredSum += value * value;
            histogram.put(value, histogram.getOrDefault(value, 0) + 1);
        }

        double mean = sum / n;
        double variance = squaredSum/n - mean*mean;
        double stdDeviation = Math.sqrt(variance);

        System.out.printf("Mittelwert: %.2f%n", mean);
        System.out.println("Summe: " + (int) sum);
        System.out.printf("Standardabweichung: %.8f%n", stdDeviation);
        System.out.printf("Varianz: %.9f%n", variance);

        System.out.println("\nHistogram:");
        for (int i = 1; i <= 6; i++) {
            System.out.println(i + ": " + "*".repeat(histogram.getOrDefault(i, 0)));
        }
    }
}
