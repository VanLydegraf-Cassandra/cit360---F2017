/*
Author: Cassandra
 */
package executable;
/*
    Imports
*/
import java.util.concurrent.ExecutorService;

/*
    Main class
*/
public class Executable {
    /*
        Execution of main class
    */
    public static void main(String[] args) {
        /*
            Invoke execute method
        */
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        /*
            Shut down execution when finished
            Execution automatically shuts down when finished counting to 10
            because I have set the thread to run a for loop that stops after
            it counts to 10
        */
        //executorService.shutdown();
    }
}
