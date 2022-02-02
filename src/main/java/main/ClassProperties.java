package main;

import java.io.FileInputStream;

import org.openqa.selenium.JavascriptExecutor;

import capabilities.Capabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pom.CalculatorMainPage;

public class ClassProperties extends Capabilities{
	// declare class properties
    static AndroidDriver<AndroidElement> driver;
	static CalculatorMainPage mainPage;
	protected static String result=null;
	FileInputStream readProperty;
	JavascriptExecutor js;
}
