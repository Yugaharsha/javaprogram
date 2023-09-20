import java.util.*;
import java.text.DecimalFormat;
public class NewClass {
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter side length of triangle:");
        int t = obj.nextInt();
        RegularPolygon tri = new EquilateralTriangle(t);
        System.out.print("Enter side length of square:");
        int s = obj.nextInt();
        RegularPolygon squ = new Square(s);
        int total = totalSides(tri.getNumSides(), squ.getNumSides());
        System.out.println("Total sides of all the elements:"+total);
        NewClass m = new NewClass();
        DecimalFormat df = new DecimalFormat("0.000");
        System.out.println("Perimeter of Triangle:"+m.getPerimeter(tri.getNumSides(), tri.getSideLength()));
        System.out.println("Perimeter of Square:"+m.getPerimeter(squ.getNumSides(), squ.getSideLength()));
        double T_IA = m.getInteriorAngle(tri.getNumSides());
        System.out.println("Angle of Triangle:"+ df.format(T_IA));
        double S_IA = m.getInteriorAngle(squ.getNumSides());
        System.out.println("Angle of square:"+ df.format(S_IA));
    }
    static int totalSides(int x, int y)
    {
        return x+y;
    }   
    int getPerimeter(int n, int a)
    {
        return n*a;
    }
    double getInteriorAngle(int n)
    {
        double IA = ((n-2)*3.14)/n;
        return IA;
    }
}
//interface
interface RegularPolygon
{
    int getNumSides();
    int getSideLength();
}
class EquilateralTriangle implements RegularPolygon
{
    int a, n=3;
    EquilateralTriangle(int a)
    {    
        this.a = a;
    }
    @Override
    public int getNumSides(){
        return n;
    }
    @Override
    public int getSideLength(){
            return a;
    }  
}
class Square implements RegularPolygon
{
    int a, n=4;
    Square(int a)
    {
        this.a = a;
    }
    @Override
    public int getNumSides(){
            return n;
    }
    @Override
    public int getSideLength(){
            return a;
    }
}
