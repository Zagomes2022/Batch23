package autoamtion;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.com.BaseConfiguration;

import utility.com.PageFactoryAuto;

public class SignInSignOut {
	
	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver","C:.\\Driver\\chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
		
		  WebDriver driver = new ChromeDriver();
		  
		  //driver.get("https://automationpractice.com/");
		  driver.get(BaseConfiguration.getConValue("URL2"));
		  driver.manage().window().maximize();
		  
		  PageFactoryAuto obj = new PageFactoryAuto(driver);
		  //driver.findElement(By.className("login")).click();
		  //driver.findElement(By.xpath("//*[contains(@class,'login')]" ));
		  obj.getSignInBtn().click();
		  //driver.findElement(By.id("email")).sendKeys("sobhanrstech@gmail.com");
		  //driver.findElement(By.xpath("//*[@id= 'email']")).sendKeys("sobhanrstech@gmail.com");
		  obj.getUserName().sendKeys(BaseConfiguration.getConValue("Username2"));
		  //driver.findElement(By.name("passwd")).sendKeys("sabiha2019");
		  //driver.findElement(By.xpath("//*[contains(@name,'passwd')]")).sendKeys("sabiha2019");
		  obj.getPassword().sendKeys(BaseConfiguration.getConValue("Password2"));
		  //driver.findElement(By.xpath("//*[@class='icon-lock left']")).click();
		  //driver.findElement(By.xpath("(//*[@class='sf-with-ul'])[4]")).click();
		  obj.getSubmitBtn().click();
		  //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  //JavascriptExecutor js = (JavascriptExecutor) driver;
		  //js.executeScript("window,scrollBy(0,1000)");
		  obj.getSignOutBtn().click();
		  //driver.findElement(By.xpath("logout")).click();
		  driver.close();
		  
		  
		
		
		
		
		
	
		
		
		
		
		
	}
	

}
