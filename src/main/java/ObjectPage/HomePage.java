package ObjectPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage  {
	
		@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[1]/a")
		private WebElement WomenTag;
	
	
		
		public HomePage() {
				PageFactory.initElements(driver, this);
		}

		public WebElement getWomenTag() {
			return WomenTag;
		}	
		
		
	
	

}
