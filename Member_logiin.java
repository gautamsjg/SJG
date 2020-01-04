package Step_Definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Member_logiin {
	WebDriver driver;

@Given("^open the app and navigates to the member login page$")
public void open_the_app_and_navigates_to_the_member_login_page() throws Throwable {

	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	driver = new ChromeDriver();
}

@When("^the user enters the valid user details$")
public void the_user_enters_the_valid_user_details() throws Throwable {
	driver.get("http://localhost:8585/do/login");
	 driver.findElement(By.id("cyclosUsername")).sendKeys("Gautam");
	  driver.findElement(By.xpath("//input[@value='1']")).click();
	  driver.findElement(By.xpath("//input[@value='2']")).click();
	  driver.findElement(By.xpath("//input[@value='3']")).click();
	  driver.findElement(By.xpath("//input[@value='4']")).click();
	  driver.findElement(By.xpath("//input[@value='5']")).click();
	  
	  driver.findElement(By.xpath("//input[@value='Submit']")).click();
}

@Then("^system navigates to home page$")
public void system_navigates_to_home_page() throws Throwable {
   
}

}
