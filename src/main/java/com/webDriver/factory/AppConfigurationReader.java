package com.webDriver.factory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Set;

public class AppConfigurationReader {
	
	private final Properties configProp = new Properties();
	
	private AppConfigurationReader() {
		InputStream is = this.getClass().getClassLoader().getResourceAsStream("repository.properties");
		
		System.out.println("reading properties file");
		
		try {
			configProp.load(is);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.getStackTrace();
		}
	}
	
	private static class LazyHolder
	{
		private static final AppConfigurationReader INSTANCE = new AppConfigurationReader();
	}
	
	public static AppConfigurationReader getInstance()
	{
		return LazyHolder.INSTANCE;
	}
	
	public String getProperty(String key)
	{
		return configProp.getProperty(key);
	}
	
	public Set<String> getAllPropertyNames()
	{
		return configProp.stringPropertyNames();
	}
	
	

}
