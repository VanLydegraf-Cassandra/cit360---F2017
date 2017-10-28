
package executable;
/*
    Imports
*/

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
/*
    Implement Executor
*/
public class Executors implements Executor{

    static ExecutorService newSingleThreadExecutor() {
        //Create object of threads
        ThreadController.FirstThread firstThread = new ThreadController.FirstThread();
        ThreadController.SecondThread secondThread = new ThreadController.SecondThread();
        System.out.println("Completed Thread counters");
        return null;
    }
    /*
        Can choose to place view here as well
    */
    public Executors(){
        
    }
    /*
        run the command
    */
    @Override
    public void execute(Runnable command){
        command.run();
    }
}
