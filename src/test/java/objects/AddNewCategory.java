package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddNewCategory {

    public static WebElement prodCat(WebDriver driver) {
        return driver.findElement(By.xpath("//span[@class='menu-title' and contains(text(), 'Products')]"));
    }

    public static WebElement getCat(WebDriver driver) {
        return driver.findElement(By.linkText("categories"));
    }

    public static WebElement catName(WebDriver driver) {
        return driver.findElement(By.name("name"));
    }

    public static WebElement catType(WebDriver driver) {
        return driver.findElement(By.xpath("//*[contains(@class, 'select__indicators')]"));
    }

    public static WebElement catImg(WebDriver driver) {
        return driver.findElement(By.xpath("//div[@class='add-category-button']"));
    }

    public static WebElement catBtn(WebDriver driver) {
        return driver.findElement(By.xpath("//button[contains(text(), 'Submit')]"));
    }
}
