package ExcelReadWrite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	
	public static void main(String[] args) throws Exception {
		
		//Creating Object of the ExcelReader Class

		 ExcelReader ERead= new ExcelReader();   

		 //Storing the Data retuned from the ExcelReader method in to a String variable   
		  String ExcelData=ERead.ReadExcelData(); 
		 
		  System.setProperty("webdriver.chrome.driver", "E:\\AutomationAll\\chromedriver_win32\\chromedriver.exe");
		  
		  WebDriver driver = new ChromeDriver();  
		  driver.get("https://www.flipkart.com/");   
		  
		  //Using the ExcelData String variable in SendKeys    
		  driver.findElement(By.name("q")).sendKeys(ExcelData);    
		  
	} 
		  
	} 
	 