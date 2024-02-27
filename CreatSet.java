/*Create and Populate a Set
* Objective: Learn how to create a Set, add elements to it, and print the entire Set.
* Problem Statement: Create a Set of integers and add the numbers 1, 2, 3, 4, and 5
* to it. Then, print the Set to the console.*/

import java.util.Set;
import java.util.HashSet;
public class SetTask {
 public static void main(String[] args){
     //creating set to store integers
     Set<Integer> mySet = new HashSet<>();

     //adding elements to the set
     mySet.add(1);
     mySet.add(2);
     mySet.add(3);
     mySet.add(4);
     mySet.add(5);

     //printing out the set
     System.out.println("\nSet:" + mySet);
 }
}
