public class Interest
{
int a=10;
int b=15;
int c=25;
int simpleint()
{
int i=(a*b*c)/1000;
System.out.println(i);
return i;
}
int compount()
{
int i=a*(1+c/100)*(1+c/100);
System.out.println(i);
return i;
}
public static void main(String args[])
{
Interest one=new Interest();
one.simpleint();
one.compount();
}
}
