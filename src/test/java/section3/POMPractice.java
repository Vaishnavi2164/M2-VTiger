package section3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtility.SeleniumUtility;

public class POMPractice {
	@FindBy(id="name")
	WebElement element;
	
	public POMPractice(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		SeleniumUtility sUtil=new SeleniumUtility();
		WebDriver driver=new ChromeDriver();
		sUtil.implicitWait(driver, 10);
		sUtil.maximizeWindow(driver);
		sUtil.navigateToApplication(driver, "https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(1000);
		
		POMPractice p=new POMPractice(driver);
		p.element.sendKeys("vaishnavi");
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(1000);
		p.element.sendKeys("vaishnavi");
		
	}

}
