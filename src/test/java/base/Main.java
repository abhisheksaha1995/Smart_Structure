package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.ReadProperty;

import java.io.IOException;

public class Main {

	
	public static WebDriver d() throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		switch (ReadProperty.value("browser")){
			case "chrome":
				WebDriverManager.chromedriver().setup();
				break;
			case "mozilla":
				WebDriverManager.firefoxdriver().setup();
				break;
			case "edge":
				WebDriverManager.edgedriver().setup();
				break;
		}

		return driver;

	}
}
