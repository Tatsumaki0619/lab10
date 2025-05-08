
/**
 * Write a description of class Employee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Employee extends Person
{
    private int hireYear;
    private String idNum;
    
    public Employee(){
        super();
        hireYear = 0;
        idNum = "Onboarding";
    }
    
    public Employee(String name, int hireYear, String idNum){
       super(name);
       this.hireYear = hireYear;
       this.idNum = idNum;
    }
    
    public boolean equals(Object o){
        boolean isEqual = false;
        if(o != null && getClass() == o.getClass()){
            Employee copy = (Employee)o;
            if(idNum.equalsIgnoreCase(copy.idNum)){
                isEqual = true;
            }
        }
        return isEqual;
    }
    
    public int getServiceYears(){
        return CURRENT_YEAR - hireYear;
    }
    
    public int getHireDate(){
        return hireYear;
    }
    
    public String getIDNum(){
        return idNum;
    }
    
    public void setHireDate(int hireYear){
        this.hireYear = hireYear;
    }
    
    public void setIDNum(String idNum){
        this.idNum = idNum;
    }
    
    public String toString(){
        String ans = String.format("ID Number: %s\nYear Hired: %d Years of Service: %d\n",
        getIDNum(), getHireDate(), getServiceYears());
        
        return super.toString() + ans;
    }
}
