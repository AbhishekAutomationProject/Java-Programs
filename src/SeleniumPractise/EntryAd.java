package SeleniumPractise;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EntryAd {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abhirema\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebElement elementa;
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/entry_ad");
//		Alert alt=driver.switchTo().alert();
//		alt.accept();
		WebDriverWait wt = new WebDriverWait(driver,Duration.ofSeconds(20));
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Close']")));
		WebElement element = driver.findElement(By.xpath("//*[text()='Close']"));
		element.click();

	}

}
