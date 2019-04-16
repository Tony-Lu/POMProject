package com.w2a.testcases;

import org.testng.annotations.Test;

import com.w2a.pages.HomePage;
import com.w2a.pages.LoginPage;
import com.w2a.pages.ZohoAppPage;


public class LoginTest extends BaseTest {
	
	
	@Test
	public void loginTest() {
		
		HomePage home = new HomePage();
		LoginPage login =home.goToLogin();			
		ZohoAppPage zp = login.doLogin("tony.lucanada@gmail.com", "zohoAccount123");		
		
		
	}
	

}
