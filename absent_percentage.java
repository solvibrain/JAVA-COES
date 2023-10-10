import java.util.Scanner;


public class absent_percentage {
    public static void main(String args[]){
        int g, b, ga, ba;
        float pb,pg;
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the total number of  boys in the class : ");
        b=in.nextInt();
        System.out.println("Enter the total number of Girls in the clas : ");
        g=in.nextInt();
        System.out.println("Enter the number of girls were absent : ");
        ga=in.nextInt();

        System.out.println("Enter the number of boys were absent : ");
        ba=in.nextInt();
        pb=(float)(b-ba)/(b+g)*100;
        pg=(float)(g-ga)/(b+g)*100;
        System.out.println("Percentage of girls present is class is "+pg);
        System.out.println("Percentage of boys present is class is "+pb);

    }
}
