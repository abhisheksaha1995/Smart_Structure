package test;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.Main;
import objects.Login;
import utility.ReadProperty;

public class LoginTest{
	WebDriver driver=Main.d();
	Login lg = new Login(driver);
	
	@BeforeTest
	public void launch() throws IOException {
		driver.get(ReadProperty.value("baseurl"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
	}

	@Test(priority = 1)
	public void invalidLogin()throws IOException {
		lg.setEmail(ReadProperty.value("email"));
		lg.setPassword(ReadProperty.value("password"));
		lg.clickButton();

	}
	@Test(priority = 2)
	public void emptyLogin() {
		driver.navigate().refresh();
		
			if (lg.checkEnabled()) {
				lg.clickButton();
			}
			else System.out.println("unable to click since button is disabled");
			
		}

	@Test (priority =3)
	public void validLogin()throws IOException {
		lg.setEmail(ReadProperty.value("validEmail"));
		lg.setPassword(ReadProperty.value("validPassword"));
		lg.clickButton();
		//driver.navigate().back();

	}
	
	@Test(priority = 2)
	public void onlyEmail() throws IOException {
		driver.navigate().refresh();
		lg.setEmail(ReadProperty.value("validEmail"));
			if (lg.checkEnabled()) {
				lg.clickButton();
			}
			else System.out.println("unable to click since button is disabled");
			
		}

//	@AfterSuite
//	public void closeAll() {
//		driver.quit();
//	}
}
