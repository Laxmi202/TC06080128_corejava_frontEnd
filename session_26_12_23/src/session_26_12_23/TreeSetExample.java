package session_26_12_23;

import java.util.TreeSet;

public class TreeSetExample 
{
	public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();

        // Inserting String objects into the TreeSet
        treeSet.add("Rahul");
        treeSet.add("John");
        treeSet.add("Alice");
        treeSet.add("Bob");

        // Displaying in alphabetical order
        System.out.println("Alphabetical Order:");
        for (String str : treeSet) {
            System.out.println(str);
        }

        // Displaying in reverse alphabetical order
        System.out.println("\nReverse Alphabetical Order:");
        TreeSet<String> reverseTreeSet = new TreeSet<>(treeSet.descendingSet());
        for (String str : reverseTreeSet) {
            System.out.println(str);
        }
    }
	

}
