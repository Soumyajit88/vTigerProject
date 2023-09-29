package com.CRM.vTiger1.Assignment;

import java.util.ArrayList;
import java.util.Collections;

public class StringToIntSort {
	
	public static void main(String[] args) {
		
		
		ArrayList<String> arr1=new ArrayList<String>();
		arr1.add("2400");
		arr1.add("322");
		arr1.add("12345");
		ArrayList<Integer> arr2=new ArrayList<Integer>();
		for(int i=0;i<=arr1.size()-1;i++) {
			String ar = arr1.get(i);
			int inte = Integer.parseInt(ar);
			arr2.add(inte);
		}
		Collections.sort(arr2);
		System.out.println(arr2);
	}
}
