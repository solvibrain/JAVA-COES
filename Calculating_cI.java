import java.util.Scanner;

public class Calculating_cI {
    public static void main(String args[]){
         Scanner input=new Scanner(System.in);
         float principle,rate,time,si;
         double A,ci,difference;
         System.out.println("Enter the Principle Amount:");
         principle=input.nextFloat();
         System.out.println("Enter the rate on which amount is being proccesed :");
         rate=input.nextFloat();
         System.out.println("Enter the time for which amount is being issued :");
         time=input.nextFloat();
         si=(principle*rate*time)/100;
         A=principle*(Math.pow(1+rate/100.0,time));
         ci=A-principle;
         difference=ci-si;
         System.out.println(si);
         System.out.println(A);
         System.out.println(ci);
         System.out.println(difference);
    }    
}
