package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.Main;
import org.openqa.selenium.WebElement;

public class Login {

    public static WebElement emailBox(WebDriver driver) {
        return driver.findElement(By.name("email"));
    }

    public static WebElement passwordBox(WebDriver driver) {
        return driver.findElement(By.name("password"));
    }

    public static WebElement submitButton(WebDriver driver) {
        return driver.findElement(By.xpath("//button[@type='submit']"));
    }

    public static WebElement errorMsg(WebDriver driver) {
        return driver.findElement(By.id("swal2-html-container"));
    }

    public static WebElement infoButton(WebDriver driver){
        return driver.findElement(By.xpath("//button[contains(@class,'swal2-confirm')]"));
    }
}