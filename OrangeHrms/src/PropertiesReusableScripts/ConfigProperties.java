package PropertiesReusableScripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigProperties {
	private String configFilePath; 
	private  FileInputStream fis;
	private static Properties propObject;
	public ConfigProperties(String filePath) throws IOException
	{
		this.configFilePath=filePath;
		fis= new FileInputStream(configFilePath);
		propObject = new Properties();
		propObject.load(fis);
		
	}
	public static Properties getPropertiesObject()
	{
		return propObject;
	}
	
	public  static String getProperyValue(String propValue)
	{
		String value=null;
		if(propObject!=null)
		{
			value = propObject.getProperty(propValue);
		}
		return value;
	}

}
