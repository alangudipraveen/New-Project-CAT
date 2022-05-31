package org.BaseClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
       public static WebDriver driver;
	public static  void getDriver() {                                          
		WebDriverManager.chromedriver().setup();
		 driver= new ChromeDriver();
	}
	
	public static  void geturl(String url) {                                 
		driver.get(url);
	}
	
	public static void close() {
		driver.close();

	}
	public static void click(WebElement element) {                                     
		element.click();
	}
    public static  void type(WebElement element,String text) {            
        element.sendKeys(text);
    }
    public static WebElement findLocatorById(String attributevalue) {                  
             WebElement element =driver.findElement(By.id(attributevalue));
	          return element;
	}
	public static WebElement findLocatorName(String attributevalue) {                  
		WebElement element = driver.findElement(By.name(attributevalue));
		return element;
	}
	public static WebElement findLocatorClassName(String attributevalue) {            
	WebElement element = driver.findElement(By.className(attributevalue));
	return element;
	}
	public static WebElement findLocatorXpath(String xpath) {                        
		WebElement element = driver.findElement(By.xpath(xpath));
		return element;
	}
	public static void maximize() {                                                   
		driver.manage().window().maximize();
	}
	public static void implicitWait(int no) {                                                 
        driver.manage().timeouts().implicitlyWait(no,TimeUnit.SECONDS);
	}
	
	public static String getTitle() {                                               
		String title = driver.getTitle();
		return title;
	} 
	public static void selectByText(WebElement element,String text) {                   
		Select s= new Select(element);
		s.selectByVisibleText(text);
	}
	public static WebElement getFirstSelectedOption(WebElement element) {                            
    	Select select = new Select(element);
    	WebElement options = select.getFirstSelectedOption();
		return options;
 }
	
}
