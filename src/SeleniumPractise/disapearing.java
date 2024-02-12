package SeleniumPractise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class disapearing {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhirema\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/disappearing_elements");
		try
		{
			WebDriverWait et=new WebDriverWait(driver, Duration.ofSeconds(20)) ;
			et.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),\"Contact\")]")));
		}catch(Throwable t)
		{
			System.out.println("Error while waiting for the notification to appear: "+t.getMessage());
		}

	}

}
