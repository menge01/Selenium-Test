package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestDropdown {
	
	public static WebDriver driver;
	
	
	public static boolean isElementPresent(By by) {
		
		try {
		driver.findElement(by);
		return true;
		}catch(Throwable t) {
			
			return false;
		}
	}
	/*
	static By PROPERTY_SELECT_DROP_DOWN = By.xpath("//*[@id=\"searchLanguage\"]");
			
	
	public static boolean selectElementByIndex(By locator, int index, long waitTime) {
	    try {
	        WebElement element = new WebDriverWait(driver, Duration.ofSeconds(waitTime))
	                .until(ExpectedConditions.visibilityOfElementLocated(locator));
	        Select select = new Select(element);
	        select.selectByIndex(index);
	        return true;
	    } catch (Exception e) {
	        e.printStackTrace();
	        return false;
	    }
	}
	 
	   
	public static boolean Selectproperty() {
	 
	        if(selectElementByIndex(PROPERTY_SELECT_DROP_DOWN,7,10))
	        {
	            return true;
	        }
	        else System.out.println("Unable to Select Property");
	        return false;
	    }     
	*/
	
	
	

	public static void main(String[] args) {

		/*
		 * English - US
		 * English - UK
		 * 
		 * 
		 */

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		

		WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"searchLanguage\"]"));
		//driver.findElement(By.xpath("//*[@id=\"searchLanguage\"]")).sendKeys("Eesti");
		Select select = new Select(dropdown);
		//select.selectByVisibleText("Eesti");
		select.selectByIndex(7);
		
	//	System.out.println(Selectproperty());
		
		System.out.println(isElementPresent(By.xpath("//*[@id=\"search-form3243\"]/fieldset/button")));
		
		/*
		List<WebElement> values = dropdown.findElements(By.tagName("option"));
		
		
		for(int i=0; i<values.size(); i++) {
			
			System.out.println(values.get(i).getText()+"---value is :"+values.get(i).getAttribute("value"));
			
		}
		
		
		System.out.println(values.size());
		
		System.out.println("----Total links are ----");
		
		
		WebElement section = driver.findElement(By.xpath("//*[@id=\"www-wikipedia-org\"]/div[7]/div[3]"));
	
		
		List<WebElement> links = section.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		
		for(WebElement link: links) {
			
			System.out.println(link.getText()+"----- URL IS---"+link.getAttribute("href"));
		}
		
		
		
		
		//section.findElements(By.id("abc")).get(1).click();
		 * 
		 * 
		 */

	}

}
