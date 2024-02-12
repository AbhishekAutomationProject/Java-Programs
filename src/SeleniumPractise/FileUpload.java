package SeleniumPractise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileUpload {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abhirema\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id='file-upload']")));
		WebElement element=driver.findElement(By.cssSelector("input[type=submit]"));
		element.sendKeys("C:\\Users\\Abhirema\\Downloads\\v7oxxvm1ps_Zoom (1).pkg");
		WebDriverWait wait1=new WebDriverWait(driver, Duration.ofSeconds(120));
		wait1.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id='file-submit']")));
		WebElement element2 = driver.findElement(By.xpath("//*[@id='file-submit']"));
		element2.click();

	}

}
