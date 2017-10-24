package personalPractice;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTestNG {
	@Test(dataProvider="StringProvider")
	public void test2(String s) {
		Assert.assertTrue(4 == s.length());
	}
	
	@DataProvider(name="StringProvider")
    public Object[][] getDataFromDataprovider(){
    return new Object[][] 
    	{
            { "JACK" },
            { "JANE" },
            { "LUCY" }
        };

    }
}
