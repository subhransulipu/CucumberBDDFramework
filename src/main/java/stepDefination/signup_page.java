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


public class signup_page {
	
	WebDriver driver;
	
	
	@Given("user click on register page")
	public void user_click_on_register_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.findElement(By.xpath("//aside[@id='column-right']/div/a[text()='Register']")).click();
//		driver.findElement(By.id("input-firstname")).sendKeys("fdfdvdsvs");
	}
	@When("user enter {string} and {string}")
	public void user_enter_first_name(String firstname, String lastname) {
		driver.findElement(By.id("input-firstname")).sendKeys(firstname);
		driver.findElement(By.id("input-lastname")).sendKeys(lastname);
	}
	@When("user give {string} and {string}")
	public void user_enter_last_name(String emailid,String phonenumber) {
		driver.findElement(By.id("input-email")).sendKeys(emailid);
		driver.findElement(By.id("input-telephone")).sendKeys(phonenumber);
	}
	@When("user put {string} and {string}")
	public void user_enter_email_id(String password, String confirmpassword) {
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.id("input-confirm")).sendKeys(confirmpassword);
	}
	
	@When("user check the privecy policy")
	public void user_check_the_privecy_policy() {
		driver.findElement(By.xpath("//input[@name='agree']")).click();
	}
	@When("user click on continue")
	public void user_click_on_continue() {
		driver.findElement(By.xpath("//input[@type='submit']")).click()
		;
	}
	
//	@Then("user registered successfully")
//	public void user_registered_successfully() {
//		WebElement successMsg=driver.findElement(By.xpath("//div[@id='content']/h1[text()='Your Account Has Been Created!']"));
////		assertEquals(successMsg, true);
//		driver.close();
//		}
	
	



}
