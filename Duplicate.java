package interview;

public class Duplicate {
	public static void main(String args[]) {
		int j = 0;
		int a[]= {1,1,2,3,4,5,3,5};
		for(int i=0;i<a.length;i++)
		{
			for( j=i+1;j<a.length;j++)
			{
			if(a[i]==a[j])
			
			{
			System.out.println("Duplicate element is  "+a[j]);	
			}
		}
	}
	
	}
	}
