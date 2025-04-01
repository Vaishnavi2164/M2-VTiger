package section3;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AnnotationPractice {
	@BeforeClass
	public void bcConfig() {
		System.out.println("In before class");
	}
	@BeforeMethod
	public void dmConfig() {
		System.out.println("In before Method");
	}
	@Test
	public void testMethod() {
		System.out.println("In test method");
	}
	@AfterMethod
	public void amCofig()
	{
		System.out.println("In after method");
	}
	@AfterClass
	public void acCofig()
	{
		System.out.println("In after Class");
	}
	@AfterSuite
	public void asCofig()
	{
		System.out.println("In after Suite");
	}
	@BeforeSuite
	public void bsCofig()
	{
		System.out.println("In before Suite");
	}
}
