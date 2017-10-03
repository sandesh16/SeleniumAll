package Demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class XpathPractice {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "c:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://letskodeit.teachable.com/p/practice");
		
		//driver.findElement(By.id("fname")).sendKeys("Nagesh");
		
		//WebElement radio = driver.findElement(By.xpath(".//input[@id='bmwradio']"));
		//radio.click();
		
		WebElement radio = driver.findElement(By.xpath("//input[@id='benzradio' and @type='radio']]"));
		radio.click();
		//relative path //input[@id='benzradio' and @type='radio']
		Select dropDown = new Select(driver.findElement(By.xpath(".//*[@id='carselect']")));
		Thread.sleep(1000);
		
		dropDown.selectByVisibleText("Benz");
		
		Thread.sleep(1000);
		driver.quit();
	}

}
