import java.util.*;

// Collection Set Trees sort data through natural order, doesn't allow duplicate values 


public class CollectionTree {
    public static void main(String[] args) {

        TreeSet<String> myTree = new TreeSet<String>(); 
  
        
        myTree.add("Ron");
        myTree.add("Tom");
        myTree.add("Dave"); 

        // try to add duplicate 
        myTree.add("Tom");  
  
        // prints  in alphabetical order 
        System.out.println(myTree); 
        
    }
}