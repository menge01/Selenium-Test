package testcases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.HasFullPageScreenshot;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestTryIt {
	
	static WebDriver driver;
	
	
	
	public static void captureScreenshot() throws IOException {
		
		
		Date d = new Date();
		String fileName = d.toString().replace(":", "_").replace(" ", "_")+".jpg";

		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File("./screenshot/"+fileName));
		

		
	}
	
	//Ashot
	
	
	public static void fullPageScreenshot() throws IOException {
		
		
		Date d = new Date();
		String fileName = d.toString().replace(":", "_").replace(" ", "_")+".jpg";

		File screenshot = ((HasFullPageScreenshot) driver).getFullPageScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File("./screenshot/fullpage_"+fileName));
		

		
	}
	
	
	

	public static void captureElementScreenshot(WebElement element) throws IOException {
		
		
		Date d = new Date();
		String fileName = d.toString().replace(":", "_").replace(" ", "_")+".jpg";

		File screenshot = ((TakesScreenshot) element).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File("./screenshot/element_"+fileName));
		

		
	}
	

	public static void main(String[] args) throws IOException {

		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_submit_get");
		driver.get("https://flipkart.com");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));


		/*
		driver.switchTo().frame("iframeResult");

		//driver.findElement(By.xpath("/html/body/button")).click();
		
		WebElement elem = driver.findElement(By.id("mySubmit"));
		
		((JavascriptExecutor) driver).executeScript("arguments[0].style.border='3px solid red'", elem);
		
		captureElementScreenshot(elem);
		
		
		driver.switchTo().defaultContent();
		
		
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));

		System.out.println(frames.size());

		for (WebElement frame : frames) {

			System.out.println(frame.getAttribute("id"));
		}
		
		*/
		captureScreenshot();
		
		fullPageScreenshot();
		//driver.getFullPageScreenshotAs(OutputType.FILE);
		
		
	}

}
