package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataTable {

WebDriver driver;
	
	
	@Given("user is on home page")
	public void user_is_on_home_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo");
		
	}
	@When("user click show all desktop")
	public void user_click_show_all_desktop() {
		driver.findElement(By.id("input-firstname")).sendKeys("Hjj");
		driver.findElement(By.id("input-lastname")).sendKeys("ghh");
	}
	@When("user select the first product")
	public void user_select_the_first_product() {
		driver.findElement(By.id("input-email"));
		driver.findElement(By.id("input-telephone"));
	}
	@Then("user verify the product")
	public void user_verify_the_product() {
		
	}
	
	
	



}
