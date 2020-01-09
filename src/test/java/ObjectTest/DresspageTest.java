package ObjectTest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import ObjectPage.BasePage;
import ObjectPage.Dresspage;
import ObjectPage.HomePage;

public class DresspageTest {

		BasePage bp;
		HomePage hp;
		Dresspage dp;
		
		public DresspageTest12678() {

		public DresspageTest1234() {

			bp= new BasePage();
			hp= new HomePage();
			dp= new Dresspage();
		}
		
		@Test
		public void verifySsize() {
			hp.getWomenTag().click();
			Assert.assertTrue(bp.elementFound(dp.getSsize()), "Failed to dsiplay");
		}
		
		
		@Test
		public void verifyAdd() {
			hp.getWomenTag().click();
			dp.getProductImg().click();	
			bp.driver.switchTo().frame(dp.driver.findElement(By.xpath("//*[@id=\"fancybox-frame1577354549630\"]")));
			dp.getbtn();
		}
}
