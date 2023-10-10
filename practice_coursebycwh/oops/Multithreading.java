

class Mythread1 extends Thread{
    public void run(){
        int i=0;
        while(i<100){
            System.out.println("class of Mythred1 is running");
            i++;
        }
    }
}
class Mythread2 extends Thread{
    public void run(){
        int i=0;
        while(i<100){
            System.out.println("class of Mythred2 is running");
            i++;
        }
    }
}

public class Multithreading {
    public static void main(String[] args) {
        Mythread1 m1=new Mythread1();
        Mythread2 m2=new Mythread2();
        m1.start();
        m2.start();
    }
}
