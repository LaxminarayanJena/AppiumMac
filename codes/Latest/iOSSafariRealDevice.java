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

public class iOSSafariRealDevice {

	public static 	IOSDriver driver;
	public static void main(String[] args) throws MalformedURLException, InterruptedException
	{
DesiredCapabilities capabilities = new DesiredCapabilities();

		
		
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone X");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12.4.1");		
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
		capabilities.setCapability(MobileCapabilityType.UDID, "5d50b7a22771f9af43e1dde31cb54ea4ab21794e");
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


//settings-general-about

/*
https://github.com/budhash/SafariLauncher
brew install ios-webkit-debug-proxy
ios_webkit_debug_proxy -c 5d50b7a22771f9af43e1dde31cb54ea4ab21794e:27753
ios_webkit_debug_proxy -u 5d50b7a22771f9af43e1dde31cb54ea4ab21794e:27753



*/