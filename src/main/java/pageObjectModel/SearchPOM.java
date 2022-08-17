package pageObjectModel;


import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseClass;

public class SearchPOM extends BaseClass {
	public SearchPOM() {
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(name="q")
	WebElement search;
	public void searchAboutWord() {
		
		this.search.sendKeys("Animals");
	}
	

	

}
