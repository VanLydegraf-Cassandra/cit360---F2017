/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionqueue;

import java.util.*;
/**
 *
 * @author Cassandra
 */
public class CollectionQueue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create queue
        Queue<Integer> lineup = new LinkedList<>();
        
        //add elements to queue
        lineup.add(1);
        lineup.add(2);
        lineup.add(3);
        
        System.out.println(lineup);
        
        //Iterator
        Iterator<Integer> iterator = lineup.iterator();
        
        //How to get all elements from the queue
        while(iterator.hasNext()){
            Integer value = iterator.next();
            System.out.println(value);
        }
        
        //add to end of queue and see it was added
        //if failed add throws exception
        boolean isAdded = lineup.add(4);
        System.out.println(isAdded);
        System.out.println(lineup);
        
        //if failed offer throws false
        isAdded = lineup.offer(5);
        System.out.println(isAdded);
        System.out.println(lineup);
        
        //get and remove element from queue
        //if failed remove throws exception
        Integer removedElement = lineup.remove();
        System.out.println(removedElement);
        System.out.println(lineup);
        
        //if failed poll throws false
        removedElement = lineup.poll();
        System.out.println(removedElement);
        System.out.println(lineup);
    }
}
