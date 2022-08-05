class Deck
{
    int x,y;
   void Swape(Deck q)
   {
       int temp;
       temp=q.x;
       q.x=q.y;
       q.y=temp;

   }
   /* void Swape(int x ,int y)
    {
        int temp;
        temp=x;
        x=y;
        y=temp;

    }*/
}

public class CWK_PassValue {
    public static void main(String[] args) {


        Deck obj =new Deck();
        /* int a=10;
         int b=20;
        System.out.println(a+" "+b);
        System.out.println(a+" "+b);*/
        obj.x= 30;
        obj.y=50;
        System.out.println(obj.x +" "+ obj.y);
        obj.Swape(obj);
        System.out.println(obj.x+" "+ obj.y);
    }
}
