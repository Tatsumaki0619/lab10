
/**
 * This is a program that generate the employee's information including their full name,
 * hired date, work number and salary. The program can also check whether the employee's 
 * information's correctness.
 *
 * @author Qianyi Li
 * @version v1.0
 * @since 5/13/2025
 */
public class HRDemo
{
    public static void main(String []args){
        FullTime fred = new FullTime("Flinstone, Fred", 2013, "BR-1", 75000.1234);
        Adjunct barney = new Adjunct("Rubble, Barney", 2014, "BR-2", 320, 60.55);
        FullTime wilma = new FullTime();
        
        wilma.setName("Flintstone Wilma");
        wilma.setIDNum("BR-3");
        wilma.setHireDate(2016);
        wilma.setSalary(78123.246);
        
        Employee betty = new Employee("Rubble, Betty", 2020, "BR-4");
        
        FullTime wilma2 = new FullTime("Slate, Wilma", 2016, "BR-3", 78123.2468);
        
        int index = 1;
        Person[] staff = new Person[]{fred, barney, wilma, betty, wilma2};
        for(Person person: staff){
            System.out.println("Employee" + index);
            System.out.println(person);
            index++;
        }
        
        boolean flag = wilma.equals(wilma2);
        System.out.println("wilma and wilma2 are the same person: " + flag + '\n');
        if(flag == true){
            wilma.setName(wilma2.getName());
        }
        
        int index2 = 1;
        Person[] newStaff = new Person[]{fred, barney, wilma, betty};
        for(Person info: newStaff){
            System.out.println("Employee" + index2);
            System.out.println(info);
            index2++;
        }
    }
}
