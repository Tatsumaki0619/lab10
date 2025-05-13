
/**
 * This is a program that will complete the full information for a full time empolyee 
 * based on the supper class Employee
 *
 * @author Qianyi Li
 * @version v1.0
 * @since 5/13/2025
 */
public class FullTime extends Employee
{
    private double salary;
    
    /**
     * This is a no-arg consturctor that will initialize the employee's information.
     * For this constructor, it will set salary into 0. 
     */
    public FullTime(){
        super();
        salary = 0;
    }
    
    /**
     * This is a constructor that will initialize the full time employee's information based on user's input.
     * @param1 name The employee's full name
     * @param2 year The employee's hired date
     * @param3 idNum The employee's ID number
     * @param4 salary The employee's salary
     */
    public FullTime(String name, int year, String idNum, double salary){
        super(name, year, idNum);
        this.salary = salary;
    }
    
    /**
     * This is a setter method that will set the value of salary based on the information the user provided.
     * param1 totalSalary the employee's salary
     */
    public void setSalary(double totalSalary){
         salary =  totalSalary;
    }
    
    /**
     * This is a toString method that will print out the information of the full time employee, including 
     * full name, hired date, ID number and salary.
     * @return The employee's information
     */
    public String toString(){
        String ans = String.format("Salary: $%,.2f\n", salary);
        return super.toString() + ans;
    }
}
