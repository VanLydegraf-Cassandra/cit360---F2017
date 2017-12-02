
// import classes and libraries
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author Cassandra
 */

// write a publicly accessible class that extends the HttpServlet class
public class demoServlet extends HttpServlet{
    
    //
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException{
        // set the content type
        res.setContentType("text/html");
        
        // get the stream to write the data
        PrintWriter pw=res.getWriter();
        
        // get the parameter name
        String name=req.getParameter("name");
        
        // write HTML in the stream
        pw.println("Welcome " + name + " to the Servlet Demonstration");
        
        // close the stream
        pw.close();
    }
}
