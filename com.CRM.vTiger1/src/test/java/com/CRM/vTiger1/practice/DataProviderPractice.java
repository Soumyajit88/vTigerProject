package com.CRM.vTiger1.practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderPractice {
	
	@DataProvider(name = "datas")
	public Object[][] data() {
		Object[][] data=new Object[3][4];
		data[0][0]="Soumya";
		data[0][1]=5000.5;
		data[0][2]=4;
		data[0][3]='c';
		data[1][0]="Maharshi";
		data[1][1]=10000.9;
		data[1][2]=5;
		data[1][3]='d';
		data[2][0]="Raju";
		data[2][1]=20000.9;
		data[2][2]=4;
		data[2][3]='e';
		return data;
	}
	
	@Test(dataProvider = "datas")
	public void StudentDetails(String StudentName,double Salary,int RollNo,char Grade) {
		System.out.println(StudentName +"  "+Salary+"  "+RollNo+"  "+Grade);
	}
}
