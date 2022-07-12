package pageclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	@FindBy(xpath="//input[@id='txtUsername']")
	private WebElement userId;
	@FindBy(xpath="//input[@id='txtPassword']")
	private WebElement passWord;
	
	@FindBy(xpath="//input[@type='submit']")//--> driver.findElement:partial initilization: 
	private WebElement clickButton;						//with method execution: full initization of web element takes place

	 public WebElement getUserId() {
		return userId;
	}

	public void setUserId(WebElement userId) {
		this.userId = userId;
	}

	public WebElement getPassWord() {
		return passWord;
	}

	public void setPassWord(WebElement passWord) {
		this.passWord = passWord;
	}

	public WebElement getClickButton() {
		return clickButton;
	}

	public void setClickButton(WebElement clickButton) {
		this.clickButton = clickButton;
	}

	public LoginPage(WebDriver driver) {
		 
	        this.driver = driver;
	 
	        // This initElements method will create all WebElements
	        PageFactory.initElements(driver, this);
	    }
	 
	 
	 
	 
	
}
