package interview;

public class Prime {
public static void main(String args[]){
	int num=6;
	boolean flag=false;
	for(int i=2;i<=num/2;i++)
	{
		if(num%i==0){
			flag=true;
	}	
	}
	if(!flag)
	System.out.println( num+" is a prime");
	else	
		System.out.println( num+"  not prime ");		
	}
}

