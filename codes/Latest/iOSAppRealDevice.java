package rough;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.ios.IOSDriver;

public class iOSAppRealDevice {


	public static void main(String[] args) throws MalformedURLException, InterruptedException
	{
     DesiredCapabilities caps= new DesiredCapabilities();
     caps.setCapability("platformName", "iOS");
     caps.setCapability("udid", "5d50b7a22771f9af43e1dde31cb54ea4ab21794e");
     caps.setCapability("deviceName", "iPhone X");
     caps.setCapability("automationName", "XCUITest");
     //caps.setCapability("bundleId", "net.whatsapp.WhatsApp");
     caps.setCapability("app", "/Users/vivektiwari/Library/Developer/Xcode/DerivedData/WebDriverAgent-ciegwgvxzxdrqthilmrmczmqvrgu/Build/Products/Debug-iphoneos/IntegrationApp.app");
     URL url = new URL("http://127.0.0.1:4723/wd/hub");
     
     AppiumDriver driver = new IOSDriver(url ,caps);
     
     
     
     driver.findElement(MobileBy.AccessibilityId("Alerts")).click();
	 driver.findElement(MobileBy.AccessibilityId("Create GPS access Alert")).click();
		
		
		
	}

	}


//settings-general-about