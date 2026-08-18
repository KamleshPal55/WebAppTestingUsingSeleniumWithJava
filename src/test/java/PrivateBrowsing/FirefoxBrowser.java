package PrivateBrowsing;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FirefoxBrowser {
	public static void main(String[] args) throws InterruptedException {
		FirefoxOptions options = new FirefoxOptions();
		options.addArguments("--private");

		WebDriver driver = new FirefoxDriver(options);
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Thread.sleep(4000);
		driver.quit();

	}

}
