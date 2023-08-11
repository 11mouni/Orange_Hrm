package StepDef;


import Com_pag.base_pag;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Cucum_Base_class {
	
	@Before
	public static void driver_call()
	{
		base_pag.openurl();
	}
	
	@After
	public static void driverClose()
	{
		base_pag.driverClose();
	}


}
