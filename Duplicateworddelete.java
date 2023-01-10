package interview;

public class Duplicateworddelete {
	public static void main(String args[])
	{
		String a= "tim tom sam ram rom tom ram rom jug mug tim";
		String b[]=a.split(" ");
	//	int count=0;
	for(int i=0;i<b.length;i++) {
			for(int j=i+1;j<b.length;j++) {
				if(b[i].equals(b[j])) {
					b[j]="";
				//	b[j]=b[j].strip();
					b[j]=b[j].trim();
					// count++;
		//	System.out.println(" duplicate "+count+"  "+b[j]);
			}
		                                                             	//System.out.println(" duplicate "+count+"  "+b[i]);
	                                                                   		if(b[i]!=" ")
			                                                             {
	                                                                   	
			                                                             }
	                                                                     	}	System.out.print(b[i]+" ");	}
		
	}
		
	
	}

	


