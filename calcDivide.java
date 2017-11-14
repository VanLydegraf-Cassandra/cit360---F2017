package appconpat;

/**
 *
 * @author Cassandra
 */
public class calcDivide implements calcHandler{

    @Override
    public void calculate(Integer firstNumber, Integer secondNumber) {
        Integer total = firstNumber / secondNumber;
        System.out.println(total);
    }
    
}
