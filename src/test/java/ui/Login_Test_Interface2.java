package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_Test_Interface2 {
	
	public static String browser ="Edge"; //External configuration
	
    public static WebDriver driver;
    
	public static void main(String[] args) throws InterruptedException  {  
		
		if (browser.equals("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			                                            
			
		}else if (browser.equals("Chrome")) {
				WebDriverManager.chromedriver().setup();
				 driver=new ChromeDriver();
		}

		
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(4000);
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		

		

	}

}
