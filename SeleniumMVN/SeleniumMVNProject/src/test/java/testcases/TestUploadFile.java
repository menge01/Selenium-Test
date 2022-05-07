package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestUploadFile {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.way2automation.com/way2auto_jquery/registration.php#load_box");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	

		driver.findElement(By.xpath("//*[@id=\"register_form\"]/fieldset[9]/input")).sendKeys("C:\\Users\\way2automation\\Downloads\\IMG-1387.jpg");
		
	}

}
