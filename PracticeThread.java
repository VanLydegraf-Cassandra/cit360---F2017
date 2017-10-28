/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

/**
 *
 * @author Cassandra
 */
public class PracticeThread {
    public static void main (String[] args){
        
        //will not implement class if it is not a runnable
        Thread t1 = new Thread(new Threads("starting application"));
        Thread t2 = new Thread(new Threads("loading JavaScript"));
        Thread t3 = new Thread(new Threads("loading XML files"));
        Thread t4 = new Thread(new Threads("Checking Hibernate"));
        Thread t5 = new Thread(new Threads("Connecting to Database"));
        Thread t6 = new Thread(new Threads("Connecting to Server"));
        
        //how to start a thread, call to run
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
    }
}
