/* Explore Set Uniqueness
* Objective: Understand how Sets automatically remove duplicates.
* Problem Statement: Add the numbers 2, 4, 4, 5, 6, and 6 to a Set
* of integers. Print the Set and observe the output.*/

import java.util.Set;
import java.util.HashSet;

public class SetTask {
 public static void main(String[] args){
     //creating set to store integers
     Set<Integer> mySet = new HashSet<>();

     //adding elements to the set
     mySet.add(2);
     mySet.add(4);
     mySet.add(4);
     mySet.add(5);
     mySet.add(6);
     mySet.add(6);

     //printing out the set
     System.out.println("\nSet:" + mySet); 
 }
}
