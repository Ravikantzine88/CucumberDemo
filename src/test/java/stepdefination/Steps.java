package stepdefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import dashboardclass.LeavePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageclasses.LoginPage;

public class Steps{
	WebDriver driver;
	LoginPage loginPage;
	LeavePage leavePage;

	@Before
	public void setup() {
		String chromedriver = "webdriver.chrome.driver";
		String driverLocation = "C:\\Users\\kshir\\OneDrive\\Desktop\\cucumber\\CucumberDemo\\chromedriver\\chromedriver.exe";
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
	
	@Given("^click on Leave button$")
    public void click_on_leave_button() throws Throwable {
		   	leavePage =new LeavePage(driver);
		   	Thread.sleep(3000);
		leavePage.getleaveclick().click();
        
	}
	@And("^click on check point$")
    public void click_on_check_point() throws Throwable {
       
       leavePage.getCheckpoint().click();
	}
	
       @And("^click on past employee$")
       public void click_on_past_employee() throws Throwable {
    	   Thread.sleep(3000);
           leavePage.getPast().click();

	}
    
/*	@After
	public void close() {
		driver.close();
	}*/
	
}	

	
