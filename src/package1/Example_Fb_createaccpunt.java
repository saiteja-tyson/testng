package package1;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example_Fb_createaccpunt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("sai");
		driver.findElement(By.name("lastname")).sendKeys("teja");
		driver.findElement(By.name("reg_email__")).sendKeys("mvsteja001@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("mvsteja001@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("mvsteja123@");
		new Select(driver.findElement(By.id("day"))).selectByIndex(15);
		new Select(driver.findElement(By.id("month"))).deselectByValue("1999");

	}

}
