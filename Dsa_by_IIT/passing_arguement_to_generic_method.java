import javax.print.attribute.IntegerSyntax;

public class passing_arguement_to_generic_method {
    public static void swap(Object x, Object y){
        Object Temp=x;
        x=y;
        y=Temp;
        System.out.println("The value of x and y is "+x+y);

    }
    public static void main(String[] args) {
        int a=3;
            
    
            int b=5;

        
        System.out.println("The value of x and y is "+a+b);
        swap( a,  b);
        System.out.println("The value of x and y is "+a+b);
        

    }
}
