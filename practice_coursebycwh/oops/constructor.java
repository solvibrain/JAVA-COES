import java.util.Scanner;

class MymainEmployee{// defining a classs for using the constructor 
    int id;// Declaring attributes with default acces modifier
    String name;
    // this function is when we are not using constructor
    public void setter_of_attribute(String n,int i){// defing setter function that is going to initialising a value of the attribute.
        this.name=n; // this keyword this for using attributes and behavior of the same class
        this.id=i;
    }
    public String getname(){
        return this.name;
    }

    public int getid(){
        return this.id;
    }

    public MymainEmployee(String n,int i){// this method is constructor and constructor does not have return type.
        this.name=n;
        this.id=i;
    }

}


public class constructor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i;String n;
        System.out.println("Enter the name of the Employee : ");
        n=in.nextLine();
        System.out.println("Enter the id of the Employee  : ");
        i=in.nextInt();
        MymainEmployee e=new MymainEmployee(n, i);
        System.out.println("Name of the Employee is "+e.getname());
        System.out.println("id of the Employee is "+e.getid());

    }
}
