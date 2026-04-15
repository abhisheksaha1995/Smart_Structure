package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import static objects.AddNewCategory.*;

public class AddNewCategoryTest {

    @BeforeClass
    public static void login() throws IOException {
        LoginTest.launch();
        LoginTest.validLogin();
    }

    @Test(priority = 1, groups = {"smoke"})
    public static void add() {
        LoginTest.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        prodCat(LoginTest.driver).click();
        getCat(LoginTest.driver).click();
        addNew(LoginTest.driver).click();
        catName(LoginTest.driver).sendKeys("ABC");
        catType(LoginTest.driver).click();
        LoginTest.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        Actions action = new Actions(LoginTest.driver);
        action.keyDown(Keys.ARROW_DOWN)
                .keyDown(Keys.ENTER)
                .build().perform();
        LoginTest.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
//        catImg(lt.driver).click();
        catImg(LoginTest.driver).sendKeys(new File("src/test/resources/Acc_Brand.jpg").getAbsolutePath());
    }
}
