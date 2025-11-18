package objects;

import base.Main;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddNewCategory extends Main {
    WebDriver driver;

    public AddNewCategory(WebDriver driver){
        this.driver = driver;
    }

    By prod_cat = By.xpath("//span[@class='menu-title' and contains(text(), 'Products')]");
}
