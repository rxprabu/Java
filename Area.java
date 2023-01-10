public class Area
{
double add(double a)
{
double add=a+a;
System.out.println(add);
return add;
}
double mul(double a,double b)
{
double mul=a*b;
System.out.println(mul);
return mul;
}
public static void main(String args[])
{
Area one=new Area();
one.add(5);
one.mul(3,5);
}
}



