package threadexecutorrunnable;

//imports to use execute
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author Cassandra
 */
public class ThreadExecutorRunnable {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException{
        // TODO code application logic here

        //invoke execute method
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        
        //execute runnable
        executorService.execute(new Runnable(){
            
            @Override
            public void run(){
                try{
                            //first thread
        for (int i = 1; i <= 10; i++) {
            System.out.println("First Thread count :" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException interruptedException) {
                System.out.println("First Thread is interrupted");
            }
        }
        //second thread
        for (int i = 1; i <= 10; i++) {
            System.out.println("Second Thread count :" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException interruptedException) {
                System.out.println("Second Thread is interrupted");
            }
        }
                } catch(Exception e){
                    e.printStackTrace();
                }
            }
        });
        //stop executor
        executorService.shutdown();
    }
}
