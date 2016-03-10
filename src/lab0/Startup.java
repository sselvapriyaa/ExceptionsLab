package lab0;

/**
 *
 * @author Instlogin
 */
public class Startup {

    public static void main(String[] args) {
//try{
        Employee emp = new Employee("Jim","Smith","3333333333",28);
        
        // Think about this code. It wouldn't work if lastName was null
        String lastName="null";
        String fullNameInCaps = 
                       emp.getFirstName().toUpperCase() 
                + " " + emp.getLastName().toUpperCase();
        
        System.out.println(emp.getFirstName() + " " +emp.getLastName() 
                + " " +emp.getDaysVacation());
       
    
}
}
//    catch (Exception e) { 
//    
//    System.out.println(e.getMessage());
//     
//    }
//}
//}
