class Over
    {
 void add(int a,int b)
        {
System.out.println("The result is PC "+(a+b));
        }
}



class overriding extends Over 
   {
 void addition(int a,int b)
       {
System.out.println("The result is CC "+(a+b));
       }
}



public class Polyoverriding
{
public static void main (String args[])

   {
overriding one=new overriding();
one.add(3,7);
one.add(5,8);
one.add(5,5);
   }
       }
          
