import java.util.Scanner;

public class calculating_triangle {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in); 
        int side,m,n,p,a,b,c;
        double area,s;
        System.out.println("1.to find area of Equilateral Triangle ");
        System.out.println("2. to find the area of Scalene Triangle .");
        System.out.println("3.to find the area of isoceles Triangle.");
        c=in.nextInt();
        switch(c)
        {
            case 1: 
                System.out.println("Enter the side of the Equilateral Triangle : ");
                side=in.nextInt();
                area=Math.sqrt(3.0)*(1.0/4)*side*side;
                System.out.println("Area of the Equilateral Triangle is "+area);
                break;
            case 2:
                System.out.println("Enter the sides of the triangle : ");
                m=in.nextInt();
                n=in.nextInt();
                p=in.nextInt();
                s=(m+n+p)/2;
                area=Math.sqrt(s*(s-m)*(s-n)*(s-p));
                System.out.println("Area of the Scalene triangle is "+area);
                break;
            case 3:
                System.out.println("Enter the side and base of the Triangle :");
                a=in.nextInt();
                b=in.nextInt();
                area=b*(1.0/4)*Math.sqrt(4*a*a-b*b);  
                System.out.println("Area of the Isoceles Triangle is "+area);  
                break;
            default:
                System.out.println("Wrong Choice");    

        }

    }
}
