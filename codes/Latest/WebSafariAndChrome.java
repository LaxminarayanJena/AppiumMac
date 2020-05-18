package rough;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

public class WebSafariAndChrome {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "/Users/Eclipse/CommonFramework/src/test/resources/executables/chromedriver");
		//WebDriver driver = new ChromeDriver();
		
		
		System.setProperty("webdriver.safari.driver", "/usr/bin/safaridriver");
		WebDriver driver = new SafariDriver();  
	  
      
		driver.get("https://www.wikipedia.org/");
		WebElement dropdown = driver.findElement(By.xpath(".//*[@id='searchLanguage']"));
		Select select = new Select(dropdown);
		select.selectByValue("hi");
		Thread.sleep(3000);
		select.selectByVisibleText("Deutsch");
		// select.getOptions()

		List<WebElement> values = driver.findElements(By.tagName("option"));
		System.out.println("no of drop down values are: " + values.size());
		System.out.println(values.get(0));
		// [[ChromeDriver: chrome on XP (fa68d6dc7f2ef5512c92f417a77295c3)] ->
		// tag name: option]

		System.out.println(values.get(1));
		System.out.println(values.get(0).getAttribute("lang"));
		// ar

		for (int i = 1; i < values.size(); i++) {
			System.out.println(values.get(i).getText());
		}
		driver.quit();
	}

}

//safaridriver --enable