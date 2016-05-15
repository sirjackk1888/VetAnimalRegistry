
package vetanimalregistry;

import java.util.*;

public class VetAnimalRegistry {
    
    public static void main(String[] args) {        
        registryAdmin database = new registryAdmin();        
        String userSelection;        
        System.out.println("Welcome to the Vet Animal Registry");
        
        do {
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("What would you like to do? Please enter (add, modify, view, or quit)");
        
        userSelection = keyboard.next();
        
            if("add".equals(userSelection)) {
            
                database.getInput();
            
            } else {
          
                if("modify".equals(userSelection)) {
                    
                    database.modifyInput();
                
                } else {
                    
                    if("view".equals(userSelection)) {
                
                    database.displayTable();
                
                    } else {
        
                        if("quit".equals(userSelection)) {
                            System.out.println("Thank you for using the Vet Animal Registry");
                            System.exit(0);
                
                        }
                    }
                }
            }
        
        } while (!userSelection.equals("add")||
                !userSelection.equals("modify") ||
                !userSelection.equals("view") ||
                !userSelection.equals("quit"));
    }
         
}


   
    


