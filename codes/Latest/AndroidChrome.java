package rough;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class AndroidChrome {
	public static AppiumDriver<MobileElement> driver;
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
        DesiredCapabilities cap = new DesiredCapabilities();
		
        cap.setCapability("chromedriverExecutable","/Users/Eclipse/CommonFramework/src/test/resources/executables/chromedriverandroidsimulator");	
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		
		cap.setCapability("noReset", true);
		URL url = new URL("http://127.0.0.1:4723/wd/hub");					
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(url, cap);
		
		 driver.get("http://google.com");
		 driver.findElement(By.xpath("//input[@name='q']")).sendKeys("appiummm");
		 Thread.sleep(6000);
		 driver.quit();
		
	

	}

}


/*    
/usr/bin/killall -KILL node
source .bash_profile
appium --address 127.0.0.1 --port 4723

*/