abstract class Parent {
    public Parent() {
        System.out.println("Hello");

    }

    abstract public void greet();// way of defining the abstract method and if any method in class is abstract
                                  // than class also became abstract//
                                  // this abstract class is one type of standard 
                                  //abstract method cannot be get implemented at the same place.
    
}

class Child extends Parent {
    public void greet() {
        System.out.println("Good MOrning ");
    }
}

public class abstract_class {
    public static void main(String[] args) {
        Child c=new Child();
        c.greet();
    }

}
