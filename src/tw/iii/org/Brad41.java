package tw.iii.org;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class Brad41 {

	public static void main(String[] args, int line) {
		try {
			//File,Input Åª¤J
			FileInputStream fin = 
					new FileInputStream("dir1/brad.txt");
			//InputStream ¦r¦êÂà Reader
			InputStreamReader irs = new InputStreamReader(fin);
			BufferedReader br = new BufferedReader(irs);
			while(line!=-1){
				String line1 = br.readLine();
				System.out.println(line1);
					
			}
			
			fin.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}