import java.util.Scanner;

public class calculating_days_month_years {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int b, y,n,days,month;
        n=in.nextInt();
        y=n/365;
        b=n%365;
        month=b/30;
        days=month%30;
        System.out.println(y);
        System.out.println("MOnths are" + month);
        System.out.println("days are "+days);

    
    }
}
