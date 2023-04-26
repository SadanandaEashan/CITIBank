package OpenBankAccount;

import org.testng.annotations.Test;

import Annotations.Base_class;

public class CurrentAccount extends Base_class
{
	@Test(groups= {"smoke","regression"})
	public void currentAcc()
	{
		System.out.println(" will get current");
	}	
}
