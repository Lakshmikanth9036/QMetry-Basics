package com.qmetry.qaf.example.test;

import org.testng.annotations.Test;

import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebElement;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.example.pages.HomePage;

public class ExtendsWebDriverTestCase extends WebDriverTestCase{

//	@Test
	public void test1() {
		getDriver().get("http://adactinhotelapp.com/");
        QAFWebElement username = new QAFExtendedWebElement("login.username.txt");
        username.sendKeys("kanth123");
        QAFWebElement password = new QAFExtendedWebElement("login.password.txt");
        password.sendKeys("kanth123");
        QAFWebElement loginBtn = new QAFExtendedWebElement("login.submit.btn");
        loginBtn.click();
	}
	
	@Test
	public void test2() {
		HomePage homePage = new HomePage();
		homePage.lauchPage();
		homePage.getUsernameTxtFiled().sendKeys("kanth123");
		homePage.getPasswordTxtField().sendKeys("kanth123");
		homePage.getLoginBtn().click();
	}
}
