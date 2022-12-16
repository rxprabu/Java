package interview;
public class Zakaprs {
	public static void main(String args[]) {
		String s = "ZAARKAPPRSS";
		String j = " ";
		char c[] = new char[s.length()];
		int x;
		for ( x = 0; x < c.length; x++) {
			c[x] = s.charAt(x);
		}
		System.out.println(s);
		for (int i = 0; i < c.length; i++) {

			for (int y = i + 1; y < c.length; y++) {

				if (c[i] == c[y])

					c[y] = ' ';
				}
			if(c[i]!=' ')
				j = j + c[i];

			}
		System.out.print(j);
		}
	}
	

