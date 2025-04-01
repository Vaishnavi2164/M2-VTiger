package section3;

import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	public static void main(String[] args) throws Exception {
		FileInputStream fis=new FileInputStream("C:\\vaish\\TestDataSample.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String URL=prop.getProperty("url");
		String UN=prop.getProperty("username");
		
		//System.out.println(URL);
		WebDriver driver=new ChromeDriver();
		driver.get(URL);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-label='phone number,username,or email")).sendKeys(UN);
		

     }
}
