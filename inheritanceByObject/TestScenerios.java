package inheritanceByObject;

import org.junit.Test;

   // Here Two test Cases Created smokeSuite test  case n regressionSuite test case
   // Smoke Suite Test Case: In this Test Case we test basic test like we take example of car when we buy we check wheels , seats, doors , windows etc.
   // Regression Suite: In this text case we test smoke suit test cases + extra added test cases

public class TestScenerios extends TestCases
{
	@Test
	public void smokeSuite()
	{
		System.out.println("Test Suite : SMOKE");
		composeAndSendAnEmail();
		forwardAnEmail();
	}
	@Test
	public void regressionSuite()
	{
		System.out.println("Test Suite : REGRESSION");
		composeAndSendAnEmail();
		forwardAnEmail();
		replyToAnEmail();
		deleteAnEmail();
	}
}
