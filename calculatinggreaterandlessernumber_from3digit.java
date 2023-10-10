import java.util.*;

public class calculatinggreaterandlessernumber_from3digit {
      public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int a,b,c;
        int gn,ln;
        System.out.println("Enter the num1 : ");
        a=in.nextInt();
        System.out.println("Enter the num2 : ");
        b=in.nextInt();
        System.out.println("Enter the num 3 : ");
        c=in.nextInt();
        if((a>b) && (a>c))
        {
            if(b>c)
            {
                gn=100*a+10*b+c;
                ln=100*c+10*b+a;

            }
            else
            {
                gn=100*a+10*c+b;
                ln=100*b+10*c+a;
            }
        }
        if((b>a) && (b>c))
        
        {
            if(a>c)
            {
                gn=100*b+10*a+c;
                ln=100*c+10*a+b;

            }
            else
            {
                gn=100*b+10*c+a;
                ln=100*a+10*c+b;
            }
        }
        else
        {
            if(a>b)
            {
                gn=100*c+10*a+b;
                ln=100*b+10*a+c;

            }
            else
            {
                gn=100*c+10*b+a;
                ln=100*a+10*b+c;
            }
        }
        System.out.println("Greatest number is "+gn);
        System.out.println("Smaller number is "+ln);
      }


}
