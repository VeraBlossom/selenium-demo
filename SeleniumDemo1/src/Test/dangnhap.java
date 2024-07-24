package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dangnhap {
	WebDriver driver;
	
	public void LaunchBrowser() {
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Tai lieu hoc tap\\kiem thu phan mem\\selenium webdriver\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://localhost:8080/BTL_QLSV_JavaWeb/login");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
	}
	public void DangNhap1() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div/div[1]/div/form[1]/input")).click();
		// Tìm các trường nhập tài khoản và mật khẩu
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));
		String username = usernameField.getAttribute("value");
        String password = passwordField.getAttribute("value");

        if (username.isEmpty() || password.isEmpty()) {
            System.out.println("Vui lòng nhập tài khoản và mật khẩu!");
        }
	}
	public void DangNhap2() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys("thanh_hang");
		driver.findElement(By.id("password")).sendKeys("123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/div[1]/div/form[1]/input")).click();
		String currentUrl = driver.getCurrentUrl(); // Lấy URL hiện tại
        if (currentUrl.contains("login")) { // Kiểm tra xem URL có chứa "login" hay không (vẫn đang ở trang đăng nhập)
            System.out.println("Sai tài khoản hoặc mật khẩu!");
        } else {
            System.out.println("Đăng nhập thành công!"); // (Thực hiện các hành động sau khi đăng nhập thành công)
        }
	}
	public void DangNhap3() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys("thanh_hang");
		driver.findElement(By.id("password")).sendKeys("password123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/div[1]/div/form[1]/input")).click();
		String currentUrl = driver.getCurrentUrl(); // Lấy URL hiện tại
        if (currentUrl.contains("login")) { // Kiểm tra xem URL có chứa "login" hay không (vẫn đang ở trang đăng nhập)
            System.out.println("Sai tài khoản hoặc mật khẩu!");
        } else {
            System.out.println("Đăng nhập thành công!"); // (Thực hiện các hành động sau khi đăng nhập thành công)
        }
	}
	public static void main(String[] args) throws InterruptedException {
		dangnhap obj = new dangnhap();
		obj.LaunchBrowser();
		obj.DangNhap1();
		obj.DangNhap2();
		obj.DangNhap3();
	}

}
