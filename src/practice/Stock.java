package practice;

import org.openqa.selenium.WebDriver;


public class Stock {
	
	public static void main(String[] args) {
		
		String projectLocation = System.getProperty("user.dir");
		
		System.setProperty("webdriver.chrome.driver", projectLocation + "\\lib\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new org.openqa.selenium.chrome.ChromeDriver();
		
		driver.get("https://finance.yahoo.com/screener/predefined/most_actives?offset=0&count=50");
		
		//wait
		Thread.sleep(5000);
		
		driver.close();
		
	}

}
