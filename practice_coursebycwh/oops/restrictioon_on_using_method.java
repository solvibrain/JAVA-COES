
interface camera1{
    void recordvideo();
    private void pausevideo(){
        System.out.println("Pausing a video ");
    }
    default void record4kvideo(){// by this thing we can not be compulse to override this method in any class.
        System.out.println("recording4Kvideo.");
        this.pausevideo();
    }
}

interface gps1{
    void locationsharing();
}

class Smartphone implements camera1, gps1{
    public void recordvideo(){
        System.out.println("REcording simple resolution video.");
    }
    public void locationsharing(){
        System.out.println("location is sharing.");
    }

    public void Popupcamera(){
        System.out.println("camera is poping out.");
    }
}

public class restrictioon_on_using_method {
    public static void main(String[] args) {
        camera1 obj1=new Smartphone();// this notation means that user is only allowed to use functnality of using the camera method.
        // other than that interface cannot use other things.
        obj1.Popupcamera();

    }
}
