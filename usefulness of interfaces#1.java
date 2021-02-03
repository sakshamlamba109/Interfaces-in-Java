//Code:1
interface Check
{int temp=10;}
class C implements Check
{ temp=20;
public void print() {
System.out.println (temp+ "");
}}
public class ConstCheck {
public static void main(String[] args) {
// TODO Auto-generated method stub
C obj=new C();
obj.print();
}
}
