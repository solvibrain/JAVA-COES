interface c1{
    void meth1();
    void meth2();
}
interface c2 extends c1{
    void meth3();
    void meth5();
}

class c3 implements c2{
    public void meth1(){
        System.out.println("meth1");
    }
    
    public void meth2(){
        System.out.println("meth2");
    }
    
    public void meth3(){
        System.out.println("meth3");
    }
    
    public void meth5(){
        System.out.println("meth5");
    }
}

public class inheritance_in_interface {
    public static void main(String[] args) {
        c3 a=new c3();
        a.meth1();
    }
}
