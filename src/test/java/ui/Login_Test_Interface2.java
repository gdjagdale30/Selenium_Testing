package ui;

import org.openqa.selenium.By;
//import static org.openqa.selenium.support.locators.RelativeLocator.with;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.support.locators.RelativeLocator;

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

		 driver.get("http://softwaretestingplace.blogspot.com/2015/10/sample-web-page-to-test.html");
		    //Locate the web element 'Your Name' text field
		    WebElement yourNameLabel = driver.findElement(By.xpath("//input[@id='form-field-name']"));
		 
//		    //Locate the web element 'Your Email' text field
//		    WebElement yourEmailLabel = driver.findElement(By.xpath("//input[@id='form-field-email']"));
//		 
//		    //Locate 'Your Email' text field which is to the left of 'Your Name' text field and enter the text
//		    WebElement txtEmailLabel = driver.findElement(withTagName("input").toLeftOf(yourNameLabel));
//		    txtEmailLabel.sendKeys("email@email.com");
//		 
//		    //Locate 'Your Name' text field which is to the right of 'Your Email' text field and enter the text
//		    WebElement txtNameLabel = driver.findElement(withTagName("input").toRightOf(yourEmailLabel));
//		    txtNameLabel.sendKeys("YourName");
//		 
//		    //Locate the web element 'Selenium Tutorial' and open it
//		    WebElement seleniumTutorial = driver.findElement(withTagName("img").below(subject));
//		    seleniumTutorial.click();
//		 
//		    //Locate the web element 'Java Tutorial' and open it
//		    WebElement javaTutorial = driver.findElement(withTagName("img").above(subject));
//		    javaTutorial.click();
		    //Close the browser
		    driver.close();
	}

}
