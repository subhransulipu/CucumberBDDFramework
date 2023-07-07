package stepDefination;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Then;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class porter_landing_page {

	WebDriver driver;
//	Action act= new Action(driver);
//	act.m

	@Given("user enter with valid username in email field")
	public void user_enter_with_valid_username_in_email_field() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	    driver.findElement(By.name("email")).sendKeys("subhransulipu237@gmailcom");
	}
	@Given("user enter with valid password")
	public void user_enter_with_valid_password() {
		driver.findElement(By.name("password")).sendKeys("123456");
	}
	@When("user click on login button")
	public void user_click_on_login_button() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	}
	@Then("user logedin successfully")
	public void user_logedin_successfully() {
	   
	}




}
