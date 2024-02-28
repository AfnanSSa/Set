/* Iterate Through a Set
* Objective: Learn to iterate over a Set and print each element.
* Problem Statement: Create a Set containing the names of fruits
* (e.g., "Apple", "Banana", "Cherry") and use a loop to print
* each name individually.*/

import java.util.Set;
import java.util.HashSet;

public class SetTask {
 public static void main(String[] args){
     //creating set
     Set<String> mySet = new HashSet<>();

     //adding elements to the set
     mySet.add("Apple");
     mySet.add("Banana");
     mySet.add("Cherry");

     //iterating through the set print each element individually using enhanced for loop
     for (String s : mySet){
         System.out.println(s);
     }
 }
}
