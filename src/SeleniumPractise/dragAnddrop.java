package SeleniumPractise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dragAnddrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhirema\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		String url="https://the-internet.herokuapp.com/drag_and_drop";
		driver.get(url);
		try
		{
			WebDriverWait wt=new WebDriverWait(driver,Duration.ofSeconds(20));
			wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("\"//*[contains(@id,\\\"column-a\\\")]\"")));
		}catch(Throwable t)
		{
			System.out.println("Test has been failed"+t.getMessage());
		}
		
		WebElement elementFrom = driver.findElement(By.xpath("//*[contains(@id,\"column-a\")]"));
		WebElement elementTo = driver.findElement(By.xpath("//*[contains(@id,\"column-b\")]"));
		Actions act= new Actions(driver);
		act.dragAndDrop(elementFrom,elementTo).build().perform();
	}

}
