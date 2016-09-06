package tw.iii.org;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;

public class Brad37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream frut = new FileOutputStream("./dir1/test.txt") ;
			frut.flush();
			frut.close();
			System.out.println("Write OK");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}

}
