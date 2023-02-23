package selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	public static WebDriver driver=null;
	static String currentProjDir=System.getProperty("user.dir");
	static Properties p=new Properties();
	
	public static void init() {		
		try {
			FileInputStream fis=new FileInputStream(currentProjDir+"\\src\\test\\resources\\data.properties");
			p.load(fis);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	public static void BrowserLaunch(String browser) {			
		switch(p.getProperty(browser)) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
			driver=new ChromeDriver();
		
		case "firefox":			
		case "ie":
		}		
	}
		
	public static void UrlLaunch(String url) {
		driver.get(p.getProperty(url));
	}
}
