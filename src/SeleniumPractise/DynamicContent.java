package SeleniumPractise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicContent {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abhirema\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebElement elementa;
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_content?with_content=static");
		WebDriverWait wt=new WebDriverWait(driver,Duration.ofSeconds(20));
//		wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@src=\"/img/avatars/Original-Facebook-Geek-Profile-Avatar-5.jpg\"]")));
             while(driver.findElement(By.xpath("//img[@src=\"/img/avatars/Original-Facebook-Geek-Profile-Avatar-5.jpg\"]")).isDisplayed()==false);
             {
            	 driver.navigate().refresh();
            	 
             }
             System.out.println("Test Case is completed");
	}

	}