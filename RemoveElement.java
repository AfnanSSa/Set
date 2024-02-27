/* Remove an Element from a Set
* Objective: Practice removing an element from a Set.
* Problem Statement: Create a Set of integers, add some
* numbers to it, and then remove the number 3. Print the
* Set before and after the removal.*/

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
     
     //removing element '3' from the set
     integersSet.remove(3);

     //printing out the set after removing '3'
     System.out.println("\nSet after removing element 3: " + integersSet);
 }
}
