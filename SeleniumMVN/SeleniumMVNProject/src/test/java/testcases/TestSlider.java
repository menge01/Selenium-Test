package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestSlider {

	public static void main(String[] args) throws InterruptedException {


		

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/resources/demos/slider/default.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement mainSlider = driver.findElement(By.xpath("//*[@id=\"slider\"]"));
		
		int width = mainSlider.getSize().width / 2;
		
		WebElement slider = driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
	
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		action.dragAndDropBy(slider, width, 0).perform();
		

	}

}
