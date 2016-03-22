package lab0;

/**
 * In this challenge you need to address the probability that at some
 * point the arguments to method parameters may not be valid. 
 * <p>
 * For example, String arguments may be null or empty; other objects may be 
 * null; or primitive numbers may be out of acceptable range.
 * <p>
 * You need to validate ALL method parameters to make sure any and all 
 * arguments are valid. The only exception is when any argument is acceptable 
 * based on requirements. Fix the code below using if logic to validate
 * method arguments and throw IllegalArgumentException or a custom
 * exception if the validation fails.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class Employee {
    public static final int MAX_VACATION_DAYS = 28;
    private String firstName;
    private String lastName;
    private String ssn;
    private int daysVacation;

    public Employee() {
        // initialize a bunch of default values
        firstName = "Unknown";
        lastName = "Unknown";
        ssn = "Unknown";
        daysVacation = 0;
    }

    public Employee(String firstName, String lastName, String ssn, int daysVacation) throws IllegalArgumentException {
        
        setFirstName(firstName);
        setLastName(lastName);
        setSsn(ssn);
        this.daysVacation = daysVacation;
    }
    
    public int getDaysVacation() {
        return daysVacation;
    }
    
    // cannot be negative and must be less than max 
    public void setDaysVacation(int daysVacation) throws IllegalArgumentException {
         if( daysVacation <0 || daysVacation > MAX_VACATION_DAYS)
               {
            throw new IllegalArgumentException(
            "Vacation days cannot be greater than max allowed.");
        }
        this.daysVacation = daysVacation;
    }

    public final String getFirstName() {
        return firstName;
    }
    // cannot be null and cannot be empty and min and max length
    // not more than 15 characters
    public final void setFirstName(String firstName)throws IllegalArgumentException  {
            if(firstName == null || firstName.isEmpty() ||
                firstName.length() <3 || firstName.length() >15){
            throw new IllegalArgumentException(
            "Sorry firstName is mandatory and must be between 3 and 15 characters in length.");
        }
        this.firstName = firstName;
    }

    public final String getLastName() {
        return lastName;
    }
    //cannot be null or empty.must be atleast 3 characters
    // not more than 15 characters
    public final void setLastName(String lastName)throws IllegalArgumentException  {
       if(lastName == null || lastName.isEmpty() ||
                lastName.length() <3 || lastName.length() >15){
            throw new IllegalArgumentException(
            "Sorry lastName is mandatory and must be between 3 and 15 characters in length.");
        } 
        this.lastName = lastName;
    }

    public final String getSsn() {
        return ssn;
    }

    public final void setSsn(String ssn) {
        // needs validation
        this.ssn = ssn;
    }
    
    
    
}
