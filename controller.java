
package mymovielist.control;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import mymovielist.view.MainMenuView;

/**
 *
 * @author Cassandra
 */
public class controller {

    Scanner myScanner = new Scanner(System.in);
    
    Set<String> movieList = new TreeSet<>();

    public void viewList() {
        
        if(movieList.isEmpty()) {
            System.out.println("There are no movies on the movie list.");
        } else {
            System.out.println(movieList);
        }
        
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();
    }
    
    public void add() {
        
        System.out.println("What movie would you like to add?: ");
        String movieName = myScanner.nextLine();
        
        movieList.add(movieName);
        
        System.out.println(movieName + " was added!");
        
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();
    }

    public void remove() {
        
        System.out.print("What movie would you like to remove?: ");
        String movieName = myScanner.nextLine();
        
        movieList.remove(movieName);
        
        System.out.print(movieName + " was removed.");
        
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();
    }

    public void delete() {
        
        movieList.clear();
        
        System.out.print("Movie list has been cleared.");
        
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();
    }

    public void exitApp() {
        
        System.out.println("Goodbye!");
    }
}
