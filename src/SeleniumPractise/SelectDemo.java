package SeleniumPractise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Abhirema\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dropdown");
		WebElement we=driver.findElement(By.xpath("//*[contains(@id,\"dropdown\")]"));
		Select s=new Select(we);
		List<WebElement> lt=s.getOptions();
		for(WebElement w:lt)
		{
			System.out.println(w.getText());
		}
		s.selectByVisibleText("Option 1");
//		s.selectByIndex("Option 1");

	}

}
