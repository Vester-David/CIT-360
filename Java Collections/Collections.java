import java.util.*;


public class Collections {
    public static void main(String[] args) {
        ArrayList<String> food  = new ArrayList<String> ();
        // List of Food Items

        // Add food to Array List Collection
        food.add("Apples"); // Index of 0
        food.add("Chocolate");
        food.add("Peanuts");
        
        System.out.println(food); // Print all food items

        food.remove(2); // Remote food at Index = 2

        System.out.println(food); // Print food items after removing 2nd food item

        System.out.println(food.size);
        System.out.println(food.get);
    }
}