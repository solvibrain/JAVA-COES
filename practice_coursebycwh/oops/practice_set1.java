import java.util.Scanner;

class Employee1{
    int salary;
    String name;
    public void setname( String n){
        name=n;
    }
    public String getname(){
        return name;
    }
    public int getsalary(){
        return salary;
    }

    public void printdetails(){
        System.out.println("Name of the employee is "+getname());
        System.out.println("Salary of the Employee is "+getsalary());
    }
}
public class practice_set1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in );
        String name;
        Employee1 e1=new Employee1();
        System.out.println("Eneter your salary : ");
        int sal=in.nextInt();
        System.out.println("Enter name of the Employee : ");
        name=in.nextLine();
        e1.setname(name);
        e1.salary=sal;
        // e1.printdetails();
       
       
        

    }
}
