package com.CRM.vTiger1.practice;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFilePractice  {

	public static void main(String[] args) throws Exception{
		File src=new File("./src/test/resources/Property.properties");
		FileInputStream fis=new FileInputStream(src);
		Properties prop=new Properties();
		prop.load(fis);
		String browser = prop.getProperty("browserName");
		String url = prop.getProperty("url");
		String userName = prop.getProperty("userName");
		String password = prop.getProperty("password");
		System.out.println(browser);
		System.out.println(url);
		System.out.println(userName);
		System.out.println(password);
	}

}
