package tw.iii.org;

public class Brad32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Brad321 obj1 = new Brad321();
		//��H���O�L�knew�@�ө�H����
//		Brad322 obj2 = new Brad322();
		// ��l is a ����
		Brad322 obj2 = new Brad323();
		
		
	}

}

class Brad321 {
	void m1() {
	};
}

// ��H�D���O�ŧi
abstract class Brad322 {
	Brad322(){
		System.out.println("�ڬO����");
	}
	void m1() {
	};

	abstract void m2();
}
//�l���O�b��H���O����������H
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