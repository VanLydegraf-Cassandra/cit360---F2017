package appconpat;

/**
 *
 * @author Cassandra
 */
public class calcSubtract implements calcHandler{

    @Override
    public void calculate(Integer firstNumber, Integer secondNumber) {
        Integer total = firstNumber - secondNumber;
        System.out.println(total);
    }
    
}
