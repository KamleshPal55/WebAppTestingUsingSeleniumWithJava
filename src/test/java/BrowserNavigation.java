import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserNavigation {
	public static WebDriver driver;

	public static void setup() {
		//driver = new ChromeDriver();
		//driver = new FirefoxDriver();
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	}

	public static void test() throws InterruptedException {
		driver.get("https://www.google.com/");  //https://www.google.com/
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(4);
		driver.get("https://www.yahoo.com/");  //https://www.yahoo.com/
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(4);
		driver.navigate().back();
		System.out.println(driver.getTitle()); //google.com
		Thread.sleep(4);
		driver.navigate().forward();
		System.out.println(driver.getTitle()); //https://www.yahoo.com/
		Thread.sleep(4);
		driver.navigate().to("https://www.selenium.dev/");
		Thread.sleep(4);
		driver.navigate().refresh();
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
