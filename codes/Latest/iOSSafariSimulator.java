package rough;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class iOSSafariSimulator {

	public static 	IOSDriver driver;
	public static void main(String[] args) throws MalformedURLException, InterruptedException
	{
DesiredCapabilities capabilities = new DesiredCapabilities();

		
		
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 11");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13.4.1");		
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
		capabilities.setCapability(MobileCapabilityType.UDID, "618BA444-1DD4-4D15-B206-ACB8C82D6592");
		capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "safari");
		
		capabilities.setCapability("app", "io.appium.SafariLauncher");
		capabilities.setCapability("safariAllowPopups", false);
		capabilities.setCapability("safariIgnoreFraudWarning", true);
	
		
		driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
		Set<String> contextNames= driver.getContextHandles();
		for(String contextName :contextNames)
		{
			System.out.println(contextName);
		if(contextName.contains("WEBVIEW"))
		{
			driver.context(contextName);
		}
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://google.com");
		
		driver.findElement(By.name("q")).sendKeys("Hello Appium");
		
		Thread.sleep(3000);
		
		driver.quit();
		
	}

	}






