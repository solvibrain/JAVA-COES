import java.util.Scanner;

public class Stingmethod {
    public static void main(String args[]){
        System.out.println("Enter the name you want to Enter :");
        Scanner input = new Scanner(System.in);
        String name=input.nextLine();
        //Applyin some of the methods of the Strig 
        /*
        changing the String into the uppercase if is in lowercase 
        */ 
        String nname=name.toUpperCase();
        System.out.println(nname);
    }
}