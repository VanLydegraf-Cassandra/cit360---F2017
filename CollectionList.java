/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionlist;

import java.util.*;
/**
 *
 * @author Cassandra
 */
public class CollectionList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create a ownMovies String
        String[] ownMovies ={"Ocean's 11", "Sabrina", "Bambi", "Hero 6"};
        //Create a List from ownMovies String
        List<String> list1 = new ArrayList<>();
        
        //add array items to list list1 (ownMovies)
        list1.addAll(Arrays.asList(ownMovies));
        
        //Create a wantMovies String
        String[] wantMovies = {"Ocean's 11", "Hero 6"};
        //Create a List from wantMovies String
        List<String> list2 = new ArrayList<>();
        
        //add array items to list list2 (wantMovies)
        list2.addAll(Arrays.asList(wantMovies));
        
        //for loop that prints all items from list1 (ownMovies list)
        list1.stream().forEach((list11) -> {
            System.out.printf("%s ", list11);
        });
        
        //run function editList with parameters list1 (ownMovies list) and list2 (wantMovies list)
        editList(list1, list2);
        //print new line
        System.out.println( );
        
        //for loop that prints all items from list1 (ownMovies list)
        list1.stream().forEach((list11) -> {
            System.out.printf("%s ", list11);
        });
    }

    //function editList
    private static void editList(List<String> list1, List<String> list2) {
        Iterator<String> it = list1.iterator();
            //while there is another item in the list do this function
            while(it.hasNext()){
                //if list2 contains an item that is in list one remove it
                if(list2.contains(it.next()))
                    it.remove();
            }
    }
}
