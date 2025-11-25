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
    
    public static WebElement click_Addname (WebDriver driver) {
    	return driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div[2]/main/div/div/div/div[2]/div[1]/div[2]/a/div"));
    	
    			
    	
    }
    
     public static WebElement Enter_categoryname (WebDriver driver) {
    	 return driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div[2]/main/div/div/div/div[2]/div[1]/div[2]/a/div"));
    	 
    	 
     }
     
     public static WebElement Select_Categorytype (WebDriver driver) {
    	 return driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div[2]/main/div/div/div/div[2]/form/div/div[4]/div"));
    	 
     }
     public static WebElement UploadImage (WebDriver driver) {
    	 return driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div[2]/main/div/div/div/div[2]/form/div/div[6]/div/div/input"));
    	 
    	 	
     }
     
     public static WebElement Submit (WebDriver driver) {
    	 return driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div[2]/main/div/div/div/div[2]/form/div/div[7]/button"));
    	 
     }
     
     
     
    
    
    
}
