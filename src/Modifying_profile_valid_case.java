//This test script shows the modification of profile with valid details

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Modifying_profile_valid_case {
	WebDriver driver;
  @Test
  public void ModifyingProfile() {
	  driver.findElement(By.id("cyclosUsername")).sendKeys("admin");
	  driver.findElement(By.xpath("//input[@value='1']")).click();
	  driver.findElement(By.xpath("//input[@value='2']")).click();
	  driver.findElement(By.xpath("//input[@value='3']")).click();
	  driver.findElement(By.xpath("//input[@value='4']")).click();
	  driver.findElement(By.xpath("//input[@value='5']")).click();
	  driver.findElement(By.xpath("//input[@value='Submit']")).click();
	  driver.findElement(By.xpath("//span[text()='Personal']")).click();
	  driver.findElement(By.xpath("//span[text()='Profile']")).click();
	  driver.findElement(By.xpath("//input[@value='Change']")).click();
	  driver.findElement(By.name("admin(name)")).clear();
	  driver.findElement(By.name("admin(name)")).sendKeys("manzoor");
	  driver.findElement(By.name("admin(email)")).clear();
	  driver.findElement(By.name("admin(email)")).sendKeys("gautam@gmail.com");
	  
	  //driver.findElement(By.xpath("//input[@value='admin1223455qwwghugugiguiguyfgygihikhufgyfgikhihcgfgvubikhlk']")).sendKeys("12345abc");
	 /* driver.findElement(By.xpath("//input[@value='123@gmail.com']")).sendKeys("1234@gmail.com");*/
	 driver.findElement(By.xpath("//input[@value='Submit']")).click();
	/*Alert alert = driver.switchTo().alert();
	  alert.accept();*/
	   Alert alert=driver.switchTo().alert();
		String expres="Profile modified";
		String actualres= alert.getText();
		System.out.println(actualres);
		assertEquals(actualres, expres);
		//assertTrue(actualres.contains(expres));
	
  }


  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://localhost:8585/do/login");

  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
