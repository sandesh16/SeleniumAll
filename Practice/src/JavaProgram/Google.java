package JavaProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","F:\\Softwares\\Selenium\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
      //  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    //    driver.get("https://luca.smarttuition.com/Account/Login?ReturnUrl=%2f");
        driver.get("https://www.google.co.in");
        //driver.close();
	}

}
