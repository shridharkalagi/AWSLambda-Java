package com.blackboard.testing.lambda;

import com.amazonaws.services.lambda.invoke.LambdaFunction;

public interface LambdaSeleniumService {
    @LambdaFunction(functionName = "lambda-selenium-function1")
    TestResult runTest(TestRequest testRequest);
}
