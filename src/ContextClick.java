import java.awt.Desktop.Action;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Abhirema\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/context_menu");
		WebElement wb = driver.findElement(By.xpath("//div[@id=\"hot-spot\"]"));
		Actions act= new Actions(driver);
		org.openqa.selenium.interactions.Action action=act.contextClick(wb).build();
		action.perform();
		Alert alt= driver.switchTo().alert();
		alt.accept();
	}

}
