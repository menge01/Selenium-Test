package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestWebElements {

	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://gmail.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		
		
		String title = driver.getTitle();
		title.length();
		
		
		driver.getTitle().length();
		
		driver.manage().window().maximize();
		/*
		 * Options opt = driver.manage(); Window win = opt.window(); win.maximize();
		 */
		
		
		
		//driver.manage().window().maximize();
		
		
		
		
		/*WebElement username = driver.findElement(By.id("identifierId"));
		username.sendKeys("trainer@way2automation.com");
		
		WebElement btn = driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span"));
		btn.click();
	*/
		
		
		driver.findElement(By.id("identifierId")).sendKeys("trainer@way2automation.com");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
		//Thread.sleep(3000);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"))).sendKeys("asdfdsf");
		
		
		//driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("asdffds");
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/span")).click();
		
		System.out.println(driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div[2]/div[2]/span")).getText());
		
		driver.quit();
	}

}
