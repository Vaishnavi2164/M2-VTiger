package section3;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestNGPractice 
{
	@Ignore
	@Test(priority=-1)
	public void createUser()
	{
		System.out.println("User created");
	}
	@Test(priority=2,dependsOnMethods = {"deleteUser"})
	public void modifyUser()
	{
		System.out.println("user modified");
	}
	@Test(priority=0)
	public void deleteUser()
	{
		System.out.println("user deleted");
	}
	

}
