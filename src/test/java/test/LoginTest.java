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

	@Test
	public void invalidLogin()throws IOException {
		lg.setEmail(ReadProperty.value("email"));
		lg.setPassword(ReadProperty.value("password"));
		lg.clickButton();

	}
	@Test
	public void emptyLogin() {
		driver.navigate().refresh();
		try {
			if (lg.checkEnabled()) {
				lg.clickButton();
			}
			else System.out.println("unable to click since button is disabled");
			} catch(Exception e){
				System.out.println("Button disabled");
			}
		}

	@AfterSuite
	public void closeAll() {
		driver.quit();
	}
}
