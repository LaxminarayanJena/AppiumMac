import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class TestIOSNativeElementsOnSimulator {

public static IOSDriver driver;
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 6s Plus");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12.4");		
		capabilities.setCapability(MobileCapabilityType.APP, "/Users/laxminarayanjena/Library/Developer/Xcode/DerivedData/AppiumTest-cvoptkirkrmehpepgterluzwnweg/Build/Products/Debug-iphonesimulator/AppiumTest.app");
		
/*
 * inspector session in appium gui
 * 
		{
			  "platformName": "iOS",
			  "platformVersion": "12.4",
			  "deviceName": "iPhone 8",
			  "automationName": "XCUITest",
			  "app": "/Users/laxminarayanjena/Library/Developer/Xcode/DerivedData/AppiumTest-cvoptkirkrmehpepgterluzwnweg/Build/Products/Debug-iphonesimulator/AppiumTest.app"
			}
	
		*/
		
		
		driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		
	
		driver.findElement(By.xpath("//XCUIElementTypeTextField[@name='emailTextField']")).sendKeys("aa@gmail.com");
		driver.findElement(By.xpath("//XCUIElementTypeSecureTextField[@name='passwordTextField']")).sendKeys("sssSSS");
		driver.findElement(By.id("loginButton")).click();
		
		


		
		Thread.sleep(3000);
		//driver.quit();

	}
}
