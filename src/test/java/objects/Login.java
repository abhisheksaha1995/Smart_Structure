package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.Main;

public class Login extends Main{
	
	WebDriver driver;
	
	public Login(WebDriver driver) {
		this.driver = driver;
	}
	
//	mention locators here
	
	By emailBox = By.name("email");
	By passwordBox = By.name("password");
	By submitButton = By.xpath("//button[@type='submit']");
	


	// mention actions here
	public void setEmail(String email) {
		driver.findElement(emailBox).sendKeys(email);
	}
	public void setPassword(String password) {
		driver.findElement(passwordBox).sendKeys(password);
	}
	public void clickButton() {
		driver.findElement(submitButton).click();;
	}

}