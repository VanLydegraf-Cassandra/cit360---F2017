
package mymovielist.control;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import mymovielist.model.movie;
import mymovielist.view.MainMenuView;

/**
 *
 * @author Cassandra
 */
public class controller {
    
    Scanner myScanner = new Scanner(System.in);
    movie movie = new movie();
    
    Set<String> movieList = new TreeSet<>();

    // controller typically contains a hashMap
    
    
    
    
    
    
    
    
    
    // v or V
    public void viewList() {
        
        if(movieList.isEmpty()) {
            System.out.println("There are no movies on the movie list.");
        } else {
            System.out.println(movieList);
        }
        
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();
    }
    
    // n or N
    public void add() {
        
        System.out.println("What movie would you like to add?: ");
        String movieName = myScanner.nextLine();
        
        movie.setMovieTitle(movieName);
        
        movieList.add(movieName);
        
        System.out.println(movieName + " was added!");
        //System.out.println(movieList);
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();
    }

    // r or R
    public void remove() {
        
        System.out.print("What movie would you like to remove?: ");
        String movieName = myScanner.nextLine();
        
        movieList.remove(movieName);
        
        System.out.print(movieName + " was removed.");
        
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();
    }

    // d or D
    public void delete() {
        
        movieList.clear();
        
        System.out.print("Movie list has been cleared.");
        
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();
    }

    // e or E
    public void exitApp() {
        
        System.out.println("Goodbye!");
    }
}
