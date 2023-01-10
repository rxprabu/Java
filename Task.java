package learnings.com;
import java.util.Scanner;
public class Task {
	public static void main(String args[]) {
		try (Scanner in = new Scanner(System.in)){
		System.out.println("!--Welcome Vivasayi Supermarket--!");
		System.out.println(" ");
		System.out.println("*--Enter Branch name--*");
     	String	Branch=in.next();
		System.out.println("-- You Purchesing On--"+Branch+"--Branch");
		System.out.println(" ");
		System.out.println("Enter a product code and quantity");
		System.out.println(" ");
		System.out.println(" --* Biscuit  1 --*Fruit  2 --*Egg   3--* ");
		System.out.println(" ");
		System.out.println(" ---* Choco  4 ---*Chicken 5");
		System.out.println(" ");	
		System.out.println("__To Bill Your  Purchase Press 6__");
		System.out.println(" ");
			int Chickenamount=0,Chocolateamount=0,Eggamount=0,Fruitamount=0,Biscutamount=0;
			int totalamount;
			char repeat ;	
			int a =0;
		do {
			System.out.println("please enter product id:");
			a = in.nextInt();
			switch (a) {
			case 1:
					int Biscut = 10;
					System.out.println("please enter the quantity:");
					 Biscutamount += Biscut * in.nextInt();
				//	System.out.println("you want to pay  " + Biscut* in.nextInt());
					break;
				case 2:
					int Fruitrate = 100;
					System.out.println("please enter the quantity:");
					Fruitamount += Fruitrate * in.nextInt();
					//System.out.println("you want to pay  " + Fruitrate * in.nextInt());
					break;
				case 3:
					int Eggrate = 7;
				//	z=Egg * in.nextInt();
					System.out.println("please enter the quantity:");
					Eggamount += Eggrate * in.nextInt();
					//System.out.println("you want to pay  " +Eggrate * in.nextInt());
					break;
				case 4:
					int Chocolaterate = 5;
				//	x = Chocolate * in.nextInt();
					System.out.println("please enter the quantity:");
					 Chocolateamount += Chocolaterate * in.nextInt();
				//	System.out.println("you want to pay  " + Chocolaterate * in.nextInt());
					break;
				case 5:
					int Chickenrate = 260;
					System.out.println("please enter the quantity:");
					 Chickenamount += Chickenrate * in.nextInt();
					//System.out.println("you want to pay  "+ Chicken * in.nextInt());
					break;
				case 6:
				//	int Chocolate = 0;
					System.out.println("**Branch name**"+Branch);
					if(Chocolateamount >0)
						System.out.println(Chocolateamount/5+"  pcs "+ "Chocolateamount  " + Chocolateamount);
				//	int Eggrate = 0;
					if(Eggamount >0)
						System.out.println( Eggamount/7+"  pcs "+" Eggamount    " + Eggamount );
				//	Chickenrate = 0;
					if(Chickenamount >0)
							System.out.println(Chickenamount/260+"  Kg "+" Chickenamount  " + Chickenamount);
			//	Fruitrate = 0;
					if( Fruitamount>0)
								System.out.println(Fruitamount/100+"  Kg "+"Fruitamount    " + Fruitamount);
				//	 Biscut = 0;
					if(Biscutamount >0)
									System.out.println(Biscutamount/10+"  pcs " + "Biscutamount  " + Biscutamount );
		 totalamount=Chickenamount+Chocolateamount+Eggamount+Fruitamount+Biscutamount;
		 System.out.println("---------------------------------");
		 System.out.println("-- Total amount is  "+totalamount+"  Rs");
		 System.out.println("---------------------------------");
				case 7:
					System.exit(a);
					 break;	
				default:
					System.out.println("--*Enter a valid product code--*");
					break;
				}	
				System.out.println("Too continue press y  ");
				repeat=in.next().charAt(0);
		}
		while(repeat=='y'||repeat=='Y')	;
			System.out.println("!--Now you exit on purchase--!");
			System.out.println("!--Visit again--!");
		}
	}
}