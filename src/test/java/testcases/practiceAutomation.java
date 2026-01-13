package testcases;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Introduction.baseClass;
import Introduction.locators;
import Introduction.testData;

public class practiceAutomation extends baseClass{
	
	WebDriver driver;
	testData td=new testData();
	locators l= new locators();
	
	@BeforeSuite
	public void setup() {
		driver=openUrl(td.websiteyoutube());
	}
	@Test
	public void empty() {
		Click(driver, l.navString());
//		sendKeys(driver, l.usernameboxY(), td.usernameY());
//		sendKeys(driver, l.passwordBoxY(), td.passwordY());
//		Click(driver, l.submitY());
//		
	}
	
	
	
	
	
	
	
	
	/*@Test(groups = "formFields", dataProvider = "form")
	
	public void formFields(String name,String email) {
		Click(driver, l.formfields());
		sendKeys(driver, l.nameXpath(),name);
		sendKeys(driver,l.passwordXpath() ,td.passTestdata());
		selectAllCheckboxes(driver, l.checkBoxesXpath());						
		clickingAllradiobuttons(driver, l.radioButtonXpath());
		dropdownClicking(driver, l.dropdownXpath(), td.dropdowntestdata());
		gettextdata(driver, l.cssSuedoXpath());
		sendKeys(driver, l.emailXpath(), email);
		sendKeys(driver, l.messXpath(), td.messageTestdata());
		jsClick(driver, l.buttonXpath());
	
		
	}
	@DataProvider(name="form")
	public Object[][] getdata() {
		return new Object[][] {
			{"anil","anil@gmail.com"},
			{"anjani","anjani@gmail.com"}
		};
	}*/
	
	/*@Test
	public void popUpPage() {
		Click(driver, l.popUPbutton());
		jsClickAlertAccept(driver, l.alertButton());
		//Click(driver, l.confirmPopButton());
		jsClickAlertAccept(driver, l.confirmPopButton());
		jsClickAlertCancel(driver, l.confirmPopButton());
		jsClickAlertPrompt(driver, l.promptButton(), td.promptMessage());
		//jsClickCancelPrompt(driver, l.promptButton());
		Click(driver, l.returnHome());	
	}
	@Test
	public void sliderPage() {
		jsClickxpath(driver, l.sliderpageXpath());
		returnToHomepage(driver, l.slideXpath(), td.sliderLength());
	}*/
	/*@Test
	public void scrapclass() {
		driver = openUrl("https://www.google.com/");
		sendKeys(driver, "//textarea[@name='q']\r\n", "Selenium");
		List<WebElement> e=findElements(driver, "//div[@jsname='erkvQe']//ul//li//div[@role='presentation']");
		for (int i =0;i<e.size();i++) {
			if(e.get(i).getText().equals("selenium")){
				e.get(i).click();
				break;
			}
			
			
		}
	}
	
	@Test
	public void tablesAutomation() {
		jsClickxpath(driver, l.tablepageXpath());
		//tables(driver, l.rowsXpath());
		//getColumnDataByName(driver, l.rowsXpath(), "Price");
		//tableLeastNumber(driver, l.rowsXpath(), "Price");
		tablePlaying(driver, l.rowsXpath(), "Price", "Item");
	}
	*/
	/*
	@AfterSuite
	public void close() {
		driver.quit();
	}*/
		
	}