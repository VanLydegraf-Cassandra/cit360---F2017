
package executable;
/*
    Imports
*/

/*
    extends Thread
*/
public class ThreadController extends Thread{
    /*
        Variables
    */
    public ThreadController(){
        
    }
    /*
        First Thread
    */
    static class FirstThread {

        public FirstThread() {
            for(int i=1; i<=10; i++){
                System.out.println("First Thread count :" +i);
                try{
                    Thread.sleep(1000);
                } catch (InterruptedException interruptedException){
                    System.out.println("First Thread is interrupted");
                }    
            }
        }
    }
    /*
        Second Thread
    */
    static class SecondThread {

        public SecondThread() {
            for(int i=1; i<=10; i++){
                System.out.println("Second Thread count :" +i);
                try{
                    Thread.sleep(1000);
                } catch (InterruptedException interruptedException){
                    System.out.println("Second Thread is interrupted");
                }    
            }     
        }
    } 
}
