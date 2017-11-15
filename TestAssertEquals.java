package junittesting;

/**
 *
 * @author Cassandra
 */
public class TestAssertEquals {
    public int add(String stringOne, String stringTwo){
        int integerOne = Integer.parseInt(stringOne);
        int integerTwo = Integer.parseInt(stringTwo);
        return integerOne + integerTwo;
    }
}
