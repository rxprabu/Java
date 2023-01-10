package interview;

public class Vowels {
	public static void main(String args[]) {
		String a = " east twenty days more on this year and the cricket end the commerial union india";
		int count=0;
		char c[] = new char[a.length()];
		for (int i = 0; i < c.length; i++) {
			c[i] = a.charAt(i);
		}
	for (int i = 0; i < c.length; i++) {
		
		    if (c[i] == ' ')
			if(c[i+1]=='a' ||c[i+1] == 'e'||  c[i+1] == 'i'|| c[i+1] == 'o' || c[i+1] == 'u') {
            count++;
			}
		}System.out.println(+count+"  Words  Starting With Vowels");
	}

}
