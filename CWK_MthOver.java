class Boys
{
    int a;
    String name;
    void Display()
    {
        System.out.println("good morning:");
    }
    int show(int x)
    {
        a=x;
        return a;
    }
    String view(String y)
    {
        name=y ;
        return y;
    }

}
public class CWK_MthOver {
    public static void main(String[] args) {
        Boys obj= new Boys();
        obj.show(10);
        obj.view("khan");
        System.out.println(obj.view("khan"));
        System.out.println(obj.show(20));



    }
}
