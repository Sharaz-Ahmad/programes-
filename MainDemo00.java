class Work
{
    int my;
    Work(int a)
    {
        my= a;
        System.out.println("my name is khan  "+ a);

    }
    int khan(int a)
    {
        a=my;
        System.out.println("my name is khan  "+my);
        return a;
    }
}
public class MainDemo00
{
    public static void main(String[] args){
        Work Obj=new Work(200);
        Obj.khan(100);}
}
