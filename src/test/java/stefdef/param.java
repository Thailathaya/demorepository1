package stefdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class param {
	WebDriver driver=null;

	@Given("user open the application")
	public void user_open_the_application() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_b6b.00.10\\Desktop\\browser and server\\chromedriver.exe");
		   driver=new ChromeDriver();
		   driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		   driver.manage().window().maximize();
	}

	@When("user click on signin button")
	public void user_click_on_signin_button() {
	   driver.findElement(By.linkText("SignIn")).click();
	   System.out.println("HOME PAGE TITLE"+driver.getTitle());
	}

	@When("user enters {string} and {string}")
	public void user_enters_and(String username, String password) {
		 driver.findElement(By.name("userName")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		 driver.findElement(By.name("Login")).click();
		 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 driver.findElement(By.name("Logout")).click();
		 driver.close();
	}

	@Then("message displayed as login successful")
	public void message_displayed_as_login_successful() {
	   
	}

}
