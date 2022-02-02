package main;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pom.CalculatorMainPage;
import utility.Utility;

public class Start extends ClassProperties {

	public static void main(String[] args) throws IOException, InterruptedException {
		prepare();
		checkSummationOperation();
		checkSubtractionOperation();
		checkMultiblicationOperation();
		checkDivisionOperation();
		checkModulasOperation();
		TearDown();
	}

	@BeforeTest
	public static void prepare() throws IOException {
		// TODO start apllication with appium
		driver = baseCapabilities("AppName");
		Utility.captureScreenshot(driver, "startApp");// take screenshot for app when start

		mainPage = new CalculatorMainPage(driver);
	}

	@Test(priority = 1)
	public static void checkSummationOperation() throws InterruptedException {
		mainPage.number3.click();
		mainPage.add.click();
		mainPage.number5.click();
		mainPage.equal.click();
		Assert.assertEquals(mainPage.result.getText().toString(), "8");
		result=mainPage.result.getText().toString();
		Utility.captureScreenshot(driver, "verifySummation");// take screenshot after summation operation
		mainPage.clear.click();
	}
	@Test(priority = 2)
	public static void checkSubtractionOperation() throws InterruptedException {
		mainPage.number8.click();
		mainPage.minus.click();
		mainPage.number2.click();
		mainPage.equal.click();
		Assert.assertEquals(mainPage.result.getText().toString(), "6");
		result=mainPage.result.getText().toString();
		Utility.captureScreenshot(driver, "verifySubtraction");// take screenshot after subtraction operation
		mainPage.clear.click();
	}
	@Test(priority = 3)
	public static void checkMultiblicationOperation() throws InterruptedException {
		mainPage.number6.click();
		mainPage.multi.click();
		mainPage.number8.click();
		mainPage.equal.click();
		Assert.assertEquals(mainPage.result.getText().toString(), "48");
		result=mainPage.result.getText().toString();
		Utility.captureScreenshot(driver, "verifyMultipication");// take screenshot after multiplication operation
		mainPage.clear.click();
	}
	@Test(priority = 4)
	public static void checkDivisionOperation() throws InterruptedException {
		mainPage.number4.click();
		mainPage.number8.click();
		mainPage.divide.click();
		mainPage.number1.click();
		mainPage.number2.click();
		mainPage.equal.click();
		Assert.assertEquals(mainPage.result.getText().toString(), "4");
		result=mainPage.result.getText().toString();
		Utility.captureScreenshot(driver, "verifyDivision");// take screenshot after division operation
		mainPage.clear.click();
	}
	@Test(priority = 5)
	public static void checkModulasOperation() throws InterruptedException {
		mainPage.number4.click();
		mainPage.mod.click();
		mainPage.number4.click();
		mainPage.equal.click();
		Assert.assertEquals(mainPage.result.getText().toString(), "0");
		result=mainPage.result.getText().toString();
		Utility.captureScreenshot(driver, "verifyModulas");// take screenshot after modulas operation
		mainPage.clear.click();
	}
	@AfterClass
	public static void TearDown() {
		driver.quit();
	}

}
