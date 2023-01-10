public class Overloading{
    
int add (int a,int b)

{   
int c=a+b;
System.out.println(c);
return c;
}
int add (int a,int b,int c)
{
int d=a*b+c;
System.out.println(d);
return d;  
}
public static void main(String args[])
{
Overloading one=new Overloading();
one.add(2,5);
one.add(5,6,7);
}
}
