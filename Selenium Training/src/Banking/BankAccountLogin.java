package Banking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BankAccountLogin {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.bankofamerica.com/");
		Thread.sleep(5000);
		//driver.switchTo().frame("logonbox");
		driver.findElement(By.id("onlineId1")).sendKeys("yashreddy");
		driver.findElement(By.id("passcode1")).sendKeys("143255");
		Thread.sleep(1000);
		
		driver.findElement(By.id("signIn")).click();
		
	}

}
