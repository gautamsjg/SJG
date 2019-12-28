import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class program14_thread_wait {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/IBM/Desktop/demo.html");
		driver.findElement(By.id("textbox1")).sendKeys("g1");
		Thread.sleep(7000);
		
		driver.findElement(By.id("textbox2")).sendKeys("g2");
		
	}

}
