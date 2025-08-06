package com.ui.listerners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import com.constants.Env;
import com.utility.JsonUtility;
import com.utility.PropertiesUtil;

public class MyRetryAnalyzer implements IRetryAnalyzer{
//    private static final int MAX_NUMBER_OF_ATTEMPT =Integer.parseInt(PropertiesUtil.readProperty(Env.QA, "MAX_NUMBER_OF_ATTEMPT"));
	  private static final int MAX_NUMBER_OF_ATTEMPT = JsonUtility.readJson(Env.QA).getMAX_NUMBER_OF_ATTEMPT();
    private static int current_attempt =1;
	@Override
	public boolean retry(ITestResult result) {
        if (current_attempt<=MAX_NUMBER_OF_ATTEMPT) {
        	current_attempt++;
        	return true;
        }
		return false;
	}

}
