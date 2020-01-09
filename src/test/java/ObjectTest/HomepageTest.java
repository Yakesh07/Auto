package ObjectTest;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ObjectPage.BasePage;
import ObjectPage.HomePage;

public class HomepageTest {
	
		BasePage bp;
		HomePage hp;
		
		public HomepageTest() {
			bp= new BasePage();
			hp= new HomePage();
		}
		
		
		@Test(groups= {"Regression"})
		public void verifyGetWomen() {
			Assert.assertTrue(bp.elementFound(hp.getWomenTag()), "Failed to display");
		}
		
		@Test
		public void verifyWomenPage() {	
			String wt=bp.driver.getTitle();
			Assert.assertTrue(wt.contains("Women"),	 "Failed to verify");
		}

			
		@BeforeMethod	
		public void verifyClick() {
			hp.getWomenTag().click();
		}
}

