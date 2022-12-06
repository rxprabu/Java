package Billing;

import java.util.Scanner;

import learnings.com.string;

public class Billinginfo {

	public static void main(String args[]) {
		System.out.println("Enter a product code and quantity");
		System.out.println(" Biscut  1"  );
		System.out.println(" Fruit 2");
		System.out.println("Egg 3");
		System.out.println("Chocolate  4");
		System.out.println("Chicken  5");
		try (Scanner in = new Scanner(System.in)) {
			int a = in.nextInt();
			switch (a) {
			case 1:
				int Biscut = 10;
				System.out.println(Biscut*in.nextInt());
				break;
			case 2:
				int Fruit = 100;
				System.out.println(Fruit*in.nextInt());
				break;
			case 3:
				int Egg = 7;
				System.out.println(Egg*in.nextInt());
				break;
			case 4:
				int Chocolate = 5;
				System.out.println(Chocolate*in.nextInt());
				break;
			case 5:
				int Chicken = 260;
				System.out.println(Chicken*in.nextInt());
				break;
			default:
				System.out.println("Enter a valid product code");

			}
		}
	}
}

