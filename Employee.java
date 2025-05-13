
/**
 * This is a program that will initialize the empolyee's inforamtion including 
 * full name, hired date, ID number based on the supper class Person
 *
 * @author Qianyi Li
 * @version v1.0
 * @since 5/13/2025
 */
public class Employee extends Person
{
    private int hireYear;
    private String idNum;
    
    /**
     * This is a no-arg constructor that will initialize the employee's information by setting 
     * full name to "No name yet", hire date to 0 and ID number to "Onboarding"
     */
    public Employee(){
        super();
        hireYear = 0;
        idNum = "Onboarding";
    }
    
    /**
     * This is a constructor that will initialize the employee's information including full name,
     * hire date and ID number.
     * @param1 name This is employee's full name
     * @param2 hireYear This is employee's hire date
     * @param3 idNum This is employee's ID number
     */
    public Employee(String name, int hireYear, String idNum){
       super(name);
       this.hireYear = hireYear;
       this.idNum = idNum;
    }
    
    /**
     * This is a method that will check the employee's information by examining the ID number.
     * @param o This is employee who needs to be checked
     * @return the result after testing
     */
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
    
    /**
     * This is a getter method that will provide the service year from one employee
     * @return The employee's years of serivce
     */
    public int getServiceYears(){
        return CURRENT_YEAR - hireYear;
    }
    
    /**
     * This is a getter method that will provide the employee's hire date
     * @return The employee's hire dates
     */
    public int getHireDate(){
        return hireYear;
    }
    
    /**
     * This is a getter method that will provide the employee's ID number
     * @return The employee's ID number
     */
    public String getIDNum(){
        return idNum;
    }
    
    /**
     * This is a setter method that will set the employee's hire year based on the user's input
     */
    public void setHireDate(int hireYear){
        this.hireYear = hireYear;
    }
    
    /**
     * This is a setter method that will set the employee's ID number based on the user's input
     */
    public void setIDNum(String idNum){
        this.idNum = idNum;
    }
    
    /**
     * This is a toString method that will print out the information of the employee, including 
     * full name, hired date and ID number.
     * @return The employee's information
     */
    public String toString(){
        String ans = String.format("ID Number: %s\nYear Hired: %d Years of Service: %d\n",
        getIDNum(), getHireDate(), getServiceYears());
        
        return super.toString() + ans;
    }
}
