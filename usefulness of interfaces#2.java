//Code:2
interface Check
{int temp=10;}
class C implements Check
{
public int areaSquare() {
int c=temp*temp;
return c;
}}
public class ConstCheck {
public static void main(String[] args) {
// TODO Auto-generated method stub
C obj=new C();
System.out.println("The area of square is "+obj.areaSquare());
}
}