import java.util.Scanner;
class rotation{
	public static void main(String args[]) {
		System.out.println("Enter a product code and quantity");
		System.out.println("  Biscut  1 ");
		System.out.println("  Fruit   2");
		System.out.println("  Egg     3");
		System.out.println("  Choco   4");
		System.out.println("  Chicken 5");
		Scanner in = new Scanner(System.in) ;
			System.out.println("please enter product id:");
			// int a = in.nextInt();
			int a;
			int repeat;
			do {
				a = in.nextInt();
				switch (a) {
				case 1:
					int Biscut = 10;
					// count++;
					System.out.println("please enter the quantity:");
					System.out.println("you want to pay  " + Biscut * in.nextInt());
					break;
				case 2:
					int Fruit = 100;
					// count++;
					System.out.println("please enter the quantity:");
					System.out.println("you want to pay  " + Fruit * in.nextInt());
					// in.nextInt(a);
					break;
				case 3:
					int Egg = 7;
					// count++;
					System.out.println("please enter the quantity:");
					System.out.println("you want to pay  " + Egg * in.nextInt());
					// in.nextInt(a);
					break;
				case 4:
					int Chocolate = 5;
					// count++;
					System.out.println("please enter the quantity:");
					System.out.println("you want to pay  " + Chocolate * in.nextInt());
					break;
				case 5:

					int Chicken = 260;
//				count++;
					System.out.println("please enter the quantity:");
					System.out.println("you want to pay  " + Chicken * in.nextInt());
					break;
				default:
					System.out.println("Enter a valid product code");
					break;

				}
				System.out.println(" !-want to continue purchase click (7)--!");
				repeat = in.nextInt();
			}while (repeat == 7 || repeat == 7);	
			//a = in.nextInt();

		
	}
}

