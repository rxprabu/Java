package learnings.com;
import java.util.Scanner;
public class Timer {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in); {
			{
System.out.println("!--To Start a Timer at N number of time execution click (s)--!");
System.out.println(" ");
				char num =0;
				num=a.next().charAt(0);
long startTime;
long endTime;
while(num=='s'||num=='S')
{
System.out.println("Enter a Number to Start a Timer");
startTime=a.next().charAt(0);
System.out.println("Enter a Number to Stop a Timer");
endTime=a.next().charAt(0);
startTime=System.currentTimeMillis();
endTime=System.currentTimeMillis();
System.out.println(("Its Takes("+(endTime-startTime/1000)%60)+")seconds");
System.out.println(" ");

}
a.close();
}
}
}
}

