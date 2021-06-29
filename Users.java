
package libmansys;
import java.util.Scanner;
import java.util.*;
/**
 *
 * @author Lenovo
 */
public class Users {
    
    public static ArrayList<String> names = new ArrayList<String>();
    public static String currentUser;
    
    public static String list() {
        
        
        
        if (names.size()==0) {
                System.out.println("\nNO USERS HAVE BEEN ADDED YET");
               
            }
        
        for (int i = 0; i < names.size(); i++) {
            if (names != null) {

                System.out.println("Name: " + names.get(i));


            }
        }
        return "";
    }

    public static String set() {
        Scanner inputs = new Scanner(System.in);
        System.out.println("\nPlease enter the username:");
        String input = inputs.nextLine();
        names.add(input);
        
        return "";
    }
    
    public static String select() {
        Scanner inputs = new Scanner(System.in);
        System.out.println("\nPlease enter the username:");
        String input = inputs.nextLine();
        int success =0;
        for(String name : names){
            if(name.equals(input)){
                System.out.println("\nWelcome user : "+input);
                currentUser=input;
                success=1;
            }
            
        
        }
        if(success==0){
                System.out.println("\n"+input+" is not in the list of users.");
            }
        
        return "";
    }

}
