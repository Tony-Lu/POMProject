package com.w2a.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.w2a.pages.crm.accounts.AccountsPage;


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

	public AccountsPage goToAccounts() {

		Page.click("accountstab_XPATH");
		
		return new AccountsPage();
	}

	public void goToContacts() {

	}

	public void signOut() {

	}

}
