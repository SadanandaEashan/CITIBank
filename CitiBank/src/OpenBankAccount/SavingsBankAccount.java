package OpenBankAccount;

import org.testng.annotations.Test;

import Annotations.Base_class;

public class SavingsBankAccount extends Base_class
{
	@Test(groups= {"smoke","regression"})
	public void savings()
	{
		System.out.println("can save money");
	}
}
