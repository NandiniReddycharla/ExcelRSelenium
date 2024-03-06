package SeleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitsDemo {
	public static void main(String[] args) {
		WebDriver  driver=new ChromeDriver();
		
		//waits
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https:opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//Thread.sleep(10000);
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
