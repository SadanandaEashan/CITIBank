package OpenBankAccount;

import org.testng.annotations.Test;

import Annotations.Base_class;

public class ZeroBalance extends Base_class
{
	@Test(groups= {"system","regression"})
	public void ZeroolderPeople()
	{
		System.out.println("zero balance no job");
	}
	@Test(groups= {"smoke","regression"})
	public void ZeroforStudents()
	{
		System.out.println("searching for job");
	}
}
