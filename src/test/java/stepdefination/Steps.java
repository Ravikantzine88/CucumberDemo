package stepdefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import leaveclass.LeavePage;
import pageclasses.LoginPage;

public class Steps {
	WebDriver driver;
	LoginPage loginPage;
	LeavePage leave;
	
	

	@Before
	public void setup() {
		String chromedriver = "webdriver.chrome.driver";
		String driverLocation = "C:\\Users\\Amol\\Desktop\\dkamol\\CucumberDemo\\chromeDriver\\chromedriver.exe";
		// Initialize the webdriver and open the browser

		System.setProperty(chromedriver, driverLocation);
		driver = new ChromeDriver();
//		WebDriverManager.chromedriver().setup();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");

	}

	@Given("^opne chrome browser homepage url$")
	public void opne_chrome_browser_homepage_url() throws Throwable {
		System.out.println("validate url");

	}

	@When("^enter username and password$")
	public void enter_username_and_password() throws Throwable {

		loginPage = new LoginPage(driver);
		Thread.sleep(3000);
		loginPage.getUserId().sendKeys("Admin");
		Thread.sleep(3000);
		loginPage.getPassWord().sendKeys("admin123");

	}

	@Then("^click on submit button$")
	public void click_on_submit_button() throws Throwable {
		Thread.sleep(3000);
		loginPage.getClickButton().click();

	}
	 @Given("^click on leave button$")
	    public void click_on_leave_button() throws Throwable {
	      Thread.sleep(3000);
	      leave=new LeavePage(driver);
	      leave.getLeaveclick().click();
	        }
	 @And("^click on check point$")
	    public void click_on_check_point() throws Throwable {
	    	 Thread.sleep(3000);
	    	 leave.getCheckpoint().click();
	 }
	    
	 @And("^click on past Empolyee$")
	    public void click_on_past_empolyee() throws Throwable {
	        Thread.sleep(3000);
	        leave.getPast().click();
	    }
	
	    
	 
	 
/*	@After
	public void close() throws Throwable {
		Thread.sleep(5000);
		// Close the browser
		driver.close();
	}*/
}
