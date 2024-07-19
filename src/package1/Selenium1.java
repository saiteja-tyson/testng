package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium1 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("mvsteja001@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("saiteja001");
		driver.findElement(By.name("login")).click();
		
		
		
		
	}
	
	}

		


