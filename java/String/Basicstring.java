class Basicstring{
public static void main(String args[])
{
String s="Computer Language";
char x[]=new char[s.length()];
for(int i=0;i<x.length;i++)
{
x[i]=s.charAt(i);
}
/*for(int i=0;i<x.length;i++)
{
System.out.println(x[i]);
}*/
//char search='a';
//char replace='@';
for(int i=0;i<x.length;i++)             //replace all a
{
for(int j=0;j<x.length;j++)
{
if(x[i]==x[j])
{

}
System.out.println(x[j]);
break;
}
}
//break;
}
}
