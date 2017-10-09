/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionset;

import java.util.*;

/**
 *
 * @author Cassandra
 */
public class CollectionSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Store only unique elements
        
        //HashSet does not retain order
        //Set<String> set1 = new HashSet<>();
        
        //LinkedHashSet remembers the order you added items in
        //Set<String> set1 = new LinkedHashSet<>();
        
        //TreeSet sorts in natural order (strings - Alphabetical)
        Set<String> set1 = new TreeSet<>();
        
        //Check to see if set is empty
        if(set1.isEmpty()){
            System.out.println("set is empty at start");
        }
        //add elements
        set1.add("banana");
        set1.add("apple");
        set1.add("strawberry");
        set1.add("kiwi");
        set1.add("pear");
        set1.add("peach");
        
        //Check to see if set is empty
        if(set1.isEmpty()){
            System.out.println("Set is empty after adding");
        }
        
        //adding duplicate items does nothing
        set1.add("strawberry");
        
        System.out.println(set1);
        
        //Iterator
        for (String element : set1) {
            System.out.println(element);
        }
        
        //Does set contain an item?
        if(set1.contains("beef")){
            System.out.println("contains beef");
        }
        
        if(set1.contains("peach")){
            System.out.println("contains peach");
        }
        
        //intersection
        //set contains some of the same elements as set1
        Set<String> set2 = new TreeSet<>();
        
        //add elements
        set2.add("banana");
        set2.add("apple");
        set2.add("raspberry");
        set2.add("carrot");
        set2.add("tomato");
        set2.add("mango");
        
        //create copy of set1
        Set<String> intersect = new HashSet<>(set1);
        
        System.out.println(intersect);
        
        //keep only what is shared between the two lists
        intersect.retainAll(set2);
        
        System.out.println(intersect);
        
        //find elements different between two sets
        Set<String> difference = new HashSet<>(set1);
        
        difference.removeAll(set2);
        System.out.println(difference);
    }
}
