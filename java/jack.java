

import java.util.Scanner;

public class jack {
	public static void main(String args[]) {
		System.out.println("Enter a product code and quantity");
		System.out.println("  Biscut  1 ");
		System.out.println("  Fruit   2");
		System.out.println("  Egg     3");
		System.out.println("  Choco   4");
		System.out.println("  Chicken 5");
		try (Scanner in = new Scanner(System.in)) {
			System.out.println("please enter product id:");
			String repeat;
			int a;
			do {
				a = in.nextInt();
				switch (a) {
				case 1:
					int Biscut = 10;
					System.out.println("please enter the quantity:");
					System.out.println("you want to pay  " + Biscut * in.nextInt());
					break;
				case 2:
					int Fruit = 100;
					System.out.println("please enter the quantity:");
					System.out.println("you want to pay  " + Fruit * in.nextInt());
					break;
				case 3:
					int Egg = 7;
					System.out.println("please enter the quantity:");
					System.out.println("you want to pay  " + Egg * in.nextInt());
					break;
				case 4:
					int Chocolate = 5;
					System.out.println("please enter the quantity:");
					System.out.println("you want to pay  " + Chocolate * in.nextInt());
					break;
				case 5:
					int Chicken = 260;
					System.out.println("please enter the quantity:");
					System.out.println("you want to pay  " + Chicken * in.nextInt());
					break;
				default:
					System.out.println("Enter a valid product code");
					break;
				}
				System.out.println(" !-want to continue purchase click (y)--!");
				repeat = in.next();
				System.out.println("please enter product id:");
			} while (repeat == "Y" || repeat == "y");
		}
	}
}

