package main;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pom.CalculatorMainPage;
import utility.Utility;

public class Start extends ClassProperties {

	@BeforeTest
	public static void prepare() throws IOException {
		// TODO start apllication with appium
		driver = baseCapabilities("AppName");
		Utility.captureScreenshot(driver, "startApp");// take screenshot for app when start

		mainPage = new CalculatorMainPage(driver);
	}

	@Test(priority = 1)
	public static void checkSummationOperation() {
		mainPage.number3.click();
		mainPage.add.click();
		mainPage.number5.click();
		mainPage.equal.click();
		Assert.assertEquals(mainPage.result.getText().toString(), "8");
		System.out.println(mainPage.result.getText().toString());
		Utility.captureScreenshot(driver, "verifySummation");// take screenshot after summation operation
	}

	@AfterClass
	public static void TearDown() {
		driver.quit();
	}

}
