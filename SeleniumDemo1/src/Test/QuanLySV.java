package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuanLySV {
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
	public void ThemSV1() throws InterruptedException {
		//bỏ trống thông tin sinh viên
		Thread.sleep(2000);
		//nhấn vào menu sinh viên
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/ul/li[3]/a")).click();
		//nhấn vào nút thêm mới
		driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div[2]/div[2]/div/div[1]/div/div[1]/a")).click();
		Thread.sleep(2000);
		//nhấn vào nút thêm
		driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div[2]/div[2]/div/div[1]/div/div[2]/div/div/div[2]/form/div[2]/button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div[2]/div[2]/div/div[1]/div/div[2]/div/div/div[2]/form/div[2]/button[1]")).click();
		
	}
	public void ThemSV2() throws InterruptedException {
		//nhập thông tin sinh viên mới
		Thread.sleep(2000);
		//nhân nút thêm mới
		driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div[2]/div[2]/div/div[1]/div/div[1]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("studentCode")).sendKeys("SV024");
		driver.findElement(By.name("studentName")).sendKeys("nguyễn hữu mạnh");
		driver.findElement(By.name("studentHomeTown")).sendKeys("hải phòng");
		driver.findElement(By.name("studentDob")).sendKeys("13");
		driver.findElement(By.name("studentDob")).sendKeys("02");
		driver.findElement(By.name("studentDob")).sendKeys("2003");
		driver.findElement(By.name("studentCCCD")).sendKeys("1");
		driver.findElement(By.name("studentNational")).sendKeys("việt nam");
		driver.findElement(By.name("studentReligion")).sendKeys("không");
		driver.findElement(By.name("studentPhone")).sendKeys("456");
		Thread.sleep(2000);
		//nhấn nút Thêm
		driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div[2]/div[2]/div/div[1]/div/div[2]/div/div/div[2]/form/div[2]/button[2]")).click();

		//đi đến cuối danh sách
		driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div[2]/div[2]/div/div[1]/div/div[3]/div/div/div[4]/span/a[3]")).click();
	}
	public void SuaSV() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div[2]/div[2]/div/div[1]/div/div[3]/div/div/table/tbody/tr[1]/td[10]/a[1]")).click();
		//vào giao diện sửa thông tin sinh viên
		Thread.sleep(2000);
		driver.findElement(By.name("studentCCCD")).clear();
		driver.findElement(By.name("studentCCCD")).sendKeys("2");
		//nhấn nút lưu
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div[2]/div/div/div/div/div/div/div/form/div[9]/button[2]")).click();
		//kéo đến trang cuối để hiển thị sinh viên được sửa
		driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div[2]/div[2]/div/div[1]/div/div[3]/div/div/div[4]/span/a[3]")).click();
	}
	public void XoaSV() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div[2]/div[2]/div/div[1]/div/div[3]/div/div/table/tbody/tr[1]/td[10]/a[2]")).click();
		Thread.sleep(5000);
		System.out.println("Alert message: " + driver.switchTo().alert().getText());
		Thread.sleep(2000);
	    driver.switchTo().alert().accept();
	  //kéo đến trang cuối để hiển thị sinh viên bị xóa
	    driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div[2]/div[2]/div/div[1]/div/div[3]/div/div/div[4]/span/a[3]")).click();
	}

	public static void main(String[] args) throws InterruptedException {
		QuanLySV obj = new QuanLySV();
		obj.LaunchBrowser();
		obj.DangNhap();
		obj.ThemSV1();
		obj.ThemSV2();
		obj.SuaSV();
		obj.XoaSV();
	}

}
