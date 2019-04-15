package com.w2a.pages.crm;

import org.openqa.selenium.By;

import com.w2a.base.Page;

public class CRMHomePage extends Page {

	public void verifyRefreshOpenTasks() {
		
		driver.findElement(By.cssSelector("a#datafetchdate_3926030000000204258>div#tb_small_loader>span#ld_init")).click();
		
	}
	
	public void verifyTextUser() {
		
		System.out.println(driver.findElement(By.cssSelector("#show-uName")).getText());
	}
}
