package package1;


import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Shadi_Application {
	WebDriver driver;
	Actions action;

	public static void main(String[] args) {
		Shadi_Application q1= new Shadi_Application();

		q1.setup();
		q1.login_application();
		//q1.quit();
	}
	public void setup() {
		driver=new ChromeDriver();
		driver.get("https://www.shaadi.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		action= new Actions(driver);
	}
	public void login_application() {
		driver.findElement(By.xpath("//label[text()=\"I'm looking for a\"]/following-sibling::div//div//div[contains(@class,'is-selected')]")).click();
		driver.findElement(By.xpath("//div[text()='Man']")).click();
		driver.findElement(By.xpath("//label[text()='aged']/following-sibling::div//div//div//div//div[contains(@class,'is-selected')]")).click();
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		driver.findElement(By.xpath("//div[text()='22']")).click();
		
		driver.findElement(By.xpath("//div[contains(@class,'ageUpto')]/div/div/div")).click();
		driver.findElement(By.xpath("//div[text()='30']")).click();	
		driver.findElement(By.xpath("//label[text()='of religion']/following-sibling::div//div//div[contains(text(),'Select')]")).click();
		driver.findElement(By.xpath("//div[text()='Hindu']")).click();
		driver.findElement(By.xpath("//label[text()='and mother tongue']/following-sibling::div//div//div[contains(@class,'is-selected')]")).click();
		
		driver.findElement(By.xpath("//div[text()='More']/following-sibling::div[text()='Telugu']")).click();
		driver.findElement(By.xpath("//button[text()=\"Let's Begin\"]")).click();
		driver.findElement(By.xpath("//span[text()='My Friend']")).click();
		driver.findElement(By.xpath("//div[text()='Gender']")).click();
		driver.findElement(By.xpath("//span[text()='Male']")).click();
		driver.findElement(By.xpath("//label[text()='First name']/following-sibling::div/input")).sendKeys("sai");
		driver.findElement(By.xpath("//label[text()='Last name']/following-sibling::div/input")).sendKeys("teja");
		driver.findElement(By.xpath("//input[@placeholder='DD']")).sendKeys("10");
		driver.findElement(By.xpath("//input[@placeholder='MM']")).sendKeys("4");
		driver.findElement(By.xpath("//input[@placeholder='YYYY']")).sendKeys("2000");
		driver.findElement(By.xpath("//div[text()='Date of birth']/../../following-sibling::div/button/span/span/p")).click();
		driver.findElement(By.xpath("//div[text()='His religion']/../../following-sibling::div/button/span/span/p[contains(text(),'Continue')]")).click();
		
			
	}
	public void quit() {
		driver.quit();
	}

}
