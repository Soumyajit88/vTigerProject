package com.CRM.vTiger1.practice;

import com.CRM.vTiger1.genericUtility.FileUtility;

public class PracticeGenericUtility {
	/**
	 * This mwthod calls generic method to fetch property file data
	 * @param args
	 * @throws Throwable
	 */

	public static void main(String[] args) throws Throwable {
		FileUtility fu=new FileUtility();
		String browser = fu.toGetDataFromPropertyFile("browserName");
		System.out.println(browser);
	}
}
