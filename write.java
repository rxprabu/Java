package interview;
import java.io.FileWriter;

public class write{

	public static void main(String[] args) {
		for(int i=0;i<=5;i++)
		{
		try {
		FileWriter few =new FileWriter("/home/prabu/java/pattern0"+i+"txt");
		few.write("yeah buddy light weight "+i);
		few.flush();
		few.close();
		System.out.println("Success");
		}
		
		catch(Exception e)
		{
System.out.println(e);
	}
	}
}
}