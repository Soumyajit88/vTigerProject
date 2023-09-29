package com.CRM.vTiger1.practice;

import org.testng.annotations.Test;

public class DataProviderPracticeCalling {
		
		@Test(dataProvider = "data",dataProviderClass = DataPPractice.class)
		public void cllaDataProvider(String StudentName,double Salary) {
			System.out.println(StudentName+"  "+Salary);
		}

}
