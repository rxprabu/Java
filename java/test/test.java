class test{
public static void main(String args[])
{
 String s="java is prog aeiou";
char x[]=new char[s.length()];
for(int i=0;i<x.length;i++)
{
x[i]=s.charAt(i);
}
 int count=0;
for(int i=0;i<x.length;i++)

{
if(x[i]=='a'||x[i]=='e'||x[i]=='i'||x[i]=='o'||x[i]=='u')
{
count++;
System.out.println(x[i]+" "+"th index"+i);
}
}
System.out.println(count+" "+"vowels presented");

}
}                //1  3 5 7 8 10
