class Random {
    public int x = 53;
    protected int y = 23;
    private int z = 32;
    int a = 36;// we cann access all the variable in teh same class .

    public void print() {
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}

class c2 extends Random{
    public void print2(){

        System.out.println(x);
        System.out.println(y);
        // System.out.println(z);// This statement wil give error because this is protected modifier and this wil
        // not being accesed in other class ..
        System.out.println(a);
    }   

}

public class access_modifiers {
    public static void main(String[] args) {
        c2 v1 = new c2();
        // v1.print();
        // System.out.println(v1.x);
        // System.out.println(v1.y);
        // System.out.println(v1.z);// This statement wil give error because this is protected modifier and this wil
        //                          // not being accesed in other class ..
        // System.out.println(v1.a);
        v1.print2();
    }
}
