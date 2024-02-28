/* Clear a Set
* Objective: Learn how to remove all elements from a Set.
* Problem Statement: Create a Set, add some elements to it,
* and then remove all elements from the Set. Verify it's
* empty by printing its size.*/

import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

public class SetTask {
 public static void main(String[] args){
     //creating set to store integers
     Set<Integer> integersSet = new HashSet<>();

     //adding elements to the set
     integersSet.addAll(Arrays.asList(1, 2, 3, 4, 5, 6));

     //printing th set
     System.out.println("\nSet: " + integersSet);

     //removing all elements
     integersSet.removeAll(integersSet);
  
     //printing out the set after removing all elements 
     System.out.println("\nSet after clear: " + integersSet);
 }
}
