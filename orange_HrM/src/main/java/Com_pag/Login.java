package Com_pag;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Login extends base_pag {
	
	static By user =By.xpath("//input[@name='username']");
	static By passwd = By.xpath("//input[@name='password']");
	static By login = By.xpath("//button[text()=' Login ']");
	
	
	//WebElement
	public static WebElement User()
	{
		return driver.findElement(user);		
	}
	
	public static WebElement passwD() 
	{
		return driver.findElement(passwd);		
	}
	public static WebElement LogiN()
	{
		return driver.findElement(login);
	}
	
	//action
	public static void useR()
	{
		User().sendKeys("Admin");
	}
	
	public static void PasswD()
	{
		passwD().sendKeys("admin123");
	}
	
	public static void loginClick()
	{
		LogiN().click();
		driver.switchTo().alert().accept();
		
	}

}
