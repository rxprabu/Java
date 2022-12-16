package interview;

public class Sumrecursion {
	static void recursion(int num,  int sum)
	{
		if(num>0) {
			sum=sum+num%10;
		    num=num/10;
	recursion(num,sum);
	}
		else {
			System.out.println(sum);
	}
	}
	public static void main(String args[]) {

		recursion(822,0);
		
	}
}
