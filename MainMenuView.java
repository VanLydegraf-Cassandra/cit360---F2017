package mymovielist.view;

import java.util.Scanner;
import mymovielist.control.controller;

/**
 *
 * @author Cassandra
 */
public class MainMenuView{
    
    Scanner myScanner = new Scanner(System.in);
    controller controller = new controller(); 
    
    public MainMenuView() {
        System.out.println("\n------------------------------"
                          +"\n- Main Menu                  -"
                          +"\n------------------------------"               
                          +"\n- V - View movie list        -"
                          +"\n- N - Add new movie          -"
                          +"\n- R - Remove movie           -"
                          +"\n- D - Delete all movies      -"
                          +"\n- E - Exit application       -"
                          +"\n------------------------------");
    }

    public void display() {
        System.out.println("Select the menu option you would like to perform: ");
        String menuOption = myScanner.nextLine();

        switch(menuOption.charAt(0)){
            case 'V':
                this.viewList();
                break;
            case 'v':
                this.viewList();
                break;
            case 'N':
                this.add();
                break;
            case 'n':
                this.add();
                break;
            case 'R':
                this.remove();
                break;
            case 'r':
                this.remove();
                break;
            case 'D':
                this.delete();
                break;
            case 'd':
                this.delete();
                break;
            case 'E':
                this.exit();
                break;
            case 'e':
                this.exit();
                break;
            default:
                System.out.println("Invalid value, try again");
        }
    }

    private void viewList() {
        controller.viewList();
    }

    public void add() {
        controller.add();
    }

    public void remove() {
        controller.remove();
    }

    public void delete() {
        controller.delete();
    }

    private void exit() {
        controller.exitApp();
    }
}
