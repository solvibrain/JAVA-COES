import java.util.Scanner;

class Circle{
    double x;
    double y;
    double r;

    Circle(){
        this.x=5.34;
        this.y=6.23;
        this.r=6.788;
    }
    Circle(double a,double b,double c){
        this.x=a;
        this.y=b;// this can also be done using a this(a,b,c) having a similar meaning that of previous one .
        this.r=c;
    }
    Circle(Circle c){
        this.x=c.x;
        this.y=c.y;
        this.r=c.r;
    }
    
    public double area(){
        return Math.PI*this.r*this.r;
    }
    
}

public class all_type_of_constructor {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("ENter the centre coordinate of the circle : ");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        System.out.println("Enter the radius of the cirlce : ");
        double r=sc.nextDouble();
        Circle c1=new Circle();
        Circle c2=new Circle(5.3,6.22,56.23);
        Circle c3=new Circle(c2);
        System.out.println("The area of the circle is "+ c1.area());
        System.out.println("The area of the circle whose attributes are passed using the constructor with arguement "+ c2.area());
        System.out.println("The area of the circle with arguement as a class "+ c3.area());
    }
}
