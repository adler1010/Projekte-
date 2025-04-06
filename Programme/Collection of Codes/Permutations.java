public class Permutations {

    public static void main(String[] args) {
        generatePermutations("", join(args));
    }

    private static void generatePermutations(String prefix, String str) {
        int n = str.length();
        if (n == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                generatePermutations(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n));
            }
        }
    }

    private static String join(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (String arg : args) {
            builder.append(arg);
        }
        return builder.toString();
    }
}
