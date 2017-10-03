package Demo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class geckoDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//System.setProperty("webdriver.gecko.driver", "D:\\\\ToolsQA\\trunk\\Library\\drivers\\geckodriver.exe");
		System.setProperty("webdriver.gecko.driver", "c:\\geckodriver.exe");
	
		//System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "GikoDriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		
		//driver.findElement(By.id("fname")).sendKeys("Nagesh");
		driver.findElement(By.id("sb_ifc0")).sendKeys("TEST");
		
		//eb.sendKeys("test");
		

	}

	
	
}
