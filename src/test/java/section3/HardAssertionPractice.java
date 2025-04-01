package section3;

import org.testng.Assert;
import org.testng.annotations.Test;
public class HardAssertionPractice {
	@Test
	public void strictLevelComparision()
	{
		String expectedName ="Raja";
		String actualName = "Raj";
		
		Assert.assertEquals(actualName, expectedName);
		System.out.println("Hard assertion strict level completed");
		
	}
	@Test
	public void containsLevelComparision()
	{
		String a1 = "Don";
		String a2 = "London";
		
		Assert.assertTrue(a2.contains(a1));
		System.out.println("Hard Assertion contains level completed");
	}


}
