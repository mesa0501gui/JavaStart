package tw.iii.org.java;

public class Brad23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String a =new String() ;
	//String(byte[] bytes)
	byte[] b ={1,2,3,4,5} ;
    String c=new String(b);
    //String(char[] value, int offset, int count)
    String d= new String(b,1,2);
     
    Bike myBike = new Bike();
    
    System.out.println(a);
//    System.out.println(b);
    System.out.println(d);
    System.out.println(myBike);
	}

}
