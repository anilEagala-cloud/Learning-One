package Introduction;

public class locators {
	
	//FormFieldsXpaths
	private String formField="//a[@href='https://practice-automation.com/form-fields/']";
	private String nameXpath="//input[@id='name-input']";
	private String passwordXpath="//input[@type='password']";
	private String checkboxesxpath="//input[@name='fav_drink']";
	private String radiobuttonxpath="//input[@type='radio']";
	private String dropdownXpath="//select[@id='automation']";
	private String cssSuedoXpath="//li[normalize-space()='Selenium']";
	private String emailxpath="//input[@id='email']";
	private String messagexpath="//textarea[@id='message']";
	private String buttonXpath="//button[@id='submit-btn']";
	
	//PopupXpaths
	private String popUpXapth="//a[@href='https://practice-automation.com/popups/']";
	private String alertButton="//button[@onclick='alertPopup()']";
	private String confirmPopButton="//button[@onclick='confirmPopup()']";
	private String promptButton="//button[@onclick='promptPopup()']";
	private String returnHomexpath="//span//a[@href='https://practice-automation.com/']";
	
	//SliderXpath
	private String sliderPageXpathButton="//a[@href='https://practice-automation.com/slider/']";
	private String sliderXpath="//input[@id='slideMe']";
	
	//tableXpath
	private String tablesPageXapth="//a[@href='https://practice-automation.com/tables/']";
	private String rowsXpath="//figure[@class='wp-block-table']//table";
	
	//youtube tables xpaths
	private String naviPageY="//a[@href=\"https://demo.opencart.com/TlbeVW/\"]";
	private String usernameboxY="//input[@name=\"username\"]";
	private String passWordBox="//input[@name=\"username\"]";
	private String submitY="//button[@type=\"submit\"]";
	
	
	//Form Fields Methods
	public String formfields() {
		return formField;
	}
	
	
	public String nameXpath() {
		return nameXpath;
	} 
	
	public String passwordXpath() {
		return passwordXpath;
	}
	
	public String checkBoxesXpath() {
		return checkboxesxpath;
		
	}
	
	public String radioButtonXpath() {
		return radiobuttonxpath;
		
	}
	
	public String dropdownXpath() {
		return dropdownXpath;
	}
	
	public String cssSuedoXpath() {
		return cssSuedoXpath;
	}
	
	public String emailXpath() {
		return emailxpath;
	}
	
	public String messXpath() {
		return messagexpath;
	}
	
	public String buttonXpath() {
		return buttonXpath;
	}
	
	//Popups Methods
	
	public String popUPbutton() {
		return popUpXapth;
	}
	
	public String alertButton() {
		return alertButton;
	}
	
	public String confirmPopButton() {
		return confirmPopButton;
	}
	
	public String promptButton() {
		return promptButton;
	}
	
	public String returnHome() {
		return returnHomexpath;
	}
	
	
	
	//Slider Page Methods
	
	public String sliderpageXpath() {
		return sliderPageXpathButton;
	}
	
	public String slideXpath() {
		return sliderXpath;
	}
	
	//tables methods
	
	public String tablepageXpath() {
		return tablesPageXapth;
	}
	
	public String rowsXpath() {
		return rowsXpath;
	}
	
	//Youtubetables
	
	public String navString() {
		return naviPageY;
	} 
	
	public String usernameboxY() {
		return usernameboxY;
	}
	
	public String passwordBoxY() {
		return passWordBox;
	}
	
	public String submitY() {
		return submitY;
	}
	
	
	

}
