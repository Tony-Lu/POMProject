package com.w2a.pages.crm.accounts;

import org.openqa.selenium.By;

import com.w2a.base.Page;

public class AccountsPage extends Page {
	
	public CreateAccountPage goToCreateAccounts() {

		driver.findElement(By.cssSelector("lyte-button#submenu_Accounts>button.lyte-button.lytePrimaryBtn")).click();
		
		return new CreateAccountPage();
//		menu.signOut();
	}

	public void goToImportAccounts() {

		
	}

}
