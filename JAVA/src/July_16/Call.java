package July_16;
public class Call {
    public static void main(String[] args) {
        A();
    }
    public static void A(){
        B();
        System.out.println("Hello A");
    }
    public  static void B(){
        System.out.println("Hello B");
        C();
    }
    public static void C(){
        D();
        System.out.println("Hello C");
    }
    public static void D(){
        System.out.println("Hello D");
    }
}
 