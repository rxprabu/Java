public class Singleinheritence{

void Tocheckpositive(int a)
{
if(a>0)
{
System.out.println("It's positive number");
}
else
{
System.out.println("It's a negative number");
}
}
void Oddoreven()
{
int a=5;
//for( a=1;a<=10;a=a+1){
if(a%2==0)
{
System.out.println("Even Number");
}
else{
System.out.println("Odd Number");
}
}
//}
int Modules()
{
int a=2;
a=-1*a;
System.out.println(a);
return a;
}
/*void Tocheckprimenumber()
{

}*/
public static void main(String args[])
{
Singleinheritence one=new Singleinheritence();
one.Tocheckpositive(-8);
one.Oddoreven();
one.Modules();
}
}

