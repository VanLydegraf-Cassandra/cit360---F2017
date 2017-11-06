package mymovielist.view;

/**
 *
 * @author Cassandra
 */
public class ProgramView{
    
    public void startProgram(){
        this.displayBanner();
        
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();
    }

    public void displayBanner() {
        System.out.println("--------------------------------------"
                        +"\n-                                    -"
                        +"\n- Create your own movie list with My -"
                        +"\n- Movie List.                        -"
                        +"\n-                                    -"
                        +"\n--------------------------------------");
    }   
}
