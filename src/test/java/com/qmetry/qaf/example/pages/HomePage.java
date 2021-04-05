package com.qmetry.qaf.example.pages;

import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class HomePage extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "login.username.txt")
	private QAFWebElement usernameTxtFiled;

	@FindBy(locator = "login.password.txt")
	private QAFWebElement passwordTxtField;

	@FindBy(locator = "login.submit.btn")
	private QAFWebElement loginBtn;
	
	@Override
	protected void openPage(PageLocator locator, Object... args) {
		driver.get("http://adactinhotelapp.com/");
	}
	
	public void lauchPage(){
		driver.get("http://adactinhotelapp.com/");
	}

	public QAFWebElement getUsernameTxtFiled() {
		return usernameTxtFiled;
	}

	public QAFWebElement getPasswordTxtField() {
		return passwordTxtField;
	}

	public QAFWebElement getLoginBtn() {
		return loginBtn;
	}

}
