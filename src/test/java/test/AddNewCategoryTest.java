package test;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import base.Main;
import objects.AddNewCategory;
import utility.ReadProperty;


public class AddNewCategoryTest {
    WebDriver driver;

    
    WebDriverWait wait;
    @BeforeSuite
    public void launch() throws IOException {
        driver.get(ReadProperty.value("baseurl"));
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver,Duration.ofSeconds(40));
    }
    @Test(priority = 1)
    public void login() throws IOException {
    	LoginTest lt = new LoginTest();
    	lt.validLogin();
    	
    }
    
    @Test(priority=2)
    public void get() {
    	AddNewCategory.prod_cat(driver).click();
    	AddNewCategory.click_cat(driver).click();
    	AddNewCategory.click_Addname(driver).click();
    	AddNewCategory.Enter_categoryname(driver).sendKeys("ABX");
    }
}

