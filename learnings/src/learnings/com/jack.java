package learnings.com;
public class jack{
	public static void main(String args[])
	{
	/*for( int i=1;i<=10;i++){
		System.out.print(i*i);}
	for(i=1;i<=10;i++){
		if(i%2==0){
			System.out.print(i);}}*/
		String s= new String("java");
		long startTime=System.currentTimeMillis();//change only Buffer Builder and
		//only String we get different form of execution
	
		for(int i=1;i<=1000000;i++)
		{
			s.concat("pro");
		}
			long endTime=System.currentTimeMillis();
			System.out.println(endTime-startTime+"ms");
		}
}