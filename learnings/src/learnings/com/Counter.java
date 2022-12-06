package learnings.com;

import java.util.Scanner;

public class Counter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner in = new Scanner(System.in); {			
System.out.println("~*~Enter Your Number For Adding You At the count~*~");
System.out.println(" ");
System.out.println("To Know The Total Count Press (0)");
					int count = 0;
					int number;
					number = in.nextInt();
					while (number != 0) {
						count++;
						number = in.nextInt();
					}
System.out.println("The Current Strength is(" + count+")");
in.close();
	}
}	
}


