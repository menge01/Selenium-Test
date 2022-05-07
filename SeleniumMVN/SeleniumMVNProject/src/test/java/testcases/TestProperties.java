package testcases;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestProperties {
	
	
	public static WebDriver driver;
	public static Properties OR = new Properties();
	public static Properties config = new Properties();
	public static FileInputStream fis;
	

	public static void main(String[] args) throws IOException {


		
		
		fis = new FileInputStream(".\\src\\test\\resources\\properties\\OR.properties");
		OR.load(fis);
		
		
		
		
		fis = new FileInputStream(".\\src\\test\\resources\\properties\\Config.properties");
		config.load(fis);
		
		//driver.get(config.getProperty("testsiteurl"));
		System.out.println(config.getProperty("testsiteurl"));
		
		
		//driver.findElement(By.id(OR.getProperty("username_id"))).sendKeys(excel);
		System.out.println(OR.getProperty("username_id"));
		
		
		if(config.getProperty("browser").equals("chrome")) {
			
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		}else if(config.getProperty("browser").equals("firefox")) {
			
			
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			
		}
		
		
		driver.get(config.getProperty("testsiteurl"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Integer.parseInt(config.getProperty("implicit.wait"))));
		
		driver.findElement(By.id(OR.getProperty("username_id"))).sendKeys("trainer@way2automation.com");
		driver.findElement(By.xpath(OR.getProperty("signBtn_xpath"))).click();
		driver.findElement(By.cssSelector(OR.getProperty("password_css"))).click();

		driver.quit();
	}

}
