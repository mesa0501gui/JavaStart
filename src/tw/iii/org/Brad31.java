package tw.iii.org;

interface Brad291 {
	void m1();

	void m2();

}

class Brad292 implements Brad291 {
	public void m1() {
		System.out.println("Brad292:m1");
	};

	public void m2() {
		System.out.println("Brad292:m2");
	};
}

class Brad293 implements Brad291 {
	public void m1() {
		System.out.println("Brad293:m1");
	};

	public void m2() {
		System.out.println("Brad293:m2");
	};
}

public class Brad31 {
	Brad292 obj1 = new Brad292() ;
	Brad293 obj2 = new Brad293() ;
	
class Brad294 {
	void m3(Brad291 a){} ;
} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
