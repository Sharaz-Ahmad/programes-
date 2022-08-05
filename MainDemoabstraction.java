abstract class Aware
{
    public abstract void Foo();
    public void food()
    {
        System.out.println("my name is khan");
    }
}
class well extends Aware
{
    public void foo()
    {
        System.out.println("this is car");
    }

    @Override
    public void Foo() {
        System.out.println("what is your name ");
    }
}
class MainDemoabstraction
{
    public static void main(String [] args){
        well aa = new well();
        aa.foo();
        aa.food();
    }
}
