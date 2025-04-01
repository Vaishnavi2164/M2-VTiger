package genericUtility;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesUtility {
	/**
	 * This is generic method to fetch a value from propertiesFile using its corresponding key
	 * @param key
	 * @return
	 * @throws Exception
	 */
	public String getDataFromProperties(String key) throws Exception {
		FileInputStream fis=new FileInputStream(IPathUtility.propertiesPath);
		Properties prop=new Properties();
		prop.load(fis);
		String value=prop.getProperty(key);
		return value;
		
	}

}
