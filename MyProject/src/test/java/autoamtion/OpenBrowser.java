package autoamtion;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:.\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/");
		driver.manage().window().maximize();
		driver.findElement(By.className("login")).click();
		driver.findElement(By.id("email")).sendKeys("sobhanrstech@gmail.com");
		driver.findElement(By.name("passwd")).sendKeys("sabiha2019");
		driver.findElement(By.xpath("//*[@class='icon-lock left']")).click();
		driver.findElement(By.xpath("(//*[@class='sf-with-ul'])[4]")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		
		
		
		
		
		//driver.findElement(By.className("logout")).click();
		//driver.findElement(By.className("icon-lock left")).click();
		//driver.get("https://amazon.com");
		//driver.close();
		
		
		
		
		
	}
	

}
