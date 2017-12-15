package SeleniumGrid.Grid;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridTest {
	
	static WebDriver driver;
	static String nodeURL = "http://10.192.76.196:5555/wd/hub";

	public static void main(String[] args) {

		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setBrowserName("firefox");
		//capabilities.setPlatform(Platform.WINDOWS);
		
		try {
			driver = new RemoteWebDriver(new URL(nodeURL), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
			driver.navigate().to("http://www.amazon.in");
			driver.findElement(By.linkText("Today's Deals")).click();;
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

}
