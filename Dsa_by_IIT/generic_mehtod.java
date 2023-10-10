/**
 * generic_mehtod
 */
public class generic_mehtod {
    static <T> void genericprint(T t){
        System.out.println(t.getClass().getName() + ": "+ t);
    }
    public static void main(String[] args) {
        genericprint(101);
        genericprint("Hello Rupesh");;
        genericprint(5.53);
    }
}