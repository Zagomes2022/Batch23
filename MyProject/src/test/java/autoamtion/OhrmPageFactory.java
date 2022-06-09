package autoamtion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OhrmPageFactory {
	
	
public OhrmPageFactory(WebDriver driver) {
		// TODO Auto-generated constructor stub

		PageFactory.initElements(driver, this);
	}
	

	
	@FindBy(xpath="//*[contains(@name,'txtUsername')]")
	private WebElement UserName;
	
	@FindBy(xpath="//*[contains(@name,'txtPassword')]")
	private WebElement Password;
	
	@FindBy(xpath="//*[contains(@class,'button')]")
	private WebElement LogInBtn;
	
	@FindBy(xpath="//*[contains(@class,'panelTrigger')]")
	private WebElement PanelTrigger; 
	
	@FindBy(xpath="//*[contains(@href,'/index.php/auth/logout')]")
	private WebElement LogOut;
	
	
	public WebElement getUserName() {
		return UserName;
	}
	public WebElement getPassword() {
		return Password;
	}
	public WebElement getLogInBtn() {
		return LogInBtn;
	}
	
	public WebElement getTrigger() {
		return PanelTrigger;
	}
	
	public WebElement getLogOut() {
		return LogOut;
	}
	
	
}


