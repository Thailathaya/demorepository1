package stefdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pageobjmodel {

	
	WebDriver driver=null;
	By lnc=By.linkText("Log in");
	
	By uname=By.name("userName");
	By pass=By.name("password");
	By login=By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]");
	
	
	public pageobjmodel(WebDriver driver)
	{
		this.driver= driver;
	}
	public void ClickLink()
	{
		 driver.findElement(lnc).click();
	}
	public void typename(String Username) 
	{
		 driver.findElement(uname).sendKeys("lalitha");
	}
	public void typepass(String Password) {
		 driver.findElement(pass).sendKeys("password123");
		}
		public void login() {
		 driver.findElement(login).click();
		}
}
