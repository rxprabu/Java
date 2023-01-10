 public class uppercase {
    public static void main(String []args)
    {
	String s="write a program at too fast";
	char c[]=s.toCharArray();
int size=c.length;
c[0]=(char)(c[0]-32);
int i=1;
while(i!=size)
{
if(c[i]==' ')
{
	
c[i+1]=(char)(c[i+1]-32);
if(c[i]>=95&&c[i]<=125) {
c[i-1]=(char)(c[i-1]+32);
}
}
i++;
}
System.out.println(s);
System.out.println(c);;


		}  
		}
