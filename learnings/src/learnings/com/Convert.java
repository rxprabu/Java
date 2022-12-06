package learnings.com;
import java.util.Scanner;
public class Convert {
	
		 public static void main(String args[])
	 {
			 try (Scanner in = new Scanner(System.in)) {
					 
			 System.out.println("~__Choose a  Numer  Which Convert You  Want:"+"\nchoose 1 Millisecond to Minute"+
				                                                              "\nchoose 2 Km to Meters "  +
					                                                          "\nchoose 3 Grams to Kilograms"+
				                                                              "\nchoose 4 Milliliters to litre"+
					                                                          "\nchoose 5 Liter to Milleliters");
			/* System.out.println(" ");
			System.out.println("(1)Millisecond to Minute  (2)Km to Meters");
			 System.out.println(" ");
			System.out.println("(3)Grams to Kilograms     (4)Milliliters to litre");
			 System.out.println(" ");
			System.out.println("          (5)Liter to Milleliters");*/
			 
			 char repeat;
			 System.out.println("Enter a choice id");
			 do {
				 int n;
			    // System.out.println("Enter a choice id");
				 n = in.nextInt();
				 
			 switch(n){
			case 1:
			long startTime;
				long endTime;
				 System.out.println("Enter a Number to Start a Timer");
				 startTime=in.nextInt();
				 System.out.println("Enter a Number to Stop a Timer");
				 endTime=in.next().charAt(0);
				 startTime=System.currentTimeMillis();
				 endTime=System.currentTimeMillis();
				 System.out.println(("Its Takes("+(endTime-startTime/1000)/60)+")minutes");
				 System.out.println(" ");
			break;
			case 2:
				float km,metres;
		          System.out.println("Enter The Kilo Meters:");
		          km=in.nextFloat();
		          metres=km*1000;
		          System.out.printf("The Output  Is:\n%.0f",metres);
		          System.out.println(" ");
			break;
			case 3:
				double grams;
				System.out.println("Please enter grams:");
				grams = in.nextDouble();
				double kilograms = grams / 1000;
				System.out.println("Its"+kilograms + " Kilograms");
			break;
			case 4:
				double ml;
				System.out.println("Please Enter Mille Liters:");
				ml = in.nextDouble();
				double litre = ml /1000;
				System.out.println(litre+ "liters");
			break;
			case 5:
				double lit;
				System.out.println("Please Enter Mille Liters:");
				lit = in.nextDouble();
				double millil = lit *1000;
				System.out.println(millil+ "liters");
				break;
				default:
					System.out.println("Enter a valid number");
			}
				System.out.println("too continue press y  ");
				repeat=in.next().charAt(0);
				System.out.println("Enter a choice id");
		 }	while(repeat=='y'||repeat=='Y')	;
		System.out.println("!--Now you exit --!");
         }
		 }
         }
