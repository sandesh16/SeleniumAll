import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Background_color_Check {

	public static void main(String[] args) {
		 String baseUrl = "http://demo.guru99.com/selenium/newtours/";
		 System.setProperty("webdriver.chrome.driver", "E:\\AutomationAll\\chromedriver_win32\\chromedriver.exe");
	                WebDriver driver = new ChromeDriver();

	                driver.get(baseUrl);           
	                WebElement link_Home = driver.findElement(By.linkText("Home"));
	                WebElement td_Home = driver
	                        .findElement(By
	                        .xpath("//html/body/div"
	                        + "/table/tbody/tr/td"
	                        + "/table/tbody/tr/td"
	                        + "/table/tbody/tr/td"
	                        + "/table/tbody/tr"));    
	                 
	                Actions builder = new Actions(driver);
	                org.openqa.selenium.interactions.Action mouseOverHome = builder.moveToElement(link_Home).build();
	                 
	                String bgColor = td_Home.getCssValue("background-color");
	                System.out.println("Before hover: " + bgColor);        
	                mouseOverHome.perform();        
	                bgColor = td_Home.getCssValue("background-color");
	                System.out.println("After hover: " + bgColor);
	                driver.close();
	        }
	}


