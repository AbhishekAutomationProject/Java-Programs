package SeleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhirema\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		WebElement wb = driver.findElement(By.xpath("//input[@type='checkbox']"));
		if(wb.isSelected()==false)
		{
			System.out.println("Element is not selected");
			wb.click();
		}
		else
		{
			System.out.println("Element is selected");
		}
		wb.click();
		if(wb.isDisplayed())
		{
			System.out.println("Checkbox is displayed");
		}
		if(wb.isEnabled())
		{
			System.out.println("Checkbox is Enabled");
		}
	}

}
