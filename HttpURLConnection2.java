/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package httpurlconnection2;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mathew
 */
public class HttpURLConnection2 {

    /**
     * @param args the command line arguments
     * @throws java.net.MalformedURLException
     */
    public static void main(String[] args) throws MalformedURLException, IOException {
        // TODO code application logic here
          URL url = new URL("http://localhost:8080/");
   HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
   try {
     InputStream in = new BufferedInputStream(urlConnection.getInputStream());
     readStream(in);
   } finally {
     urlConnection.disconnect();
     if (urlConnection != null) {
         System.out.println("Connection still open");
     } else {
         System.out.println("Connection is closed");
     }
   }
    }
    private static void readStream(InputStream in) {
        System.out.println(in);
        try {
            in.close();
        } catch (IOException ex) {
            Logger.getLogger(HttpURLConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   
}
