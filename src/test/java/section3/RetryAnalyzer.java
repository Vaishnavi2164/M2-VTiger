package section3;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryAnalyzer {
	@Test(retryAnalyzer =genericUtility.RetryAnalyzerImplementation.class)
	public void sample()
	{
		System.out.println("Hi");
		Assert.fail();
	}

}
