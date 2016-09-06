package tw.iii.org;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Brad36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File obj1 = new File("./dir1/brad.txt");
		if(obj1.exists()){
		 System.out.println(obj1.getAbsolutePath());
		}
		try {
			FileInputStream files = new FileInputStream(obj1);
			
			
		int c ; byte[] buf= new byte[3] ;
		while((c=files.read(buf))!=-1){
			System.out.print(new String(buf,0,3));	
		};
		
			
			
			
			
			
			files.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
