package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class pagefac {
	WebDriver driver=null;
	@FindBy(linkText="Log in") WebElement login;
	@FindBy(how=How.NAME,using="userName") WebElement username;
	@FindBy(how=How.NAME,using="password") WebElement pass;
	@FindBy(how=How.XPATH,using="/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]") WebElement log;
	
	public  pagefac(WebDriver driver){
		this.driver= driver;
	}
	
	public void typename(String Username,String Password) 
	{
		login.click();
		 username.sendKeys(Username);
		 pass.sendKeys(Password);
		 log.click();
		 
	}
	
}
