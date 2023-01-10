public class Uptolow{

public static void main (String args[])
{
String s="ItDeveLopER";
char c[]=new char[s.length()];
for(int i=0;i<s.length();i++)
{
c[i]=s.charAt(i);
if(c[i]>=65&&c[i]<=95)
{
c[i]=(char)(c[i]+32);
char result=c[i];

System.out.println("it is a    ----"+result);
}
else
{

System.out.println("already small----"+c[i]);
}
}
}
}
