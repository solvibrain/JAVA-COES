interface Mycamera{
    void takesnap();
    void recordvideo();// IN interface access modifiers is public by defaault.
    default void record4kvideo(){
        System.out.println("Recording 4 K video.");
    }

}

interface mywifi{
    String[] getnetwork();
    
}


public class using_interface_ {
    public static void main(String[] args) {
        
    }
}
