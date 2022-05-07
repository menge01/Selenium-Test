package testcases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCheckboxes {

	public static WebDriver driver;

	public static boolean isElementPresent(By by) {

		try {
			driver.findElement(by);
			return true;
		} catch (Throwable t) {

			return false;
		}
	}

	public static void main(String[] args) {
		
		/*
		 * 
		 * 1. Check any random 2 checkboxes
		 * 2. Print names for all checkboxes
		 * 3. Handling WebTable: https://imsports.rediff.com/score/in_asa_1081762.html
		 *    Find Row count and Print all player names
		 *    Find Col count
		 *    Print entire table data
		 * 4. http://qa.way2automation.com/ - Fill the registration form
		 * 5. Check all 8 checkboxes
		 */

		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("http://www.tizag.com/htmlT/htmlcheckboxes.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

		/*
		 * for (int i = 1; i <= 4; i++) {
		 * driver.findElement(By.xpath("//div[4]/input["+i+"]")).click(); }
		 */

		/*
		int i = 1;
		int count=0;

		while (isElementPresent(By.xpath("//div[4]/input[" + i + "]"))) {

			driver.findElement(By.xpath("//div[4]/input[" + i + "]")).click();
			i++;
			count++;

		}

		System.out.println("Total checkboxes are : "+count);
		*/
		
		WebElement section = driver.findElement(By.xpath("/html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]"));
		
		List<WebElement> checkboxes = section.findElements(By.name("sports"));
		
		
		System.out.println(checkboxes.size());
		
		
		for(WebElement checkbox: checkboxes) {
			
			checkbox.click();
		}
		
		
		
	}

}
