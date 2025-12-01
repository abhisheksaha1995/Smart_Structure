package test;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.Main;
import objects.Login;
import utility.ReadProperty;

public class LoginTest {
    static WebDriver driver;

    static {
        try {
            driver = Main.d();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
static WebDriverWait wait;
    @BeforeTest(groups = {"smoke"})
    public static void launch() throws IOException {
        driver.get(ReadProperty.value("baseurl"));
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver,Duration.ofSeconds(30));
    }

    @Test(priority = 1)
    public void invalidLogin() throws IOException {
        Login.emailBox(driver).sendKeys(ReadProperty.value("invalid.email"));
        Login.passwordBox(driver).sendKeys(ReadProperty.value("password"));
        Login.submitButton(driver).click();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[contains(@class,'swal2-confirm')]")));
        Assert.assertEquals(Login.errorMsg(driver).getText(),"No user found");
    }

    @Test(priority = 2)
    public void emptyLogin() {
        driver.navigate().refresh();
        if (!(Login.submitButton(driver).isEnabled())) {
            System.out.println("Button is sisabled if both email and pwd empty");
        }
    }

    @Test(priority = 1,groups = {"smoke"})
    public static void validLogin() throws IOException {
        Login.emailBox(driver).sendKeys(ReadProperty.value("valid.email"));
        Login.passwordBox(driver).sendKeys(ReadProperty.value("password"));
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

	@AfterSuite
	public void closeAll() {
		driver.quit();
	}
}
