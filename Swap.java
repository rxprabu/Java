package interview;

public class Swap {
	void tempswap() {
	int a=1;
	int b=6;
    int temp =a;
        a=b;
        b=temp;
	System.out.println(b+"  Temp  b");
	System.out.println(a+"  Temp a");
	System.out.println(temp +"  Temp");}
	void swap() {
		int a=10;
		int b=8;
	    a=a+b;
	    b=a-b;
        a=a-b;
		System.out.println(b+" without b");
		System.out.println(a+"  without a");
	}
	public static void main(String[] args) {
		Swap s=new Swap();
		s.tempswap();
		s.swap();

	}

}
