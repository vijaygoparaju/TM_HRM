package com.qa.tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HRM_LOGIN {

	@Test
	public void Loginapplication()
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.testingmasters.com/hrm");
	}
}
