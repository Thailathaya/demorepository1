package casestudy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class firstcase {
	WebDriver driver=null;
	@Given("the signup page is opend")
	public void the_signup_page_is_opend() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_b6b.00.10\\Desktop\\browser and server\\chromedriver.exe");
		   driver=new ChromeDriver();
		   driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		   driver.manage().window().maximize();
			 driver.findElement(By.linkText("SignUp")).click();
	}

	@When("user enters anitha as username")
	public void user_enters_anitha_as_username() {
		driver.findElement(By.name("userName")).sendKeys("anitha");
	}

	@When("user enters thaila as firstname")
	public void user_enters_thaila_as_firstname() {
		driver.findElement(By.name("firstName")).sendKeys("thaila");
	}

	@When("user enters thaya as lastname")
	public void user_enters_thaya_as_lastname() {
		driver.findElement(By.name("lastName")).sendKeys("thaya");
		driver.findElement(By.id("password")).sendKeys("password123");
	}
	
	@When("user enters password{int} aspassword")
	public void user_enters_password123_as_password(Integer int1) {
		driver.findElement(By.id("password")).sendKeys("password123");
	}
	@When("user enters password{int} as confirmpassword")
	public void user_enters_password123_as_confirmpassword(Integer int1) {
		driver.findElement(By.id("pass_confirmation")).sendKeys("password123");
	}

	@When("user select female as gender")
	public void user_select_female_as_gender() {
		 driver.findElement(By.xpath("//input[@id='gender' and @value='Female']")).click();
	}

	@When("user enters thailathaya@gmail.com as email")
	public void user_enters_thailathaya_gmail_com_as_email() {
		driver.findElement(By.id("emailAddress")).sendKeys("thailathaya@gmail.com");
	}

	@When("user enters {int} as mobilenumber")
	public void user_enters_as_mobilenumber(Integer int1) {
		driver.findElement(By.id("mobileNumber")).sendKeys("+91 8940107407");
	}

	@When("user select {int}\\/{int}\\/{int} as dob")
	public void user_select_as_dob(Integer int1, Integer int2, Integer int3) {
		driver.findElement(By.name("dob")).sendKeys("12/05/1998");
	}

	@When("user enters chennai as address")
	public void user_enters_chennai_as_address() {
		 driver.findElement(By.id("address")).sendKeys("chennai");
	}

	@When("user select What is your Birth Place as SecurityQuestion")
	public void user_select_What_is_your_Birth_Place_as_SecurityQuestion() {
	
		 Select select=new Select(driver.findElement(By.name("securityQuestion")));
		  select.selectByIndex(2);
		
	}

	@When("user enters tanjore as answer")
	public void user_enters_thanjore_as_answer() {
		 driver.findElement(By.id("answer")).sendKeys("tanjore");
	}

	@When("user clicks on  register")
	public void user_clicks_on_register() {
		driver.findElement(By.name("Submit")).click();
	}

	@Then("message will displayes user  registered successfully")
	public void message_will_displayes_user_registered_successfully() {
		System.out.println("HOME PAGE TITLE"+driver.getTitle());
	}
}
