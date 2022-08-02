package com.qa.testdemo;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class SimpleTestDemo extends BaseTest{
	
	@SuppressWarnings("deprecation")
	@Test(priority=1)
	public void verifySignInLinkTest() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if(driver.findElement(By.id("identifierId")).isDisplayed()) {
			System.out.println("Sign in is displayed");
		}else {
			System.out.println("Sign in is not displayed");
		}
	}

}
