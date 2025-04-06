import java.util.Random;

public class MonteCarlo {

    private static Random random = new Random();

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Bitte geben Sie das Szenario und die Anzahl der Simulationen an.");
            return;
        }

        String scenario = args[0];
        int numSimulations = Integer.parseInt(args[1]);

        switch (scenario) {
            case "Pi":
                System.out.println(simulatePi(numSimulations));
                break;
            case "Stay":
            case "Switch":
                System.out.println(simulateMontyHall(numSimulations, scenario.equals("Switch")));
                break;
            case "TwoSixes":
                System.out.println(simulateDiceSequence(numSimulations, 6, 6));
                break;
            case "SixThenFive":
                System.out.println(simulateDiceSequence(numSimulations, 6, 5));
                break;
            default:
                System.out.println("Unknown scenario");
        }
    }

    private static double simulatePi(int n) {
        int insideCircle = 0;
        for (int i = 0; i < n; i++) {
            double x = random.nextDouble();
            double y = random.nextDouble();
            if (x * x + y * y <= 1) insideCircle++;
        }
        return 4.0 * insideCircle / n;
    }

    private static double simulateMontyHall(int n, boolean switchDoor) {
        int wins = 0;
        for (int i = 0; i < n; i++) {
            int prizeDoor = random.nextInt(3);
            int chosenDoor = random.nextInt(3);
            if (switchDoor) chosenDoor = 3 - chosenDoor - (chosenDoor == prizeDoor ? (chosenDoor + 1 + random.nextInt(2)) % 3 : 3 - chosenDoor - prizeDoor);
            if (chosenDoor == prizeDoor) wins++;
        }
        return (double) wins / n;
    }

    private static double simulateDiceSequence(int n, int first, int second) {
        int totalRolls = 0;
        for (int i = 0; i < n; i++) {
            int count = 0;
            while (true) {
                count++;
                if (random.nextInt(6) + 1 == first && random.nextInt(6) + 1 == second) break;
            }
            totalRolls += count;
        }
        return (double) totalRolls / n;
    }
}
