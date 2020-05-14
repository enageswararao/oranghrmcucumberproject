package com.testutilies;

import java.io.File;
import java.io.InputStream;
import java.util.Properties;

public class GetProperyInfo {

	
	
	public void   getPropValue(String keyvalue) {
		
		String result = "";
		InputStream inputStream;
		
		Properties prop = new Properties();
		String propFileName = System.getProperty("user.dir")+"\\src\\test\\java\\com\\configuration\\configuration.properties";

		inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);

		
		
		
		
	}
	public static void main(String[] args) {
	 
		
		String path = System.getProperty("user.dir")+"\\src\\test\\java\\com\\configuration\\configuration.properties";
		//String path = System.getProperty("user.dir")+File.separator+"src"+File.separator+File.separator+"test"+\\java\\com\\configuration\\configuration.properties";
		System.out.println("Location of file : "+ path);
	}

}
