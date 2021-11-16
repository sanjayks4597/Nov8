package common_questions;

import java.util.ArrayList;

public class CopyElementFromListToAnother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> Al=new ArrayList();
		
		Al.add(41);
		Al.add(4);
		Al.add(45);
		Al.add(12);
		Al.add(63);
		System.out.println(Al);
		ArrayList<Integer> CopyAl=new ArrayList();
		CopyAl.addAll(Al);
		
		System.out.println(CopyAl);

	}

}
