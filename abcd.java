class A{
//    A(){
//        System.out.println("hello");
//    }
        static {
    System.out.println("Static called");
}
}
public class abcd {
//    abcd(){
//        System.out.println("Hi");
//    }
    {
        System.out.println(" ram");
    }
    static {
        System.out.println("Static called 2");
    }
    public static void main(String[] args) {
//        new A();
//        new abcd();
        new A();
    }
}
