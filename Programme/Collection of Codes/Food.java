import java.util.Arrays;
import java.util.Random;

public class Food implements Comparable<Food> {
    
    private static final String[] TYPES = {"Apple", "Pear", "Cookie", "Grape"};
    private String type;
    private int calories;

    public Food(String type, int calories) {
        if (Arrays.asList(TYPES).contains(type)) {
            this.type = type;
        } else {
            throw new IllegalArgumentException("Invalid food type");
        }
        this.calories = calories;
    }

    public String toString(){
        return "Type: " + this.type + ", Calories: " + this.calories;
    }

    public int compareTo(Food o) {
        int thisValue = this.type.length() * this.calories;
        int otherValue = o.type.length() * o.calories;
        return Integer.compare(thisValue, otherValue);
    }

    public String getType() {
        return this.type;
    }

    public int getCalories() {
        return this.calories;
    }

    public static Food[] createSortedRandomList(int n) {
        Food[] foods = new Food[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            String type = TYPES[random.nextInt(TYPES.length)];
            int calories = random.nextInt(500); // Random calories up to 500
            foods[i] = new Food(type, calories);
        }
        Arrays.sort(foods);
        return foods;
    }

    public static void main(String[] args) {
        Food[] sortedFoods = createSortedRandomList(10);
        for (Food food : sortedFoods) {
            System.out.println(food);
        }
    }
}
