package com.CRM.vTiger1.testNGPractice;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft {
	@Test
	public void main() {
		String actual="Maharaja";
		String expected="Raja";
		SoftAssert sa=new SoftAssert();
		sa.assertTrue(actual.contains(expected));
		System.out.println("Test case Passes");
		
		sa.assertAll();
	}
}
