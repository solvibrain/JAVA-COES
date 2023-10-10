import java.util.*;

public class Electricity_Bill {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int u,cnum;
        double amt=0;
        String name;
        System.out.println("Enter the name of the consumer : ");
        name=sc.nextLine();
        System.out.println("Enter the consumer number : ");
        cnum=sc.nextInt();
        System.out.println("Enter the unit consumed : ");
        u=sc.nextInt();
        if(u<=100)
        {
            amt=u*5.5;
        }
        if(u>100 && u<=300)
        {
            amt=100*5.5+(u-100)*6.5;
        }
        if(u>300 && u<=600)
        {
            amt=100*5.5+200*6.5+(u-300)*7.5;
        }
        if(u>600)
        {
            amt=100*5.5+200*6.5+300*7.5+(u-600)*8.5;
        }
        System.out.println("***********************Money Receipt*********************************");
        System.out.println("Consumer Name is "+name);
        System.out.println("Consumer Number is "+cnum);
        System.out.println("Unit Consumed by the customer is "+u);
        System.out.println("Amount for the used unit is "+ amt);
    }
}
