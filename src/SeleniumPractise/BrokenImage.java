package SeleniumPractise;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenImage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhirema\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		int invalidImageCount = 0;
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/broken_images");
		List<WebElement> imagesList = driver.findElements(By.tagName("img"));
		System.out.println("Total no. of images are " + imagesList.size());
		for (WebElement imgElement : imagesList) {
			if(imgElement.getAttribute("naturalWidth").equals("0")) {
				invalidImageCount++;
			}
			}
		System.out.println("Broken Images "+invalidImageCount);
		}
	}
		