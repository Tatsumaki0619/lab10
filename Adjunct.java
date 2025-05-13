
/**
 * This is a program that will complete the full information for a adjunct empolyee 
 * based on the supper class Employee
 *
 * @author Qianyi Li
 * @version v1.0
 * @since 5/13/2025
 */
public class Adjunct extends Employee
{
    private double hours, hrRate;
    
    /**
     * This is a constructor that will initialize the adjunct employee's information based on user's input.
     * @param1 name The employee's full name
     * @param2 year The employee's hired date
     * @param3 idNum The employee's ID number
     * @param4 hours The employee's working hours
     * @param5 hrRate The employee's hour rate
     */
    public Adjunct(String name, int year, String idNum, double hours, double hrRate){
        super(name, year, idNum);
        this.hours = hours;
        this.hrRate = hrRate;
    }
    
    /**
     * This is a method that will calculate the salary for the adjunct employee
     * @return The adjunct employee's salary
     */
    public double getSalary(){
        return hours * hrRate;
    }
    
    /**
     * This is a toString method that will print out the information of the adjunct employee, including 
     * full name, hired date, ID number, working hours, hour rate and total salary.
     * @return The employee's information
     */
    public String toString(){
        String ans = String.format("Hours: %f, Hourly Rate: $%f, Salary: $%,.2f\n", hours, hrRate, getSalary());
        return super.toString() + ans;
    }
}
