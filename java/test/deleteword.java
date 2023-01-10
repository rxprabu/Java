public class deleteword {
	public static void main(String args[])
	{
		String a= "tim tom sam ram rom tom";
		String b[]=a.split(" ");
         int count=0;
		  for(int i=0;i<b.length;i++) {
			 for(int j=i+1;i<b.length;j++) {
				if(b[i].equals(b[j]))
					b[j]="0";
				System.out.println(" duplicate "+b[j]);
			}
			if(b[i]!="0")
			{
			System.out.println(b[i]);	
		}
		
	}
		
	}
}
