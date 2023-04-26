package Loans;

import org.testng.annotations.Test;

import Annotations.Base_class;

public class HomeLoans extends Base_class
{
	@Test(groups= {"smoke","regression"})
	public void homeconstruction()
	{
		System.out.println("to construct a house");
	}
	@Test(groups={"system","regression"})
	public void homeBuy()
	{
		System.out.println("to buy a house");
	}
	@Test(groups= {"system","regression"})
	public void homepledge()
	{
		System.out.println("pledge and get money");
	}
}
