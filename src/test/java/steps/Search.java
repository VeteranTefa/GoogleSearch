package steps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import basePackage.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjectModel.SearchPOM;

public class Search extends BaseClass {
	
	SearchPOM s;
	@Given("user shoud exist in google website")
	public void user_shoud_exist_in_google_website() {
		Intialization();
	}

	@When("search about word")
	public void search_about_word() {
		s=new SearchPOM();
		s.searchAboutWord();
		
	}

	@When("display a list of result")
	public void display_a_list_of_result() {
		WebElement list=driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/ul[1]/div/ul"));
		System.out.println(list.getText());
	}

	@Then("proccess is completed")
	public void proccess_is_completed() {
		System.out.println("Done Successfully");
	}


}
