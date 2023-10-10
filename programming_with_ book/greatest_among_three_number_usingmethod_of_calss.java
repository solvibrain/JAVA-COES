import java.util.*;
public class greatest_among_three_number_usingmethod_of_calss {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number 1,2 and 3 : ");
        int num1,num2,num3,greater,greatest;
        num1=in.nextInt();
        num2=in.nextInt();
        num3=in.nextInt();
        greater=Math.max(num1, num2);
        greatest=Math.max(greater, num3);
        System.out.println("Gratest number is "+greatest); 
        


    }
}
