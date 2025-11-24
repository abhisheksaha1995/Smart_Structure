package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import static objects.AddNewCategory.*;

public class addNewCategoryTest {
    static LoginTest lt = new LoginTest();

    @BeforeClass
    public static void login() throws IOException {
        lt.launch();
        lt.validLogin();
    }

    @Test
    public static void add() {
        lt.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        prodCat(lt.driver).click();
        getCat(lt.driver).click();
        addNew(lt.driver).click();
        catName(lt.driver).sendKeys("ABC");
        catType(lt.driver).click();
        lt.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        Actions action = new Actions(lt.driver);
        action.keyDown(Keys.ARROW_DOWN)
                .keyDown(Keys.ENTER)
                .build().perform();
        catImg(lt.driver).sendKeys(new File("src/test/resources/test.jpg").getAbsolutePath());
    }
}
