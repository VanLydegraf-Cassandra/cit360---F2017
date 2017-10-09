/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionmap;

import java.util.*;
/**
 *
 * @author Cassandra
 */
public class CollectionMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //create empty map
        Map map = new HashMap();
        
        //add items to map
        map.put("user","Cassandra");
        map.put("job", "Stay at home mom");
        map.put("religion", "LDS");
        
        //cannot repeat key, can repeat value
        //repeated key will replace original key
        map.put("job", "student");
        
        //print all items
        System.out.println(map);
        
        //get item from map
        System.out.println(map.get("user"));
        
        Set<String> keys = map.keySet();
        
        keys.stream().forEach((key) -> {
            System.out.println(key + " is " + map.get(key));
        });
    }
}
