import java.util.Scanner;

public class calculatingdiagonalofcuboid {
    public static void main(String args[]){
        Scanner in =new Scanner(System.in);
        float l,b,h;
        double diagonal;
        System.out.println("Enter the length of the Cuboid : ");
        l=in.nextFloat();
        System.out.println("Enter the breadth of the Cuboid : ");
        b=in.nextFloat();
        System.out.println("Enter the height of the Cuboid : ");
        h=in.nextFloat();
        diagonal=Math.sqrt(l*l+b*b+h*h);
        System.out.println("measurement of the diagonal of the cuboid is : "+diagonal);
    }
}
