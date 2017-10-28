package threads;

import java.util.Random;


/**
 *
 * @author Cassandra
 */
public class Thread2 {
    String loading;
    int time;
    
    //used to randomize time
    Random r = new Random();
    
    public Thread2(String x) {
        loading = x;
        
        //999 is between zero and one second
        time = r.nextInt(999);
    }
    
    public void run(){
        try{
            System.out.printf("%s us sleeping for %d\n", loading, time);
            
            //put thread to sleep
            Thread.sleep(time);
            System.out.printf("%s is awake\n", loading);
        }catch(Exception e){}
    }
}

