package StepDef;

import Com_pag.Constant;
import Com_pag.Login;
import Utility.Common_method;
import Utility.validation;
import io.cucumber.java.en.Given;

public class login_TC {

	@Given("I am in the home page")
	public void i_am_in_the_home_page() throws Exception {
		Common_method.currentUrl();
		validation.IsTrue(Common_method.currentUrl(), Constant.HomePageUrl, "Home page is not display"); 
	}

	@Given("Give User_Name")
	public void give_user_name() {
		Login.useR();
	}

	@Given("Give Passwd")
	public void give_passwd() {
		Login.PasswD();
	}

	@Given("ClickLogin")
	public void click_login() {
		Login.loginClick();
	
	//	validation.IsDsiplayed(Login.loginClick(), null);
		
	
	}



}
