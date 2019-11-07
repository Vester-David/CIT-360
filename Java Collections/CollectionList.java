import java.util.*;

// Collection lists are dynamic arrays with built-in methods to manage, compare, sort, link list elements. 
// Lists or collections can contain dupliate elements. 


public class CollectionList {
    public static void main(String[] args) {

        // Array List Example
        ArrayList<String> food  = new ArrayList<String> ();
        // List of Food Items

        // Add food to Array List Collection
        food.add("Apples"); // Index of 0
        food.add("Chocolate");
        food.add("Peanuts");
        
        System.out.println(food); // Print all food items

        food.remove(2); // Remove food at Index = 2

        System.out.println(food); // Print food items after removing 2nd food item

        System.out.println(food.size());

        System.out.println(food.get(1));
       
    }
}