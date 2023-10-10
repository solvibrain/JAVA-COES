import java.util.Scanner;

public class calculatingtrigonometric_function {
    public static void main(String args[]){
        Scanner in =new Scanner(System.in);
        double d;
        d=in.nextDouble();
        double dg;
        dg=(22.0/(7.0*180.0))*d;
        System.out.println(Math.sin(dg)); 
        System.out.println(Math.cos(dg)); 
        System.out.println(Math.tan(dg)); 
    }
}
