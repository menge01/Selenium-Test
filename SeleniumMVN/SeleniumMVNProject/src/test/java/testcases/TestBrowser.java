package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBrowser {

	static String browser = "chrome";
	static WebDriver driver;

	public static void main(String[] args) {

		if (browser.equals("chrome")) {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (browser.equals("firefox")) {

			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		}else if (browser.equals("edge")) {

			WebDriverManager.edgedriver().setup();
		    driver = new EdgeDriver();

		}

		
		driver.get("http://way2automation.com");
		System.out.println(driver.getTitle());
		driver.quit(); //Close the current browser + kill the entire session closing
		//other opened windows or tabs in the same session

	}

}
