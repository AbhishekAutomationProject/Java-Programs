package SeleniumPractise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhirema\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/challenging_dom");
        WebElement we = driver.findElement(By.xpath("//*[text()='Lorem']"));
        String value=we.getText();
        System.out.println(value);
        WebElement we1 = driver.findElement(By.xpath("//td[contains(text(),'Iuvaret0')]"));
        String value1=we1.getText();
        System.out.println(value1);
        WebElement we2 = driver.findElement(By.xpath("(//*[text()='Iuvaret0' or text()='Apeirian0'])"));
        String value2=we1.getText();
        System.out.println(value2);
        WebElement we3 = driver.findElement(By.xpath("(//*[text()='Iuvaret0' and text()='Iuvaret0'])"));
        String value3=we1.getText();
        System.out.println(value3);
        List<WebElement> we4 = driver.findElements(By.xpath("//*[starts-with(text(),'e')]"));
        for(WebElement ew:we4)
        {
        String value4=ew.getText();
        System.out.println(value4);
        }
        List<WebElement> we5 = driver.findElements(By.xpath("//*[text()='Iuvaret0']//following::tr[1]"));
        for(WebElement ew:we5)
        {
        String value4=ew.getText();
        System.out.println(value4);
        }
        WebElement he1 = driver.findElement(By.xpath("//*[@class='button success']//ancestor::a"));
        String value5=he1.getText();
        System.out.println(value1);
        WebElement he2 = driver.findElement(By.xpath("//*[@class='button success']//ancestor::a"));
        String value6=he2.getText();
        System.out.println(value6);
        WebElement he3 = driver.findElement(By.xpath("//*[@class=\"large-2 columns\"]//child::a[1]"));
        String value7=he3.getText();
        System.out.println(value7);
        WebElement he4 = driver.findElement(By.xpath("//*[@class=\"large-2 columns\"]//preceding::a[2]"));
        String value8=he4.getText();
        System.out.println(value8);
        WebElement he5 = driver.findElement(By.xpath("//*[@class=\"large-2 columns\"]//following-sibling::a[2]"));
        String value9=he5.getText();
        System.out.println(value9);
        WebElement he6 = driver.findElement(By.xpath("//*[@class=\"large-2 columns\"]//parent::div/div[1]"));
        String value10=he6.getText();
        System.out.println(value10);
        
        
        
        
//        List<WebElement> lt=driver.findElements(By.tagName("td"));
//        for(WebElement we1:lt)
//        {
//        	System.out.println(we1.getText());
//        }
        
        
	}

} 
