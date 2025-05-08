
/**
 * Write a description of class FullTime here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FullTime extends Employee
{
    private double salary;
    public FullTime(){
        super();
        salary = 0;
    }
    
    public FullTime(String name, int year, String idNum, double salary){
        super(name, year, idNum);
        this.salary = salary;
    }
    
    public void setSalary(double totalSalary){
         salary =  totalSalary;
    }
    
    public String toString(){
        String ans = String.format("Salary: $%,.2f\n", salary);
        return super.toString() + ans;
    }
}
