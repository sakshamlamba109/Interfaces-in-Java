interface A
{
public void meth1(String name);
public int meth2(int n);
}
class MyClass implements A{
public void meth1(String n)
{System.out.println(n+" Studies in UPES");
}
public int meth2(int SAP){
return SAP;
}
}
public class B {
public static void main(String[] args) {
// TODO Auto-generated method stub
MyClass obj=new MyClass();
obj.meth1("Saksham");
System.out.println("The SAP_ID is"+obj.meth2(500075568));
}
}