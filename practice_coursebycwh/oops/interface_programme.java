interface Bicycle{
    int a =32;
    void applybrake(int decrement);
    void speedup(int increment);
}

class Avoncycle implements Bicycle{
    public void applybrake(int decrement){
        System.out.println("Applyting brake");
    }

    public void speedup(int increment){
        System.out.println("speeding up ");// while defining method in the subclass public keyword must be use .
    }
    
}

public class interface_programme {
    public static void main(String[] args) {
        Avoncycle a1=new Avoncycle();
        a1.applybrake(3);
        System.out.println(a1.a);// we can create properties in interface 
        // but we cannot modify the value of interface.attribute of the interface is final
        // Properties of the interface is final. 
    }
}
