package SeleniumPractise;

import java.time.Duration;

import javax.swing.plaf.basic.BasicSliderUI.ActionScroller;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RightClickandDoubleClick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abhirema\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement element=driver.findElement(By.xpath("//*[text()='right click me']"));
		Actions act=new Actions(driver);
		act.contextClick(element).build().perform();
		WebElement element2=driver.findElement(By.cssSelector(".context-menu-icon-copy"));
		element2.click();
		Alert altAlert=driver.switchTo().alert();
		altAlert.accept();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement element3=driver.findElement(By.xpath("//*[text()='Double-Click Me To See Alert']"));
		act.doubleClick(element3).build().perform();
		altAlert.accept();
		
		

	}

}
