package tw.iii.org;

public class Brad34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Brad341 ba = new Brad341();
		ba.brader();
     
	}

}
class Brad341 {
	int a=10,b=0 ;
	void brader(){
		try{
			System.out.println(a/b);
			return;
			
		}catch(Exception e){
		    System.out.println("Brad");	
		}finally{
			System.out.println("Final");	
			
		}	
		System.out.println("Continue");
	}
	
	
}
