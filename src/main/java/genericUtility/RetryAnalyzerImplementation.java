package genericUtility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzerImplementation implements IRetryAnalyzer {
	
	int count=0;
	int maxCount=4;       //manual Execution

	@Override
	public boolean retry(ITestResult result) {
		
		//0<4 -> retry,1<4 -> retry .....4<4 > stop retry
		while(count<maxCount)
		{
			count++;
			return true;
		}
		return false;
	}

}
