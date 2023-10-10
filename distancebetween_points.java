import java.util.Scanner;

public class distancebetween_points {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int x1,x2,y1,y2;
        double p;
        double distance;
        System.out.println("Enter the first x coordinate of the point : ");
        x1=in.nextInt();
        System.out.println("Enter the second x coordinate of the point : ");
        x2=in.nextInt();
        System.out.println("Enter the first y coordinate of the point : ");
        y1=in.nextInt();
        System.out.println("Enter the second y coordinate of the point : ");
        y2=in.nextInt();
        p=Math.pow((x2-x1),2)+Math.pow((y2-y1),2);
        distance =Math.sqrt(p);
        System.out.println("Distance between the coordinate is : "+distance);
    }
}
