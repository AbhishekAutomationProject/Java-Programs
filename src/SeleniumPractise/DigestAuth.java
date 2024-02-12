package SeleniumPractise;

import org.openqa.selenium.Alert;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DigestAuth {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhirema\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		String userName="admin";
		String password="admin";
		String url="https://"+userName+":"+password+"@"+"the-internet.herokuapp.com/digest_auth";
		driver.get(url);
		
	}

}
