package learnings.com;

public class string {

	public static void main(String[] args) {
		// TODO Auto-
	/*	String s="java";               //string to array program
		char c[]=new char[s.length()];
		
		for(int i=0;i<s.length();i++)
		{
			c[i]=s.charAt(i);
			System.out.println(c[i]);	
		}*/
	char c[]= {'j','a','v','a'};
	String	s=" ";
		for(int i=0;i<c.length;i++)
		{
			s=s+c[i];
		}
		System.out.println(s);
	}

}
