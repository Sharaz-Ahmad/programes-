//while using static key word
public class CWK_MethodOverloading {
    static void foo()
    {
        System.out.println("good morning:");
    }
    static void foo1(int a)
    {
        System.out.println("good morning:"+ a +"bro");
    }
    static  void foo2(int x, int y)
    {
        System.out.println("good morning:"+ x +"bro");
        System.out.println("good morning:"+ y +"bro");
    }

    public static void main(String[] args) {

        foo();
        foo1(300);
        foo2(200,3000);
    }
}
