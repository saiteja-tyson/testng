package package1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fb_CreateNew_Account {
	WebDriver driver;

	public static void main(String[] args) {
		Fb_CreateNew_Account f1 = new Fb_CreateNew_Account();
		f1.setup();
		f1.createAccount();

	}

	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

	}

	public void createAccount() {
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("sai");
		driver.findElement(By.name("lastname")).sendKeys("malleda");
      	driver.findElement(By.name("reg_email__")).sendKeys("mvsteja123@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("mvsteja123@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("saiteja123");
		new Select(driver.findElement(By.id("day"))).selectByValue("16");
		new Select(driver.findElement(By.id("month"))).selectByValue("12");
		new Select(driver.findElement(By.id("year"))).selectByValue("1999");
		driver.findElement(By.xpath("//input[@value='2']")).click();
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		

	}

}
