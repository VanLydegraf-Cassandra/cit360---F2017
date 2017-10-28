
package executable;
/*
    Imports
*/
import executable.ThreadController.FirstThread;
import executable.ThreadController.SecondThread;


/*
    Implements runnable
*/
public class Runnables implements Runnable{
    /*
        Variables
    */
    
    /*
        Method
    */
    public Runnables(){
    
    }
    /*
        This method is ran when a thread is executed
    */
    @Override
    public void run() {
        //Create object of threads
        FirstThread firstThread = new ThreadController.FirstThread();
        SecondThread secondThread = new ThreadController.SecondThread();
    }  
}
