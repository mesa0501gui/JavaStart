package tw.iii.org;

import java.util.TreeSet;

public class Brad42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet set = new TreeSet();
		while(set.size()<6){
			set.add((int)(Math.random()*49+1));
		}
		System.out.println(set.toString());
	}

}