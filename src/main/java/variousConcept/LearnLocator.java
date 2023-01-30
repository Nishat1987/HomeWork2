package variousConcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LearnLocator {

	WebDriver driver;

	@BeforeClass

	public void init() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nisha\\eclipse-cucumber\\HomeWork2\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://techfios.com/billing/?ng=admin/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Test
	public void testLocator() {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("demo@techfios.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("abc123");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		driver.findElement(By.xpath("//span[text()='Bank & Cash']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'New Account')]")).click();
		driver.findElement(By.xpath("//input[@id='account']")).sendKeys("Nishat Sultana");
		driver.findElement(By.xpath("//input[@id='description']")).sendKeys("Selenium");
		driver.findElement(By.xpath("//input[@name='balance']")).sendKeys("20000");
		driver.findElement(By.xpath("//input[@name='account_number']")).sendKeys("abcdefgh");
		driver.findElement(By.xpath("//input[@name='contact_person']")).sendKeys("Nabiha");
		driver.findElement(By.xpath("//input[@name='contact_phone']")).sendKeys("1234567");
		driver.findElement(By.xpath("//input[@name='ib_url']")).sendKeys("nmb@trrg");
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	}
}
