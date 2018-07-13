package prac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmailgh {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","E:\\New folder\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		driver.get("http://www.gmail.com");
		//driver.findElement(By.xpath("/html/body/nav/div/a[2]")).click();
		driver.findElement(By.id("identifierId")).sendKeys("chittiammal21@gmail.com");
		driver.findElement(By.xpath("//*[@id='identifierNext']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("shaibaba");
		driver.findElement(By.id("passwordNext")).click();
		Thread.sleep(2000);
		driver.quit();
	}
	}


