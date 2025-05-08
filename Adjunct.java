
/**
 * Write a description of class Adjunct here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Adjunct extends Employee
{
    private double hours, hrRate;
    public Adjunct(String name, int year, String idNum, double hours, double hrRate){
        super(name, year, idNum);
        this.hours = hours;
        this.hrRate = hrRate;
    }
    
    public double getSalary(){
        return hours * hrRate;
    }
    
    public String toString(){
        String ans = String.format("Hours: %f, Hourly Rate: $%f, Salary: $%,.2f\n", hours, hrRate, getSalary());
        return super.toString() + ans;
    }
}
