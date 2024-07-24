package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script {
	WebDriver driver;
	
	public void LaunchBrowser() {
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Tai lieu hoc tap\\kiem thu phan mem\\selenium webdriver\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://youtube.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
	}
	
	public void searchVideo() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.name("search_query")).sendKeys("VeraBlossom");
		driver.findElement(By.id("search-icon-legacy")).click();
	}
	public void navigate() throws InterruptedException {
		Thread.sleep(2000);
		driver.navigate().to("https://www.facebook.com/");
		System.out.println("The new title is: " + driver.getTitle());
		Thread.sleep(3000);
		driver.navigate().back();
	}

	public static void main(String[] args) throws InterruptedException {
		Script obj = new Script();
		obj.LaunchBrowser();
		obj.searchVideo();
		obj.navigate();
	}

}
