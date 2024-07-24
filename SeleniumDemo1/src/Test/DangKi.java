package Test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DangKi {
	WebDriver driver = new ChromeDriver();
	
	public void LaunchBrowser() {
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Tai lieu hoc tap\\kiem thu phan mem\\selenium webdriver\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://localhost:8080/BTL_QLSV_JavaWeb/login");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
	}
	public void DangKi1() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.id("sign-up-btn")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div/div[1]/div/form[2]/input")).click();
	}
	public void DangKi2() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.id("sign-up-btn")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div/div[1]/div/form[2]/div[2]/input")).sendKeys("minh");
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div/div[1]/div/form[2]/input")).click();
		if (!isValidEmailAddress("minh")) {
            System.out.println("Sai định dạng email!");
		}
	}
	private static boolean isValidEmailAddress(String email) {
        String regex = "^[\\w!#$%&'*+/=?^_`{|}~-]+(?:\\.[\\w!#$%&'*+/=?^_`{|}~-]+)*@(?:[\\w-]+\\.)+[\\w-]{2,}$";
        return email.matches(regex);
    }
	public void DangKi3() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div/div[1]/div/form[2]/div[1]/input")).sendKeys("nhat_minh");
		driver.findElement(By.xpath("/html/body/div/div[1]/div/form[2]/div[2]/input")).sendKeys("minh@gmail.com");
		driver.findElement(By.xpath("/html/body/div/div[1]/div/form[2]/div[3]/input")).sendKeys("password123");
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div/div[1]/div/form[2]/input")).click();

	}
	public static void main(String[] args) throws InterruptedException {
		DangKi obj = new DangKi();
		obj.LaunchBrowser();
		obj.DangKi1();
		obj.DangKi2();
		obj.DangKi3();
	}

}
