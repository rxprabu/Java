class Alphabet{
public static void main(String args[])
{
String s="java";
char x[]=new char[s.length()];
for(int i=0;i<x.length;i++)
{
x[i]=s.charAt(i);
}
/*for(int i=0;i<x.length;i++){
System.out.println(x[i]);
}*/
for(int i=0;i<x.length;i++)
{
for(int j=i;j<x.length;j++)
{
System.out.print(x[j]);

}
System.out.println();
}
}
}
