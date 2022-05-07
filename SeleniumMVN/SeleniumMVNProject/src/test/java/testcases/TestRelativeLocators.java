package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestRelativeLocators {

	public static void main(String[] args) {


		/*
		 * 
		 * Above
		 * Below
		 * rightOf
		 * leftOf
		 * near
		 * 
		 * 
		 */
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://way2automation.com/way2auto_jquery/index.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		
		WebElement above = driver.findElement(RelativeLocator.with(By.tagName("input")).above(By.tagName("select")));
		above.sendKeys("trainer@way2automation.com");
		
		
		WebElement below = driver.findElement(RelativeLocator.with(By.tagName("input")).below(By.tagName("select")));
		below.sendKeys("Delhi");
		
		
		WebElement rightOf = driver.findElement(RelativeLocator.with(By.xpath("//*[@id=\"load_form\"]/fieldset[7]/input")).toRightOf(By.tagName("label")));
		rightOf.sendKeys("asdfsfd");
		
		
		WebElement near = driver.findElement(RelativeLocator.with(By.partialLinkText("THE")).near(By.linkText("Signin")));
		near.click();
		

	}

}
