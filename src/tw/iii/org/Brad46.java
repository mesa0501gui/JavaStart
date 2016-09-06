package tw.iii.org;

public class Brad46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Brad461 obj1=new Brad461("a");
		Brad461 obj2=new Brad461("b");
		Brad462 obj3=new Brad462("c");
		Thread t1 =new Thread(obj3);
		
		obj1.start();
		obj2.start();
		t1.start();
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
		}
		System.out.println("MAIN------------------------");
		obj1.interrupt();
		
	}

}

class Brad461 extends Thread{
	String name ;
	Brad461(String name){
		this.name =name ;
	}
	//物件還在
	public void run(){
		for(int i=0; i<10 ;i++){
		System.out.println("name"+" :"+name+" =>"+i);	
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			break ;
		}
		}	
	}
	
}


class Brad462 implements Runnable{
	String name ;
	Brad462(String name){
		this.name =name ;
	}
	//物件還在
	public void run(){
		for(int i=0; i<10 ;i++){
		System.out.println("name"+" :"+name+" =>"+i);	
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			break ;
		}
		}	
	}
	
}
