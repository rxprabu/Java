import java.util.Scanner;
class Arith{
public static void main (String args[])
{
Scanner x=new Scanner(System.in);
int num=x.nextInt();
int a=x.nextInt();
int b=x.nextInt();
switch(1){
case(1):
System.out.println(a+b);
break;
case(2):
System.out.println(a-b);
break;
case(3):
System.out.println(a*b);
break;
case(4):
System.out.println(a/b);
break;
case(5):
System.out.println(a%b);
default:
System.out.println("Enter a valid number");

}

}

}
