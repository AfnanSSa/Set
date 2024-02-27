/* Calculate the Size of a Set
* Objective: Learn to find the number of elements in a Set.
* Problem Statement: After adding five elements to a Set of
* integers, calculate and print the size of the Set.*/

import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

public class SetTask {
 public static void main(String[] args){
     //creating set to store integers
     Set<String> namesSet = new HashSet<>();

     //adding 5 elements to the set
     namesSet.addAll(Arrays.asList("Afnan", "Tayba", "Noura", "Shaimaa", "Balqees"));

     //printing size of set
     System.out.println("\nSet's size: " + namesSet.size());
 }
}
