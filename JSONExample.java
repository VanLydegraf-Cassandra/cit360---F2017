/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package json.example;

import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Cassandra
 */
public class JSONExample {

    /**
     * @param args the command line arguments
     * @throws org.json.JSONException
     */
    public static void main(String[] args) throws JSONException {
        // Require throws JSONException

        // Encode JSONObject subclass HashMap
        JSONObject person = new JSONObject();

        //Fill HashMap with Objects
        person.put("name", "Cassandra");
        person.put("age", new Integer(26));
        person.put("height", new Double(61.25));
        person.put("married", true);

        System.out.print(person);
    }

}
