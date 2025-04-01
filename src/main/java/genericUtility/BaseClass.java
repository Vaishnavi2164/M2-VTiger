package genericUtility;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import ObjectRepository.HomePage;
import ObjectRepository.LoginPage;

public class BaseClass {
	public WebDriver driver;
	//public static WebDriver sDriver;      //for Listeners
	public SeleniumUtility sUtil=new SeleniumUtility();
	public PropertiesUtility pUtil=new PropertiesUtility();
	public ExcelUtility eUtil=new ExcelUtility();
	
	//For making WebDriver reference variable as thread safe
	public static ThreadLocal<WebDriver> driverInstance=new ThreadLocal<>();
	
	@BeforeSuite(alwaysRun = true)
	public void dbConnection()
	{
		System.out.println("DB connection created");
	}
	
	@Parameters("browser")
	@BeforeClass(alwaysRun = true)
	public void launchBrowser(@Optional("chrome") String BROWSER) throws Exception
	{
		if(BROWSER.equals("chrome")) 
		{
			driver=new ChromeDriver();	
		}
		else if(BROWSER.equals("edge"))
		{
			driver=new EdgeDriver();
		}
		else if(BROWSER.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else 
		{
			driver=new ChromeDriver();
		}
		
		
	//	sDriver=driver;     /////initializing ststic driver code//////////
		
		 //used in listeners for screenshot for making driver as thread safe in parallel execution
		setDriver(driver);   
		sUtil.maximizeWindow(driver);
		sUtil.implicitWait(driver, 10);
		
		String URL=pUtil.getDataFromProperties("url");
		sUtil.navigateToApplication(driver, URL);
		System.out.println("Browser launched sucessfully");
	}
	
	@BeforeMethod(alwaysRun = true)
	public void loginOperation() throws Exception
	{
		String UN=pUtil.getDataFromProperties("username");
		String PWD=pUtil.getDataFromProperties("password");
		LoginPage lp=new LoginPage(driver);
		lp.loginToApplication(UN, PWD);
		System.out.println("Login done sucessfully");
	}
	
	@AfterMethod(alwaysRun = true)
	public void logoutOperation()
	{
		HomePage hp=new HomePage(driver);
		hp.signOutOperation(driver);
		System.out.println("Logout done sucessfully");
	}
	
	@AfterClass(alwaysRun = true)
	public void closeBrowser()
	{
		driver.quit();
		System.out.println("Browser closed sucessfuly");
	}
	
	@AfterSuite(alwaysRun = true)
	public void closeDBConnection()
	{
		System.out.println("DB connection closed");
	}
	
	//Sets the current thread's copy of this thread-local variable to the specified value
	public static void setDriver(WebDriver driver)
	{
		driverInstance.set(driver);
	}
	
	//Returns the value in the current thread's copy of this thred-local variable
	public static WebDriver getDriver()
	{
		return driverInstance.get();
	}
}
