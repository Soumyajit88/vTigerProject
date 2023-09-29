package com.CRM.vTiger1.practice;

import com.CRM.vTiger1.genericUtility.ExcelFileUtility;

public class PracticeGenericUtilityExcel {

	public static void main(String[] args) throws Throwable {
		ExcelFileUtility ex=new ExcelFileUtility();
		String url=ex.toGetDataFromExcelFile("Sheet1", 0, 0);
		System.out.println(url);
	}

}
