package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_test {

	public static void main(String[] args) throws InterruptedException {
		//Dependancy added in POM file
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(4000);
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		Thread.sleep(4000);
        driver.close();
		

	}

}
