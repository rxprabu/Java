import java.util.Scanner;

public class counter {
	public static void main(String args[]) {
		try (Scanner in = new Scanner(System.in)) {
			{

			//ss	int a=in.nextInt();

				int count = 0;
				int number;
				number = in.nextInt();
				while (number != 0) {
					count++;
					number = in.nextInt();

				}
				System.out.println("the current count is" + count);

			}
		}
	}
}
