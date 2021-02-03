interface Test{
public int square(int r);
}
class Arithmetic implements Test{
public int square(int r)
{int area=r*r;
return area;
}
}
public class ToTestInt {
public static void main(String[] args) {
// TODO Auto-generated method stub
Arithmetic ar=new Arithmetic();
System.out.println("Area of square is: "+ar.square(10));
}
}