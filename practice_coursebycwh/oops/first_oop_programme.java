
// In one java programme there is only one primary class 

class Employee{// defining a class and 
    int id;// declaring attribute in class 
    String name;

    public void printdetails(){// defining a method in class
        System.out.println("Id of the Employee is"+id);
        System.out.println("Name of the Employee is"+name);
    }
}



public class first_oop_programme {
    public static void main(String[] args) {
    Employee rupesh= new Employee()  ;  // Object Instantiation in Java or creating object in java
    rupesh.id=7894;  // setting attribute to the object
    rupesh.name="Rupesh";  
    rupesh.printdetails();// calling method that isbeing written in class with the help of the object.
       


    




    }
}
