package stepDefination;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.cucumber.java.en.Then;

public class RegisterPage {
	
	WebDriver driver;
	
	@Given("user go to register page")
	public void user_go_to_register_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.findElement(By.xpath("//aside[@id='column-right']/div/a[text()='Register']")).click();
//		driver.findElement(By.id("input-firstname")).sendKeys("fdfdvdsvs");
	}
	@When("user enters the following user details")
	public void user_enters_the_following_user_details(io.cucumber.datatable.DataTable dataTable) {
//		List<List<String>>data=dataTable.asList(String.class);
//		for(List<String>e:data) {
//			System.out.println(e.get(0));
//			driver.findElement(By.id("input-firstname")).sendKeys(e.get(0));
//			driver.findElement(By.id("input-lastname")).sendKeys(e.get(1));
//			driver.findElement(By.id("input-email")).sendKeys(e.get(2));
//			driver.findElement(By.id("input-telephone")).sendKeys(e.get(3));
//			driver.findElement(By.id("input-password")).sendKeys(e.get(4));
//			driver.findElement(By.id("input-confirm")).sendKeys(e.get(5));
//		}
		List<Map<String,String>>data=dataTable.asMaps(String.class, String.class);
		for(Map<String,String>e:data) {
			driver.findElement(By.id("input-firstname")).sendKeys(e.get("Firstname"));
			driver.findElement(By.id("input-lastname")).sendKeys(e.get("Lastname"));
			driver.findElement(By.id("input-email")).sendKeys(e.get("emailid"));
			driver.findElement(By.id("input-telephone")).sendKeys(e.get("phonenumber"));
			driver.findElement(By.id("input-password")).sendKeys(e.get("password"));
			driver.findElement(By.id("input-confirm")).sendKeys(e.get("confirmpassword"));
		}
		
		
	   
	}


	@Then("user click the privecy policy")
	public void user_check_the_privecy_policy() {
		driver.findElement(By.xpath("//input[@name='agree']")).click();
	}
	@Then("user press on continue button")
	public void user_press_on_continue_button() {
		driver.findElement(By.xpath("//input[@type='submit']")).click()
		;
	}




}
