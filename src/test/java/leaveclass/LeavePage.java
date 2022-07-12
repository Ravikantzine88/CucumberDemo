package leaveclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeavePage {
	WebDriver driver;
	@FindBy(xpath="//*[text()='Leave']")
	private WebElement leaveclick;
	
	@FindBy(xpath="//*[@type='checkbox']")
	private WebElement checkpoint;
	
	@FindBy(xpath="//*[@id='leaveList_cmbWithTerminated']")
	private WebElement past;

	
	public WebElement getPast() {
		return past;
	}

	public void setPast(WebElement past) {
		this.past = past;
	}

	public WebElement getLeaveclick() {
		return leaveclick;
	}

	public void setLeaveclick(WebElement leaveclick) {
		this.leaveclick = leaveclick;
	}

	public WebElement getCheckpoint() {
		return checkpoint;
	}

	public void setCheckpoint(WebElement checkpoint) {
		this.checkpoint = checkpoint;
	}
	public LeavePage(WebDriver driver) {
		this.driver = driver;
		//This initElement method will create all webElement
		PageFactory.initElements(driver, this);
	}

}
