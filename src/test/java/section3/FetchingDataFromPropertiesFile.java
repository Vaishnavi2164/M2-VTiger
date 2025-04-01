package section3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericUtility.PropertiesUtility;

public class FetchingDataFromPropertiesFile {
	public static void main(String[] args) throws Exception {
		PropertiesUtility pUtil=new PropertiesUtility();
		String URL=pUtil.getDataFromProperties("url");
		//String UN=pUtil.getDataFromProperties("username");
		WebDriver driver=new ChromeDriver();
		driver.get(URL);
		Thread.sleep(1000);
	}

}
