abstract class Figure{
    double x;
    double y;
Figure(double a,double b){
    x=a;
    y=b;

}
abstract double area();
}
class Triangle extends Figure{
    Triangle(double a, double b)
    {
        super (a,b);
    }
    double area(){
        return x*y;
    }
}
public class CHK_05 {
    public static void main(String[] args) {
        Figure cc;
        Triangle tt=new Triangle(20,30);
        System.out.println(tt.area());

    }
}
