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
	WebDriver driver;

    {
        try {
            driver = Main.d();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @BeforeTest
	public void launch() throws IOException {
		driver.get(ReadProperty.value("baseurl"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
	}

	@Test(priority = 1)
	public void invalidLogin()throws IOException {
		Login.emailBox(driver).sendKeys(ReadProperty.value("invalid.email"));
		Login.passwordBox(driver).sendKeys(ReadProperty.value("invalid.password"));
		Login.submitButton(driver).click();
	}
	@Test(priority = 2)
	public void emptyLogin() {
		driver.navigate().refresh();
		
			if (!(Login.submitButton(driver).isEnabled())) {
				System.out.println("Button is sisabled if both email and pwd empty");
			}
		}

	@Test (priority =3)
	public void validLogin()throws IOException {
		Login.emailBox(driver).sendKeys(ReadProperty.value("valid.email"));
		Login.passwordBox(driver).sendKeys(ReadProperty.value("valid.password"));
		Login.submitButton(driver).click();

	}
	
	@Test(priority = 2)
	public void onlyEmail() throws IOException {
		driver.navigate().refresh();
		Login.emailBox(driver).sendKeys(ReadProperty.value("valid.email"));
		if (!(Login.submitButton(driver).isEnabled())) {
			System.out.println("Button is disabled even after entering email");
		}
		}

//	@AfterSuite
//	public void closeAll() {
//		driver.quit();
//	}
}
