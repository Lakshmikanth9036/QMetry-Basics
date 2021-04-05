package com.qmetry.qaf.example.test;

import org.testng.annotations.Test;

import static com.qmetry.qaf.automation.core.ConfigurationManager.getBundle;
import com.qmetry.qaf.automation.data.MetaData;
import com.qmetry.qaf.automation.testng.TestNGTestCase;

public class ExtendsTestNGTestCase extends TestNGTestCase {
	
    @MetaData("{'status':'InProgress', 'testCaseId':'TEST-1', 'issueId':'PRJ-112'}")
    @Test
    public void test1() {
    	System.out.println("Testing with TestNGTestCase");
    	System.out.println(getBundle().getString("env.baseurl"));
    }

}
