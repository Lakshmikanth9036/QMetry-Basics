package com.qmetry.qaf.example.test;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import com.qmetry.qaf.automation.ws.WSTestCase;
import com.sun.jersey.api.client.ClientResponse.Status;

public class ExtendsWSTestCase extends WSTestCase{

	@Test(testName="Get Response Check")
	public void test1() {
		
		String resBody = "";
		
		resBody = getWebResource("http://dummy.restapiexample.com","/api/v1/employees").get(String.class);
		
		verifyThat("Response Status", getResponse().getStatus(), Matchers.equalTo(Status.OK));
		verifyThat("Response Status", resBody , Matchers.containsString("status"));

	}
}
