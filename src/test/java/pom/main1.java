package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import stefdef.pageobjmodel;

public class main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_b6b.00.10\\Desktop\\browser and server\\chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		   pagefac pobj=new pagefac(driver);
		   driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		   driver.manage().window().maximize();
		   
		   String un="lalitha";
		  
		   pobj.typename(un,"password123");
		  
		  System.out.println("HOME PAGE TITLE"+driver.getTitle());

	}

}
