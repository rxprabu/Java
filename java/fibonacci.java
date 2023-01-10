
//fibonacci is nothing but add first two elements and give the result at next element


class fibonacci{
public static void main(String args[])
{
int a=1;
int b=1;
int c=a+b;
for(int i=0;i<=10;i++)
{
c=a+b;
System.out.println(c);
a=b;
b=c;

}
}
}
