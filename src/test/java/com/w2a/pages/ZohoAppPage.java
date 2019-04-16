package com.w2a.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.w2a.base.Page;
import com.w2a.pages.crm.CRMHomePage;

public class ZohoAppPage extends Page {
	
	
	public void toToCliq() {
		
		driver.findElement(By.cssSelector(".zicon-apps-chat.zicon-apps-96")).click();

	}

	public CRMHomePage goToCRM() {

		driver.findElement(By.cssSelector(".zicon-apps-crm.zicon-apps-96")).click();
		
		return new CRMHomePage();
	}

	public void goToSalesIQ() {
		
		driver.findElement(By.cssSelector(".zicon-apps-salesiq.zicon-apps-96")).click();

	}

}
