package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KQHT {
	WebDriver driver;
	
	public void LaunchBrowser() {
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Tai lieu hoc tap\\kiem thu phan mem\\selenium webdriver\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://localhost:8080/BTL_QLSV_JavaWeb/login");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
	}
	
	public void DangNhap() throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys("thanh_hang");
		driver.findElement(By.id("password")).sendKeys("password123");
		driver.findElement(By.xpath("/html/body/div/div[1]/div/form[1]/input")).click();
	}
	
	public void KQHT1() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/ul/li[7]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div[2]/div[2]/div/div/div/div[3]/div/form/div/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div[2]/div[2]/div/div/div/div[3]/div/form/div/div/div/ul/li[2]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div[2]/div[2]/div/div/div/div[3]/div/form/button")).click();
	}
	public void KQHT2() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/ul/li[7]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div[2]/div[2]/div/div/div/div[3]/div/div/div[1]/label/div/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div[2]/div[2]/div/div/div/div[3]/div/div/div[1]/label/div/div/div/ul/li[3]/a")).click();
	}
	public void KQHT3() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div[2]/div[2]/div/div/div/div[3]/div/div/div[2]/label/input")).sendKeys("A");
	}
	public static void main(String[] args) throws InterruptedException {
		KQHT obj = new KQHT();
		obj.LaunchBrowser();
		obj.DangNhap();
		obj.KQHT1();
		obj.KQHT2();
		obj.KQHT3();
	}

}
