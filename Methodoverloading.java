class Addition
{
    int x,y;
    void Add()
    {
        System.out.println("my name is kahn");
    }
    void Add(int a, int b)
    {
      x=a;
      y=b;
        System.out.println("x="+x+"\ny="+y);

    }
}
public class Methodoverloading {
    public static void main(String[] args) {
               Addition Obj = new Addition();
               Obj.Add();
               Obj.Add(20,30);

    }
}
