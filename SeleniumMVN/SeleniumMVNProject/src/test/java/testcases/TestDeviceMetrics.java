package testcases;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v97.emulation.Emulation;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestDeviceMetrics {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		DevTools devTools = ((ChromeDriver) driver).getDevTools();
		devTools.createSession();
		
		//devTools.send(Emulation.setDeviceMetricsOverride(600,1000,50,true,Optional.empty(),Optional.empty(),Optional.empty(),Optional.empty(),Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty()));
		
		Map<String, Object> deviceMetrics = new HashMap<String, Object>()
				{{
					
					put("width",600);
					put("height",1000);
					put("mobile",true);
					put("deviceScaleFactor",50);
					
					
					
				}};
		
		
		
		((ChromeDriver) driver).executeCdpCommand("Emulation.setDeviceMetricsOverride",deviceMetrics);
		
		
		driver.get("https://selenium.dev");

	}

}
