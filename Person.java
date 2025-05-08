
/**
 * Write a description of class Lab10 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person
{
    private String name;
    public final int CURRENT_YEAR = 2025;
    
    public Person(){
        name = "No name yet";
    }
    
    public Person(String name){
        this.name = name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public String toString(){
         String ans = String.format("Name: %s\n", name);
         return ans;
    }
}
