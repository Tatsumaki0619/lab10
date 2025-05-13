
/**
 * This is a program that initialize a person's information including full name.
 *
 * @author Qianyi Li
 * @version v1.0
 * @since 5/13/2025
 */
public class Person
{
    private String name;
    public final int CURRENT_YEAR = 2025;
    
    /**
     * This is a no-arg constructor that will initialize the person's name into "No name yet"
     */
    public Person(){
        name = "No name yet";
    }
    
    /**
     * This is a constructor that will initialize the person's full name based on the user's input
     */
    public Person(String name){
        this.name = name;
    }
    
    /**
     * This is asetter method that will set the person's name
     */
    public void setName(String name){
        this.name = name;
    }
    
    /**
     * This is a getter method that will provide the person's full name
     * @return The person's full name
     */
    public String getName(){
        return name;
    }
    
    /**
     * This is a toString method that will print out the person's full name
     * @return the person's full name
     */
    public String toString(){
         String ans = String.format("Name: %s\n", name);
         return ans;
    }
}
