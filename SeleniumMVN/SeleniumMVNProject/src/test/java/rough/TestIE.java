package rough;

import java.util.Map;

import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestIE {

	public static void main(String[] args) {


		WebDriverManager.iedriver().useLocalVersionsPropertiesFirst().setup();

		InternetExplorerOptions edgeIe11Options=new InternetExplorerOptions();

		Map<String, Object> ops = (Map<String, Object>) edgeIe11Options.getCapability("se:ieOptions");

		    ops.put("ie.edgechromium", true);

		    ops.put("ie.edgepath", "C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe");     // Edge Browser directory path



		    edgeIe11Options.introduceFlakinessByIgnoringSecurityDomains();

		    edgeIe11Options.ignoreZoomSettings();

		    edgeIe11Options.enablePersistentHovering();

		    edgeIe11Options.takeFullPageScreenshot();

		    edgeIe11Options.disableNativeEvents();

		    edgeIe11Options.requireWindowFocus();

		    edgeIe11Options.destructivelyEnsureCleanSession();



		    edgeIe11Options.setCapability("ignoreProtectedModeSettings", true);

		    edgeIe11Options.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.IGNORE);



		    WebDriver driver;

		    driver = new InternetExplorerDriver(edgeIe11Options);

		    driver.get("https://github.com/");

	}

}
