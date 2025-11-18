package test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import base.Main;
import objects.Login;
import utility.ReadProperty;

public class LoginTest{
	WebDriver driver;
	
	@BeforeSuite
	public void launch() throws IOException {
		
		WebDriver driver = Main.d();
		driver.get(ReadProperty.value("baseurl"));
	}

	@Test
	public void validLogin() throws IOException {
		Login lg = new Login(driver);
		lg.setEmail(ReadProperty.value("email"));
		lg.setPassword(ReadProperty.value("password"));
		lg.clickButton();

	}
	@Test
	public void emptyLogin() {
		Login lg = new Login(driver);
		lg.clickButton();

	}
	
	@AfterSuite
	public void closeAll() {
		driver.quit();
	}
}
