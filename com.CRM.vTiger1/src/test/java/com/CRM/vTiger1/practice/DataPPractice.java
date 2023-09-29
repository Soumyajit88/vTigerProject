package com.CRM.vTiger1.practice;

import org.testng.annotations.DataProvider;

public class DataPPractice {
	
	@DataProvider
	public Object[][] data() {
		Object[][] data=new Object[2][2];
		data[0][0]="Soumya";
		data[0][1]=5000.5;
		data[1][0]="Maharshi";
		data[1][1]=10000.9;
		return data;
	}
	
}
