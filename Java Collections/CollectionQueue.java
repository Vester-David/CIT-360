import java.util.*;

// Collection Queues is an ordered list with a first-in-first-out principle. 


public class CollectionQueue {
    public static void main(String[] args) {

        // Set Example
        Queue<String> employees  = new LinkedList<String> ();
        // List of employees

        // Add employees to queue
        employees.add("Chris");
        employees.add("Jerry");
        employees.add("Andy");
        employees.add("Josh");
        employees.add("Curt");
        employees.add("Montez");
            
        // Print employees
        System.out.println("Employees: " + employees); 
        
        // Print size of queue list
        int size1 = employees.size();
        System.out.println("Total number of employees: " + size1);
        
        // remove employee at head of list and print
        String head1 = employees.remove();
        System.out.println("Removed Employee at Head of Queue: " + head1);
        System.out.println("Employees: " + employees);
        
        // check new head of queue
        String head2 = employees.peek();
        System.out.println("New Head of Queue: " + head2);
        
        // add another employee and print showing new employee at end of queue
        employees.add("David");
        System.out.println("Employees: " + employees);

        // print 
        int size2 = employees.size();
        System.out.println("Total number of employees: " + size2);

       
    }
}