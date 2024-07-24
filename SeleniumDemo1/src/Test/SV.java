package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SV {
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

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		SV obj = new SV();
		obj.LaunchBrowser();
		obj.DangNhap();
	}

}
