package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=null;
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		//ChromeDriver chrome=new ChromeDriver();
		 driver=new ChromeDriver();
		
		WebDriverManager.firefoxdriver().setup();
		System.setProperty("webdriver.gecko.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		//FirefoxDriver fire=new FirefoxDriver();
		 driver=new FirefoxDriver();

	}

}
