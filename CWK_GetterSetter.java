class Main
{
     private int id;
     private String name;
     public String getName()
     {
         return name;
     }
     public void setName(String n)
     {
         name= n;
     }
     public void  setId(int d)
     {
         id = d;
     }
     public int getId()
     {
        return id;
     }
}
public class CWK_GetterSetter {
    public static void main(String[] args) {
        Main Obj= new Main();
        Obj.setName("pakistan");
        Obj.setId(219);
        System.out.println(Obj.getId());
        System.out.println(Obj.getName());

    }
}
