package tw.iii.org;

public class Brad33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10, b = 0;
		int[] d = {1,2,3,4};
		try{
			int c = a / b;
			System.out.println(c);
			System.out.println(d[3]);
		}catch (ArithmeticException ae){
			System.out.println("Brad2");	
			
		}catch(RuntimeException re){
			System.out.println("Brad1");
		}
//		}catch (ArithmeticException ae){
//			System.out.println("Brad1");
//		}catch (ArrayIndexOutOfBoundsException ae){
//			System.out.println("Brad2");
//		}
		System.out.println("Game Over");
	}

}
