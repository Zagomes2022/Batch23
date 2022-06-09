package autoamtion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class OhrmFinalLogIn {
	
	//public static void main(String[] args) 
	
	public static void OhrmLogIn() {
		
        //System.setProperty("webdriver.chrome.driver", "C:.\\Driver\\chromedriver.exe");
			
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get(OhrmConfiguration.getCofigValue("URL"));
		driver.manage().window().maximize();
		OhrmPageFactory obj = new OhrmPageFactory(driver);
		obj.getUserName().sendKeys(OhrmConfiguration.getCofigValue("Username"));
		obj.getPassword().sendKeys(OhrmConfiguration.getCofigValue("Password"));
		obj.getLogInBtn().click();
		obj.getTrigger().click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		obj.getLogOut().click();
		driver.close(); 	 	
	}
	

}
