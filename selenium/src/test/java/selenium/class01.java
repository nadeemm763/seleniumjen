package selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class class01 {

	WebDriver driver ;
	@BeforeTest
	public void setup() {
//		open edge 
	    WebDriverManager.edgedriver().setup();
	    driver = new EdgeDriver() ;
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	@Test
	public void tc1() {
//	    open web
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    
//	    fill out the correct details
	    driver.findElement(By.name("username")).sendKeys("Admin");
	    driver.findElement(By.name("password")).sendKeys("admin123");
	    
//	    submit
	    driver.findElement(By.cssSelector("button[type='submit']")).click();
	    
	    driver.quit() ;
	}
}
