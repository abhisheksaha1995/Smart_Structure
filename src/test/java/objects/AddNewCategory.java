package objects;

import base.Main;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddNewCategory extends Main {
   

     
    public static WebElement prod_cat(WebDriver driver) {
        return driver.findElement(By.xpath("//span[@class='menu-title' and contains(text(), 'Products')]"));
        
        	
    }
    public static WebElement click_cat(WebDriver driver) {
    	return driver.findElement(By.xpath("//*[@id=\"Products\"]/ul/li[1]/a"));
    	
    }
    
    
    
    
}
