package tw.iii.org.java;

public class Brad24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String S1 = "Brad" ;
       String S2 = "Brad" ;
       String S3 = new String("Brad") ;
       String S4 = new String("Brad") ;
       System.out.println(S1==S2);
       System.out.println(S3==S4);
       System.out.println(S3.equals(S4));
    // ==為記憶體的位置
    // .equals 呼叫字串內容	   
	}

}
