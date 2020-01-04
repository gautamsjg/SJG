package Step_Definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class register {
	WebDriver driver;

	@Given("^open the app, click on submit button and navigates to signup page$")
	public void open_the_app_click_on_submit_button_and_navigates_to_signup_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
			driver = new ChromeDriver();
			 driver.get(" http://localhost:8585/");
			 driver.findElement(By.xpath("//input[@value='Submit'and@type='button']")).click();
	}

	@When("^the user enters valid details for signup$")
	public void the_user_enters_valid_details_for_signup() throws Throwable {
	
		 driver.findElement(By.name("member(user).username")).sendKeys("Gautam");
		  driver.findElement(By.name("member(name)")).sendKeys("Supriya G");
		  driver.findElement(By.name("member(email)")).sendKeys("supriyaane@gmail.com");
		  driver.findElement(By.name("member(customValues).value")).sendKeys("13/05/1997");
		  driver.findElement(By.id("_radio_2_0")).click();
		  driver.findElement(By.xpath("//input[@fieldname='address']")).sendKeys("WoodStock Ambience");
		  driver.findElement(By.xpath("//input[@fieldname='postalCode']")).sendKeys("987654");
		  driver.findElement(By.xpath("//input[@fieldname='city']")).sendKeys("Bangalore");
		  Select data = new Select(driver.findElement(By.id("custom_field_select_6")));
		  data.selectByVisibleText("Example area");
		  driver.findElement(By.xpath("//input[@fieldname='phone']")).sendKeys("8899890905");
		  driver.findElement(By.xpath("//input[@fieldname='mobilePhone']")).sendKeys("8899093442");
		  driver.findElement(By.xpath("//input[@fieldname='fax']")).sendKeys("123456789");
		  driver.findElement(By.xpath("//input[@fieldname='url']")).sendKeys("www.google.com");
		  driver.findElement(By.name("member(user).password")).sendKeys("12345");
		  driver.findElement(By.name("confirmPassword")).sendKeys("12345");
		 Thread.sleep(15000);
		  driver.findElement(By.id("saveButton")).click();
	}

	@Then("^the system displays success message$")
	public void the_system_displays_success_message() throws Throwable {
	  
	}
}
