package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.Main;
import org.openqa.selenium.WebElement;

public class Login extends Main{

	private static WebElement element = null;

	public static WebElement emailBox(WebDriver driver) {
		return driver.findElement(By.name("email"));
	}

	public static WebElement passwordBox(WebDriver driver) {
		return driver.findElement(By.name("password"));
	}

	public static WebElement submitButton(WebDriver driver) {
		return driver.findElement(By.xpath("//button[@type='submit']"));
	}
}