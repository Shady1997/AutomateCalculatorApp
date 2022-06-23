package test_cases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.PageBase;

public class CheckMainOperations extends TestBase {

	@Test(priority = 1, groups = "smoke", description = "checkSummationOperation on Calculator")
	public static void checkSummationOperation() throws InterruptedException {
		mainPage.number3.click();
		mainPage.add.click();
		mainPage.number5.click();
		mainPage.equal.click();
		Assert.assertEquals(mainPage.result.getText().toString(), "8");
		result = mainPage.result.getText().toString();
		PageBase.captureScreenshot(driver, "verifySummation");// take screenshot after summation operation
		mainPage.clear.click();
	}

	@Test(priority = 2, groups = "smoke", description = "checkSubtractionOperation on Calculator")
	public static void checkSubtractionOperation() throws InterruptedException {
		mainPage.number8.click();
		mainPage.minus.click();
		mainPage.number2.click();
		mainPage.equal.click();
		Assert.assertEquals(mainPage.result.getText().toString(), "6");
		result = mainPage.result.getText().toString();
		PageBase.captureScreenshot(driver, "verifySubtraction");// take screenshot after subtraction operation
		mainPage.clear.click();
	}

	@Test(priority = 3, groups = "smoke", description = "checkMultiblicationOperation on Calculator")
	public static void checkMultiblicationOperation() throws InterruptedException {
		mainPage.number6.click();
		mainPage.multi.click();
		mainPage.number8.click();
		mainPage.equal.click();
		Assert.assertEquals(mainPage.result.getText().toString(), "48");
		result = mainPage.result.getText().toString();
		PageBase.captureScreenshot(driver, "verifyMultipication");// take screenshot after multiplication operation
		mainPage.clear.click();
	}

	@Test(priority = 4, groups = "smoke", description = "checkDivisionOperation on Calculator")
	public static void checkDivisionOperation() throws InterruptedException {
		mainPage.number4.click();
		mainPage.number8.click();
		mainPage.divide.click();
		mainPage.number1.click();
		mainPage.number2.click();
		mainPage.equal.click();
		Assert.assertEquals(mainPage.result.getText().toString(), "4");
		result = mainPage.result.getText().toString();
		PageBase.captureScreenshot(driver, "verifyDivision");// take screenshot after division operation
		mainPage.clear.click();
	}

	@Test(priority = 5, groups = "smoke", description = "checkModulasOperation on Calculator")
	public static void checkModulasOperation() throws InterruptedException {
		mainPage.number4.click();
		mainPage.mod.click();
		mainPage.number4.click();
		mainPage.equal.click();
		Assert.assertEquals(mainPage.result.getText().toString(), "0");
		result = mainPage.result.getText().toString();
		PageBase.captureScreenshot(driver, "verifyModulas");// take screenshot after modulas operation
		mainPage.clear.click();
	}
}
