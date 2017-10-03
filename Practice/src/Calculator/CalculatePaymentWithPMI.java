package Calculator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import org.openqa.selenium.support.ui.Select;



public class CalculatePaymentWithPMI {


	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\AutomationAll\\chromedriver_win32\\chromedriver.exe");
	    
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.mortgagecalculator.org/");
		
		List<WebElement> ele = driver.findElements(By.tagName("input"));  // Finding all the elements of Input type
		
		for (int i=2; i<=9; i++){                            // Applying the loop to only the input values needed to calculate the installment 
		//System.out.println(i +"  "+ele.get(i).getAttribute("name"));	  // Just to verify and print the input values in Eclipse console 
		ele.get(i).clear();                                              
		ele.get(i).sendKeys("15");
		Thread.sleep(3000);

		}
		WebElement month = driver.findElement(By.name("param[start_month]"));  // Find the month element which contains the drop down values.
		Select oSelect = new Select(month);
		oSelect.selectByIndex(0);                                         // Select the element at zero Index, I wanted to chose Jan month.
		Thread.sleep(2000);
		
		WebElement year = driver.findElement(By.name("param[start_year]"));   // Find the year element which contains the drop down values.
		Select oSelect1 = new Select(year);
		oSelect1.selectByVisibleText("2016");                                // Select the element by drop down text values, I wanted to chose 2016 year.
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[name='cal']")).click();    // Find the Calculate Button and click on it
		 System.out.println("Payment by PMI is:"+ driver.findElement(By.xpath(".//*[@id='calc']/form/section/section[2]/div/div/div[1]/div/div/div[3]/div[2]/div[2]/div[1]/div[1]/h3")).getText());
		
	}

}
