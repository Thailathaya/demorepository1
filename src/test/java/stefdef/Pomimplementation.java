package stefdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pomimplementation {
	 
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_b6b.00.10\\Desktop\\browser and server\\chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		   pageobjmodel pobj=new pageobjmodel(driver);
		   driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		   driver.manage().window().maximize();
		   pobj.ClickLink();
		   String un="lalitha";
		  
		   pobj.typename(un);
		  pobj.typepass("password123");
		  pobj.login();
		  System.out.println("HOME PAGE TITLE"+driver.getTitle());
	}

}
