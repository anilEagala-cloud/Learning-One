package Introduction;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class baseClass {
	public WebDriver openUrl(String Url) {
		WebDriver driver = new ChromeDriver();
		driver.get(Url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		return driver;
	}
	
	public WebElement findElement(WebDriver driver, String x_path) {
		WebElement e= driver.findElement(By.xpath(x_path));
		return e;
	}
	
	public List<WebElement> findElements(WebDriver driver, String x_path){
		List<WebElement> e=driver.findElements(By.xpath(x_path));
		return e;
	}
	
	public void Click(WebDriver driver,String x_path) {
		WebElement e=findElement(driver, x_path);
		e.click();
	}
	public void jsClickxpath(WebDriver driver,String Xpath) {
		WebElement element =findElement(driver, Xpath);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
		
	}
	
	public void jsClick(WebDriver driver,WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}
	
	public void sendKeys(WebDriver driver,String xpath,String TestData) {
		WebElement e=findElement(driver, xpath);
		e.sendKeys(TestData);
	}
	
	public void selectAllCheckboxes(WebDriver driver,String x_path) {
		List<WebElement> e=findElements(driver, x_path);
		for(WebElement f:e) {
			jsClick(driver,f);                                                             //not abled to use click method
		}
	}
		
	public void clickingAllradiobuttons(WebDriver driver,String xpath) {
		List<WebElement> e=findElements(driver, xpath);
		for(WebElement f:e) {
			jsClick(driver,f);                                                             //not abled to use click method
		}
	}
	
	public void dropdownClicking(WebDriver driver, String xpath,String Testdata) {
		WebElement e=findElement(driver, xpath);
		Select f=new Select(e);
		f.selectByContainsVisibleText(Testdata);
	}
	
	public String gettextdata(WebDriver driver,String xpath) {
		WebElement e=findElement(driver, xpath);
		return e.getText();
		
		
	}
	
	public void jsClickAlertAccept(WebDriver driver,String Xpath) {
		WebElement element =findElement(driver, Xpath);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
		Alert alert =driver.switchTo().alert();
		alert.accept();
		
	}
	public void jsClickAlertCancel(WebDriver driver,String Xpath) {
		WebElement element =findElement(driver, Xpath);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
		Alert alert =driver.switchTo().alert();
		alert.dismiss();
		
	}
	
	public void jsClickAlertPrompt(WebDriver driver,String Xpath,String input) {
		WebElement element =findElement(driver, Xpath);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
		Alert alert =driver.switchTo().alert();
		alert.sendKeys(input);
		alert.accept();
		
	}
	
	public void jsClickCancelPrompt(WebDriver driver,String Xpath) {
		WebElement element =findElement(driver, Xpath);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
		Alert alert =driver.switchTo().alert();
		alert.dismiss();
		
	}
	
	public void returnToHomepage(WebDriver driver,String Xpath,String sliderlength) {
		WebElement slider= findElement(driver, Xpath);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(
		    "arguments[0].value = arguments[1]; arguments[0].dispatchEvent(new Event('change'));",
		    slider,
		    sliderlength
		);

	}
	
	
	public void tables(WebDriver driver,String Xpath) {
		List<WebElement> rows=findElements(driver, Xpath+"//tr");
		List<WebElement> coln=findElements(driver, Xpath+"//tr[1]//td");
		for (int r=1;r<rows.size()+1;r++) {
			for(int c=1;c<coln.size()+1;c++) {
				System.out.println(findElement(driver, Xpath+"//tr["+r+"]//td["+c+"]").getText());
			}
			
		}
	}
	
	public int headerIndex(WebDriver driver, String xpath, String colname) {
		List<WebElement> coln=findElements(driver, xpath+"//tr[1]//td");
		
		int colnIndex=0;
		for(int c=1;c<=coln.size();c++) {
			String ColnHeader=gettextdata(driver, xpath+"//tr[1]//td["+c+"]");
			if(colname.equals(ColnHeader)) {
				
				colnIndex=c;
				break;
			}
			
		}
		return colnIndex;
		
	}
	
	
	public List<String> getColumnDataByName(WebDriver driver, String xpath, String colname) {
		int colnIndex =headerIndex(driver, xpath, colname);
		List<String> colData=new ArrayList<String>();
		List<WebElement> rows=findElements(driver, xpath+"//tr");
		for(int r=2;r<=rows.size();r++) {
			String data=gettextdata(driver, xpath+"//tr["+r+"]//td["+colnIndex+"]");
			colData.add(data);
		}
		return colData;
	}
	
	public double tableLeastNumber(WebDriver driver, String xpath,String headerName) {
		List<String> colData= getColumnDataByName(driver, xpath, headerName);
		List<Double> priceData=new ArrayList<>();
		for(String coldataele:colData) {
			String x=coldataele.substring(1);
			double price=Double.parseDouble(x);
			priceData.add(price);
		}
		priceData.sort(null);
		return priceData.get(0);		
		
	}
	
	
	public void tablePlaying(WebDriver driver, String xpath, String headerName, String displayHeader) {
		double leastNumber= tableLeastNumber(driver, xpath, headerName);
		String Least="$"+leastNumber;
		int rowIndex=0;
		int colnIndex=headerIndex(driver, xpath, headerName);
		List<WebElement> rows=findElements(driver, xpath+"//tr");
		for(int r=1;r<=rows.size();r++) {
			String Data=gettextdata(driver, xpath+"//tr["+r+"]//td["+colnIndex+"]");
			if(Least.equals(Data)) {
				rowIndex=r;
				break;
			}
		}
		int colunIndex=headerIndex(driver, xpath, displayHeader);
		System.out.println(gettextdata(driver, xpath+"//tr["+rowIndex+"]//td["+colunIndex+"]"));
	}
	
	
	
	
	
	
	
		
		
		
		
		
	}


