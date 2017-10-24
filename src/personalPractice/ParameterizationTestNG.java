package personalPractice;

import org.testng.Assert;
import org.testng.annotations.*;

public class ParameterizationTestNG {
	public int testCount;
	
	@BeforeTest
	public void begin() {
		testCount = -1;
	}
	
	@BeforeMethod
	public void zero() {
		testCount = 0;
	}
	
	@Test
	@Parameters({"string"})
	public void test1(@Optional("ECE110") String s) {
		testCount += s.length();
		Assert.assertEquals(testCount, s.length());
	}
	
	@AfterMethod
	public void reZero() {
		if (testCount != 0) {
			testCount = 0;
		}
	}
	
	@AfterTest
	public void destroy() {
		testCount = -1;
	}
}
