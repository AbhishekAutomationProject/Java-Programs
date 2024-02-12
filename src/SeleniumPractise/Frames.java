package SeleniumPractise;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Frames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhirema\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		List<WebElement> fElements=driver.findElements(By.tagName("frame"));
		System.out.println("Size is:"+fElements.size());
		driver.switchTo().frame(1);
		String valueString=driver.findElement(By.tagName("body")).getText();
		System.out.println(valueString);
		driver.switchTo().parentFrame();
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-left");
		String valueString1=driver.findElement(By.tagName("body")).getText();
		System.out.println(valueString1);
		
         
         
         
	}

}
