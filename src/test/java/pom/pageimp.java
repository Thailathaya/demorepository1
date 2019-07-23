package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class pageimp {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\training_b6b.00.10\\Desktop\\browser and server\\chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		   //pagefac pobj=new pagefac(driver);
		   driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		   driver.manage().window().maximize();
		   
		   pagefac locateElements=PageFactory.initElements(driver, pagefac.class);
		  // pobj.typename(un,"password123");
		   locateElements.typename("lalitha","password123");
		  System.out.println("HOME PAGE TITLE"+driver.getTitle());

  }
}
