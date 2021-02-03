interface Calculate
{public int division(int a,int b);
public int modulus(int c,int d);
}
class PerformCal implements Calculate
{
public int division(int val1,int val2)
{
int c=val1/val2;
return c;
}
public int modulus(int value,int value_1)
{
int d=value%value_1;
return d;
}
}
public class DivMod {
public static void main(String[] args)
{PerformCal obj=new PerformCal();
System.out.println("The result after division is "+obj.division(10,8));
System.out.println("The result after performing modulus is "+obj.modulus(10,8));
}
}