package SeleniumPractise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FormLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abhirema\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/login");
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));
		WebElement element1 = driver.findElement(By.xpath("//input[@name='username']"));
		element1.sendKeys("tomsmith");
		WebElement element2 = driver.findElement(By.xpath("//input[@name='password']"));
		element2.sendKeys("SuperSecretPassword!");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		

	}

}
