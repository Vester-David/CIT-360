import java.util.*;

// Collection Sets are similar to Lists but cannot contain duplicate values.
// Useful for abstraction and finding union, intersection and differences of set lists.

public class CollectionSet {
    public static void main(String[] args) {

        // Set Example
        Set<String> words  = new HashSet<String> ();
        // List of words

        // Add words to Set with duplicate value
        words.add("Tree");
        words.add("Sky");
        words.add("Land");
        words.add("Sky");
        words.add("Mountain");
        words.add("Sea");
        words.add("Forest");
        
        System.out.println(words); // Print all unique words

       
    }
}