package SeleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class horizontalSlider {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhirema\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/horizontal_slider");
	WebElement silderElement=driver.findElement(By.xpath("//input[@type=\"range\"]"));
	Actions actions=new Actions(driver);
	actions.clickAndHold(silderElement);
	actions.moveByOffset(20, 0);
	actions.release().build().perform();
//	
//	 Actions action= new Actions(driver);
//	    action.click(silderElement).build().perform();
//	   
//	    for (int i = 0; i < 10; i++) 
//	    {
//	        action.sendKeys(Keys.ARROW_LEFT).build().perform();
//	    }
//
	}

}
