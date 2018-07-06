package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Stock {
	
	public static void main(String[] args) throws Exception {
		
		String projectLocation = System.getProperty("user.dir");
		
		System.setProperty("webdriver.chrome.driver", projectLocation + "\\lib\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new org.openqa.selenium.chrome.ChromeDriver();
		
		driver.get("https://finance.yahoo.com/screener/predefined/most_actives?offset=0&count=50");
		
		//wait
		Thread.sleep(3000);
		
		System.out.println(driver.getTitle());
		
		String xpath = "//*[@id=\"scr-res-table\"]/table/tbody/tr[*]";  
		
				
		List<WebElement> tableRows = driver.findElements(By.xpath(xpath));
		
		for(int i = 0; i <= 50; i++) {
			
			System.out.println((i + 1) + " - " + tableRows.get(i).getText());
		}		
				
		driver.close();
		
	}

}
