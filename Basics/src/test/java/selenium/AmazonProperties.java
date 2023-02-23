package selenium;

public class AmazonProperties extends BaseTest {
	public static void main(String[] args) {
		init();
		BrowserLaunch("chromebrowser");
		UrlLaunch("amazonurl");
	}

}
