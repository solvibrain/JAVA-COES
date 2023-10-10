import java.util.Scanner;

public class calculatingpercentage {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        double marks1,marks2,marks3,avg,percentage;
        marks1=in.nextDouble();        
        marks2=in.nextDouble();        
        marks3=in.nextDouble();
        avg=(marks1+marks2+marks3)/300;
        percentage=avg*100;
        System.out.println("Percentage of the student is "+percentage );

    }    
}
