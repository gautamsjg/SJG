package Step_Definition;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Admin_Login_Valid {
	WebDriver driver;
	
	@Given("^open the app and navigates to the login page$")
	public void open_the_app_and_navigates_to_the_login_page() throws Throwable {
		  System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("http://localhost:8585/do/login");
	   
	}

	@When("^the user enters the valid details$")
	public void the_user_enters_the_valid_details() throws Throwable {
		
		  driver.findElement(By.id("cyclosUsername")).sendKeys("admin");
		  driver.findElement(By.xpath("//input[@value='1']")).click();
		  driver.findElement(By.xpath("//input[@value='2']")).click();
		  driver.findElement(By.xpath("//input[@value='3']")).click();
		  driver.findElement(By.xpath("//input[@value='4']")).click();
		  driver.findElement(By.xpath("//input[@value='5']")).click();
		
	
	}

	@Then("^the system navigates to home page$")
	public void the_system_navigates_to_home_page() throws Throwable {
		  driver.findElement(By.xpath("//input[@value='Submit']")).click();
		  driver.findElement(By.xpath("//span[text()='Logout']")).click();
		   Alert alert=driver.switchTo().alert();
		   alert.accept();
		   driver.close();
	
	}
	


}
