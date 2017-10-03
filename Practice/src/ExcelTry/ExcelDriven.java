package ExcelTry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelDriven 
{

	public static void main(String[] args) throws Exception 
	{
		
		ExcelReader ERead=new ExcelReader();
		
		String ExcelData=ERead.ReadExcelData();
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "E:\\AutomationAll\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		String baseURL =ERead.GetBaseURL(1);
		
		
		driver.get(baseURL);
		
		Thread.sleep(2000);		
		//driver.findElement(By.xpath("//button[@class='_2AKmmA_29Ydh8']")).click();
		driver.findElement(By.name("q")).sendKeys(ExcelData);
		Thread.sleep(1000);
		driver.findElement(By.id("container")).click();
	}

}