package tw.iii.org;

public class Brad32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Brad321 obj1 = new Brad321();
		//抽象類別無法new一個抽象物件
//		Brad322 obj2 = new Brad322();
		// 兒子 is a 爸爸
		Brad322 obj2 = new Brad323();
		
		
	}

}

class Brad321 {
	void m1() {
	};
}

// 抽象主類別宣告
abstract class Brad322 {
	Brad322(){
		System.out.println("我是爸爸");
	}
	void m1() {
	};

	abstract void m2();
}
//子類別在抽象類別必須解釋抽象
class Brad323 extends Brad322 {

	void m2() {
		System.out.println("hi Brad323");
	};

}
class Brad324 extends Brad322 {

	void m2() {
		System.out.println("hi Brad324");
	};

}