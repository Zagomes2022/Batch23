package autoamtion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrm {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:.\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[contains(@name,'txtUsername')]")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[contains(@name,'txtPassword')]")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[contains(@class,'button')]")).click();
		driver.findElement(By.xpath("//*[contains(@class,'panelTrigger')]")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[contains(@href,'/index.php/auth/logout')]")).click();
		driver.close();
		
		//driver.findElement(By.xpath("//*[contains(@class,'panelContainer')]"));
		
		
		
		
	} ;
	
	
	

}
