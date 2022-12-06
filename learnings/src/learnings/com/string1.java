package learnings.com;

public class string1 {
	public static void main(String args[])
	{
	String s="jack";
	char c[]=new char[s.length()];                //string encryption program
	
	for(int i=0;i<s.length();i++)
	{
		c[i]= (char)(s.charAt(i)*3);
		System.out.println(c[i]);	
	}
}
}
