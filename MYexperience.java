class Introduction
{
    public void name()
    {
        System.out.println("my name is khan");
    }
    public void place()
    {
        System.out.println("i am from Balochistan living in district ziarat");
    }
}
class Study extends Introduction
{

   public void name()
    {
        System.out.println("i am studying Bscs (computer science)");
    }
    public void place()
    {
        System.out.println("i want to become the world best man");
    }
}

public class MYexperience {
    public static void main(String[] args) {
        Introduction obj= new Introduction();
        Introduction obj1 = new Study();

        obj.name();
        obj.place();

        obj1.name();
        obj1.place();
    }
}
