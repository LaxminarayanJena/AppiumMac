package rough;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class AndroidApp {
	public static AndroidDriver<MobileElement> driver;
	public static void main(String[] args) throws MalformedURLException {
		
		File app = new File(System.getProperty("user.dir") + "/src/test/resources/apks/naukri.apk");
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "Android");
		capabilities.setCapability("app", app.getAbsolutePath());
        //capabilities.setCapability("appPackage", "com.indianbusyatranew.indianbusyatranew");
		
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
	
		driver.findElement(By.xpath("//*[@text='" + "LOGIN" + "']")).click();
		driver.findElement(By.xpath("//*[@text='" + "Forgot Password" + "']")).click();

	}

}


/*    
/usr/bin/killall -KILL node
source .bash_profile
appium --address 127.0.0.1 --port 4723

*/