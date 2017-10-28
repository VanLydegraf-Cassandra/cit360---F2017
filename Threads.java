/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

import java.util.*;
/**
 *
 * @author Cassandra
 */
//class has to implement runnable
public class Threads implements Runnable{
    String name;
    int time;
    //used to randomize time
    Random r = new Random();
    
    public Threads(String x) {
        name = x;
        
        //999 is between zero and one second
        time = r.nextInt(999);
    }
    
    public void run(){
        try{
            System.out.printf("%s us sleeping for %d\n", name, time);
            
            //put thread to sleep
            Thread.sleep(time);
            System.out.printf("%s is awake\n", name);
        }catch(Exception e){}
    }
    
}
