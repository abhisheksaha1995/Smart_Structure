package test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.Main;
import objects.Login2;
import utility.ReadProperty;

public class Login2Test {
	
	public static void LoginTest2() throws IOException {
		
		WebDriver driver = Main.d();
		driver.get(ReadProperty.value("baseurl"));
		
		Login2.emailBox(driver).sendKeys(ReadProperty.value("email"));
		Login2.passwordBox(driver).sendKeys(ReadProperty.value("password"));
		Login2.submitButton(driver).click();
		WebDriverWait wait=new WebDriverWait(driver, 30);
	}
	public static void validLogin() {
		
	}
	
	
	
 public static void main(String[] args) {
	 try {
		LoginTest2();
	 } catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	 }
}

}
