import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class program_keyboard_events {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/?gclid=EAIaIQobChMIs97o6Kit5gIV1AorCh153wLJEAAYASAAEgJSlPD_BwE&ef_id=EAIaIQobChMIs97o6Kit5gIV1AorCh153wLJEAAYASAAEgJSlPD_BwE:G:s&s_kwcid=AL!739!3!326503979691!e!!g!!flipkart&semcmpid=sem_8024046704_brand_eta_goog");
		/*driver.findElement(By.id("textbox1")).sendKeys("my name is gautam");
		driver.findElement(By.id("textbox1")).sendKeys(Keys.CONTROL,"a");
		driver.findElement(By.id("textbox1")).sendKeys(Keys.CONTROL,"c");
		driver.findElement(By.id("textbox2")).sendKeys(Keys.CONTROL,"v");
		String s = driver.findElement(By.id("textbox1")).getAttribute("value");
				driver.findElement(By.id("textbox2")).sendKeys(s);*/
		
	}

}
