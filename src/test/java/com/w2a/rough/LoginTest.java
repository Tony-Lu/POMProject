package com.w2a.rough;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.w2a.base.Page;
import com.w2a.pages.HomePage;
import com.w2a.pages.LoginPage;
import com.w2a.pages.ZohoAppPage;

public class LoginTest {
	
	

	public static void main(String[] args) throws InterruptedException {

		
		HomePage home = new HomePage();
		home.goToLogin();
		LoginPage login = new LoginPage();	
		login.doLogin("tony.lucanada@gmail.com", "zohoAccount123");
		
		ZohoAppPage zp = new ZohoAppPage();
		zp.goToCRM();
		
		Page.menu.goToAccounts();

		
		Thread.sleep(2000);
		
		Page.driver.close();
		Page.driver.quit();
		Page.driver = null;
		
		
	}

}
