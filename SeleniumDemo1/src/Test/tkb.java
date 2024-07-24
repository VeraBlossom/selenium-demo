package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class tkb {
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
	public void TKB1() throws InterruptedException {
		//nhấn vào menu lịch
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/ul/li[8]/a")).click();
		Thread.sleep(2000);
		//nhấn vào mục thời khóa biểu
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/ul/li[8]/ul/li[1]/a")).click();
		//chọn 1 ô trong thời khóa biểu
		driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div[2]/div[1]/div/div/div/div[2]/div/table/tbody/tr/td/div/div/div[1]/div[1]/table/tbody/tr/td[2]")).click();
		//điền thông tin thẻ
		driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div[2]/div[3]/div/div/div[2]/form/div/div[1]/div/input")).sendKeys("study");
		driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div[2]/div[3]/div/div/div[2]/form/div/div[2]/div/select")).click();//chọn màu
		driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div[2]/div[3]/div/div/div[2]/form/div/div[2]/div/select/option[2]")).click();//chọn màu
		//chọn Thêm
		driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div[2]/div[3]/div/div/div[3]/button[2]")).click();
	}
	public void TKB2() throws InterruptedException {
		Thread.sleep(5000);
		//kéo thẻ sang một ô thời khóa biểu mới
		Actions act = new Actions(driver);
		WebElement src = driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div[2]/div[1]/div/div/div/div[2]/div/table/tbody/tr/td/div/div/div[1]/div[2]/table/tbody/tr/td[2]/a"));
		WebElement des = driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div[2]/div[1]/div/div/div/div[2]/div/table/tbody/tr/td/div/div/div[1]/div[1]/table/tbody/tr/td[3]"));
		act.clickAndHold(src)
		.moveToElement(des)
		.release()
		.build()
		.perform();
	}
	public void TKB3() throws InterruptedException {
		//thay đổi thông tin thẻ được chọn
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div[2]/div[1]/div/div/div/div[2]/div/table/tbody/tr/td/div/div/div[1]/div[2]/table/tbody/tr/td[3]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div[2]/div[3]/div/div/div[2]/form/div/input")).clear();
		driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div[2]/div[3]/div/div/div[2]/form/div/input")).sendKeys("Kiểm thử");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div[2]/div[3]/div/div/div[2]/form/div/span/button")).click();
	}
	public void TKB4() throws InterruptedException {
		//xóa thẻ được chọn
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div[2]/div[1]/div/div/div/div[2]/div/table/tbody/tr/td/div/div/div[1]/div[2]/table/tbody/tr/td[3]/a")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div[2]/div[3]/div/div/div[3]/button[3]")).click();
	}
	public void TKB5() throws InterruptedException {
		Actions act = new Actions(driver);
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div[2]/div[2]/div/div/div/a")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div[2]/div[4]/div/div/div[2]/form/div/div[1]/input")).sendKeys("CNDPT");
		driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div[2]/div[4]/div/div/div[2]/form/div/div[2]/div/button")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div[2]/div[4]/div/div/div[2]/form/div/div[2]/div/div/div/ul/li[1]/a")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div[2]/div[4]/div/div/div[3]/button[2]")).click();
		Thread.sleep(3000);
		WebElement src = driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div[2]/div[2]/div/div/div/div[1]/div[4]"));
		WebElement des = driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div[2]/div[1]/div/div/div/div[2]/div/table/tbody/tr/td/div/div/div[1]/div[1]/table/tbody/tr/td[3]"));
		act.clickAndHold(src)
		.moveToElement(des)
		.release()
		.build()
		.perform();
	}
	public static void main(String[] args) throws InterruptedException {
		tkb obj = new tkb();
		obj.LaunchBrowser();
		obj.DangNhap();
		obj.TKB1();
		obj.TKB2();
		obj.TKB3();
		obj.TKB4();
		obj.TKB5();
	}

}
