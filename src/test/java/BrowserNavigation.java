import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigation {
	public static WebDriver driver;

	public static void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	}

	public static void test() throws InterruptedException {
		driver.get("https://www.google.com/");  //https://www.google.com/
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(4);
		driver.get("https://www.yahoo.com/");  //https://www.amazon.com/
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(4);
		driver.navigate().back();
		System.out.println(driver.getTitle()); //google.com
		Thread.sleep(4);
		driver.navigate().forward(); //amazon.com
		System.out.println(driver.getTitle()); //
	}
	public static void tearDown() {
		driver.quit();
	}

	public static void main(String[] args) throws InterruptedException {
		setup();
		test();
		tearDown();
	}



}
