package junittesting;

/**
 *
 * @author Cassandra
 */
public class TestAssertArrayEquals {
    
    public boolean compareString(String one, String two){
        if(one.equalsIgnoreCase(two)){
            return true;
        } else{
            return false;
        }
    }
    
    public String concatString(String one, String two){
        return one.concat(two);
    }
    
    public int[] addOneToArray(int[] numbers){
        int length = numbers.length;
        int output[] = new int[length];
        for(int i=0; i<length; i++){
            output[i] = numbers[i] + 1;
        }
        return output;
    }
}
