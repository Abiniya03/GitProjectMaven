
public class BasicCalc {

	static void add(int a,int b) {
		System.out.println(a+b);
	}

	static void sub(int a,int b) {
		System.out.println(a-b);
	}

	static void mul(int a,int b) {
		System.out.println(a*b);
	}

	static void div(int a,int b) {
		System.out.println(a/b);
	}

	static void mod(int a,int b) {
		System.out.println(a%b);
	}

	
	public static void main(String[] args) {
	
		add(25,3);
		sub(25,3);
		mul(25,3);
		try {
		div(25,3);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		mod(25,3);

	}

}
