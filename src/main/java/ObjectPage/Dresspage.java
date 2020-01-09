package ObjectPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dresspage extends BasePage{

		@FindBy(xpath="//*[@id=\"ul_layered_id_attribute_group_1\"]/li[1]/label/a")
		private WebElement checkSsize;
	
		@FindBy(xpath="//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img")
		private WebElement ProductImg;
		
		@FindBy(name="Submit")
		private WebElement subBtn;
		
		public Dresspage() {
			PageFactory.initElements(driver, this);
		}
		
		public WebElement getSsize() {
			return checkSsize;
		}
		
		public WebElement getProductImg() {
			return ProductImg;
		}
		
		public WebElement getbtn() {
			isElementVisible(subBtn);
			return subBtn;
			
		}
	
}
