/**
 *
 * @author Cassandra
 */
public class ServletHandler {
    private String item;
    
    public ServletHandler(){
        item = null;
    }

    /**
     * @return the item
     */
    public String getItem() {
        return item;
    }

    /**
     * @param item the item to set
     */
    public void setItem(String item) {
        this.item = item;
    }
}
