package cours3;
class A {

	void m(A a) {
		System.out.println(" m de A");
	}

	 void n(A a) {
		System.out.println(" n de A");
	}
}
public class B extends A {

	public static void main(String args[]) {
		A a = new B();
		B b = new B();
	
	a.m(b);	
	a.n(b);
	
	}
	
	void m(A a) {
		System.out.println(" m de B");
	}

	void n(B b) {
		System.out.println(" n de B");
	}
}

