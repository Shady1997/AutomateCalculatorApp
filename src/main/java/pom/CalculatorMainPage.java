package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CalculatorMainPage {

	public CalculatorMainPage(AppiumDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	// xpath to number from 0 : 9
	@AndroidFindBy(xpath = "//android.widget.Button[@index='18']")
	public WebElement number0;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@index='14']")
	public WebElement number1;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@index='15']")
	public WebElement number2;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@index='16']")
	public WebElement number3;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@index='10']")
	public WebElement number4;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@index='11']")
	public WebElement number5;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@index='12']")
	public WebElement number6;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@index='6']")
	public WebElement number7;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@index='7']")
	public WebElement number8;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@index='8']")
	public WebElement number9;
	
	
	
	//xpath to operations	
	@AndroidFindBy(xpath = "//android.widget.Button[@index='17']")
	public WebElement add;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@index='13']")
	public WebElement minus;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@index='9']")
	public WebElement multi;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@index='5']")
	public WebElement divide;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@index='4']")
	public WebElement mod;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@index='20']")
	public WebElement equal;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@index='19']")
	public WebElement dot;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@index='2']")
	public WebElement clear;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@index='1']")
	public WebElement result;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@index='0']")
	public WebElement tempResult;
	
	
	

}
