package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login2 {
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
	public static WebElement Okbutton(WebDriver driver) {
		return driver.findElement(By.xpath("//div[@class='swal2-actions']/button[1]"));
	}

}
