package testcases;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestTabsAndPopups {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sso.teachable.com/secure/673/identity/sign_up/with_email");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		System.out.println("-----printing window ids from the first window-----");
		
		Set<String> winids = driver.getWindowHandles(); //1
		Iterator<String> iterator = winids.iterator();
		
		String firstWindow = iterator.next(); //first window id
	
		System.out.println(firstWindow);
		
		
		
		driver.findElement(By.linkText("Privacy Policy")).click();
		
		System.out.println("-----printing window ids from the second window-----");
		
		
		
		winids = driver.getWindowHandles(); //2
		iterator = winids.iterator();
		
		System.out.println(iterator.next()); //1st
		String secondWindow = iterator.next();
		System.out.println(secondWindow);
		
		
		
		driver.switchTo().window(secondWindow);
		
		
		driver.findElement(By.xpath("//*[@id=\"header-sign-up-btn\"]")).click();
		
		driver.findElement(By.id("user_email")).sendKeys("trainer@way2automation.com");
		
		/*
		driver.close(); //2nd
		driver.switchTo().window(firstWindow);
		driver.close();
		*/
		
		driver.quit();
		
		
		
		


	}

}
