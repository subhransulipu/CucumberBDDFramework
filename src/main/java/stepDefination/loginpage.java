package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class loginpage {
	WebDriver driver;
	

		@Given("Enter url of the website {string}")
		public void enter_url_of_the_website(String string) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.get(string);
		}
		@Then("I should see {string} page with all the details")
		public void i_should_see_page_with_all_the_details(String string) {
			String wb=driver.findElement(By.xpath("//h2[text()='Customer Login']")).getText();
			Assert.assertEquals(string, wb);
		}
		

		@When("I click on the Login button without entering the login credentials")
		public void i_click_on_the_login_button_without_entering_the_login_credentials() {
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			}
		
		@Then("I should see user validation text messages")
		public void i_should_see_user_validation_text_messages() {
			driver.findElement(By.xpath("//span[text()='Enter Your Email']")).isDisplayed();
		}
		
		
		@When("I enter the uname {string} and password {string}")
		public void i_enter_the_uname_and_password(String string, String pwd) {
			driver.findElement(By.id("tbluser_email")).sendKeys(string);
			driver.findElement(By.id("tbluser_password")).sendKeys(pwd);
			driver.findElement(By.xpath("//input[@type='submit']")).click();
		}
		
		@Then("based on the entered login details it should show Error Message or Username")
		public void based_on_the_entered_login_details_it_should_show_Error_Message_or_Username() {
			
			driver.findElement(By.xpath("//li[@id='admin']")).click();
			String wb2=driver.findElement(By.xpath("//div[@class='profName']/span[text()='test']")).getText();
			System.out.println(wb2);
//			Assert.assertEquals("test", wb2);
		}
		
		@When("I click on the product type dropdown list")
		public void I_click_on_the_product_type_dropdown_list() {
			driver.findElement(By.xpath("//a[text()='Operations' and @class='text-menu']")).click();
		}
		
		
		
		@Then("Select the Marketing product type from the list")
		public void select_the_product_type_from_the_list(String string) {
			driver.findElement(By.xpath("//a[text()='Marketing']")).click();
//			WebElement wb3=driver.findElement(By.xpath("//a[text()='Operations' and @class='text-menu']"));
//			Select sl= new Select(wb3);
//			sl.selectByVisibleText(string);
			
		}
		
		@Then("Click on the {string} specific Sales Statuses drop-downs, and from the statuses drop-down list, click on the {string} checkbox")
		public void click_on_the_specific_sales_statuses_drop_downs_and_from_the_statuses_drop_down_list_click_on_the_checkbox(String string, String string2) {
			driver.findElement(By.xpath("//a[@data-toggle='dropdown' and text()='Select Community']")).click();
			driver.findElement(By.xpath("//a[text()='Bridgemill']")).click();
//			WebElement wb3=driver.findElement(By.xpath("//a[@data-toggle='dropdown' and text()='Select Community']"));
//			Select sl= new Select(wb3);
//			sl.selectByVisibleText(string);
		}
		@When("Select {string} community from the list")
		public void select_community_from_the_list(String string) {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}
		@Then("Compare the Statuses of the lots in the inventory legend with the actual status {string}")
		public void compare_the_statuses_of_the_lots_in_the_inventory_legend_with_the_actual_status(String string) {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}





}
