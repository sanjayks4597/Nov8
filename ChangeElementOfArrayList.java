package common_questions;

import java.util.ArrayList;

public class ChangeElementOfArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al=new ArrayList ();
		al.add("sanjay");
		al.add("ram");
		al.add(45);
		al.add(true);
		al.add("damu");
		System.out.println(al);
		
		al.add(2, "punum");
		System.out.println(al);
		
		

	}

}
