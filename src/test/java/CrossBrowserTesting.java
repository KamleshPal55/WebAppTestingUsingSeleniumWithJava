import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class CrossBrowserTesting {
	public static WebDriver driver;

	public static void setup(String str, String url) {
		switch(str.toUpperCase()) {
			case "CHROME":
				driver = new ChromeDriver();
				break;
			case "FIREFOX":
				driver = new FirefoxDriver();
				break;
			case "EDGE":
				driver = new EdgeDriver();
				break;
			case "SAFARI":
				driver = new SafariDriver();
				break;
			default:
				driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	}

	public static void printTitle() {
		driver.get("https://www.selenium.dev/");
		String title = driver.getTitle();
		String webSiteURL = driver.getCurrentUrl();
		System.out.println("Title is: " + title);
		System.out.println("URL is: " + webSiteURL);
	}

	public static void tearDown() {
		driver.quit();
	}

	public static void main(String[] args) {
		String browser = "edge";
		String siteUrl = "https://www.selenium.dev/";
		setup(browser, siteUrl);
		printTitle();
		tearDown();
	}

}
