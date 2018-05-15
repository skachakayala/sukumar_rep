package suporters;

import java.io.IOException;

import PropertiesReusableScripts.ConfigProperties;

public class ObjectReusable {
	private static String configFilePath="D:\\Java\\Java workspace\\OrangeHrms\\src\\configuration\\configuration.properties";
	private static  ConfigProperties configprop;
	public static ConfigProperties getConfigProperties(String configFilePath) throws IOException
	{
		ConfigProperties configprop = new ConfigProperties(configFilePath);
		return configprop;
	}
	public static String getConfigFilePath()
	{
		return configFilePath;
	}

}
