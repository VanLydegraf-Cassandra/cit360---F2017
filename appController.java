package appconpat;

import java.util.HashMap;

/**
 *
 * @author Cassandra
 */
public class appController {

    /**
     *
     * Create instance of commandHashMap
     */
    public static HashMap<String,calcHandler> commandHashMap = new HashMap<>();
    
    public static void handleCommand(String command, Integer firstNumber, Integer secondNumber){
        
        // hashMap
        commandHashMap.put("+", new calcAdd());
        commandHashMap.put("*", new calcMultiply());
        commandHashMap.put("/", new calcDivide());
        commandHashMap.put("-", new calcSubtract());
        
        calcHandler handler = commandHashMap.get(command);
        
        handler.calculate(firstNumber, secondNumber);
    }
}
