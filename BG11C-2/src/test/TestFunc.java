package test;

public class TestFunc {
	
	static int a() {
		System.out.println("a called");
		return 0;
	}
	
	static int b() {
		System.out.println("b called");
		return 0;
	}

	static void f(int g, int h) {
		System.out.println(g + " " + h);
	}

	public static void main(String[] args) {
		f(a(), b());
	}

}
