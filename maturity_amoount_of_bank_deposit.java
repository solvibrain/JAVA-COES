import java.util.Scanner;

public class maturity_amoount_of_bank_deposit {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int input;
        double p,r,t,amt;
        System.out.println("Choose the maturity Plan given below: ");
        System.out.println("1.Term Deposit");
        System.out.println("2.Recurrin Deposit");
        input=in.nextInt();
        switch(input)
        {
            case 1:
                System.out.println("Enter the principal amount : ");
                p=in.nextDouble();
                System.out.println("Enter the rate for the Amount : ");
                r=in.nextDouble();
                System.out.println("Enter the time period for the Amount : ");
                t=in.nextDouble();
                amt=p*Math.pow((1+r/100),t);
                System.out.println("Maturit Plan According to the Term deposit is "+amt);
                break;
            case 2:
                
                System.out.println("Enter the principal amount : ");
                p=in.nextDouble();
                System.out.println("Enter the rate for the Amount : ");
                r=in.nextDouble();
                System.out.println("Enter the time period for the Amount : ");
                t=in.nextDouble();
                amt=p*t+p*(t*(t+1))*(1/2)*(r/100)*(1/12);
                System.out.println("Maturit Plan According to the Term deposit is "+amt);
                break;
            default:
                System.out.println("Incorrect Option");        
        }

    }
}
