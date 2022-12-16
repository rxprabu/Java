package interview;
public class Over {
	void add(int a, int b) {
		int c = a + b;
		System.out.println("Overloading" + c);
	}
void add(int a, int b, int c) {
		int d = a + b * c;
		System.out.println("Overloading" + d);
	}
	class Riding extends Over {
		void add(int a, int b) {
			int c = a + b;
			System.out.println("Overriding" + c);
		}
	}
	public static void main(String args[]) {
	Over  m=new Over();
	Over.Riding s = m.new Riding();
		m.add(3,5);
		m.add(2,4,6);
		s.add(8, 2);
		
	}
}
