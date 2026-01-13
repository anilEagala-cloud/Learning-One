package Introduction;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class scrapclass2 extends baseClass{
	WebDriver driver;

	public void scrapclass() {
		driver = openUrl("www.google.com");
		sendKeys(driver, "//div[@class='a4bIc']", "Selenium");
		List<WebElement> e=findElements(driver, "//ul[@jsname='bw4e9b' and @role='listbox']//div[@class='wM6W7d WggQGd']//span");
		for (int i =0;i<e.size();i++) {
			System.out.println(e.get(i).getText());
		}
	

	}


}
