import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommands {

	public static void main(String[] args) {
		// Create a new instance of the Chrome driver
		System.setProperty("webdriver.chrome.driver", "E:\\AutomationAll\\chromedriver_win32\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		 
				// Open ToolsQA web site
				String appUrl = "http://www.DemoQA.com";
				driver.get(appUrl);
		 
				// Click on Registration link
				driver.findElement(By.xpath(".//*[@id='menu-item-374']/a")).click();
		 
				// Go back to Home Page
				driver.navigate().back();
		 
				// Go forward to Registration page
				driver.navigate().forward();
		 
				// Go back to Home page
				driver.navigate().to(appUrl);
				
				// Refresh browser
				driver.navigate().refresh();
		 
				// Close browser
				driver.close();
			}

	}


