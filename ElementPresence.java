/* Check for Element Presence
* Objective: Learn to check if an element exists within a Set.
* Problem Statement: Given a Set of strings containing names,
* check if the name "John" is present. If it is, print
* "Found John"; otherwise, print "John is not in the Set".*/

import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

public class SetTask {
 public static void main(String[] args){
     //creating set to store integers
     Set<String> namesSet = new HashSet<>();

     //adding elements to the set
     namesSet.addAll(Arrays.asList("Afnan", "Tayba", "John"));

     //checking if element 'John' exits in set
     if(namesSet.contains("John")){
         System.out.println("\nFound John"); //printing "Found John" if it exists 
     } else {
         System.out.println("\nJohn is not in the Set"); //printing "John is not in the Set" if it doesn't exist 
     }
 }
}
