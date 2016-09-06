package tw.iii.org;

import java.io.File;
import java.io.IOException;

public class Brad35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file1 = new File("c:/king/file1");
		if (file1.isFile()){
			System.out.println("OK");
		}else{
			try{
				if (file1.createNewFile()){
					System.out.println("Create OK");
				}else{
					System.out.println("Create Fail");
				}
			}catch(IOException ie){
				System.out.println();
			}
		}
		
		File file2 = new File("c:/test/dir1/dir2/dir3/dir4");
		if (!file2.isDirectory()){
			file2.mkdirs();
		}
	}

}
