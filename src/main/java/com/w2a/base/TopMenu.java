package com.w2a.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TopMenu {
	
	/* TopMenu isa Page ??
	 * 
	 * HomePage has a TopMenu
	 * 
	 * 
	 * 
	 */

	WebDriver driver;
	
	public TopMenu(WebDriver driver) {
		
		this.driver=driver;
	}
	
	public void goToHome() {

	}

	public void goToFeeds() {

	}

	public void goToAccounts() {

		driver.findElement(By.xpath("//div[@class='lyteMenuItems']//div[6]")).click();
	}

	public void goToContacts() {

	}

	public void signOut() {

	}

}
