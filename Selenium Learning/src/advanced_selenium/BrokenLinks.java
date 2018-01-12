package advanced_selenium;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrokenLinks {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.uk/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total number of links on the page are: "+links.size());
		for(int i=0;i<links.size();i++)
		{
			WebElement e = links.get(i);
			String url = e.getAttribute("href");
			verifyBrokenLink(url);
			
		}

	}
    public static void verifyBrokenLink(String linkurl){
    	
    	try {
			URL url = new URL(linkurl);
		HttpURLConnection httpconnect = (HttpURLConnection)url.openConnection();
		httpconnect.setConnectTimeout(3000);
		httpconnect.connect();
		if(httpconnect.getResponseCode()==200){
			System.out.println("The URL "+httpconnect.getResponseMessage());
		}
		if(httpconnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND){
			System.out.println("The url :"+linkurl +httpconnect.getResponseMessage()+HttpURLConnection.HTTP_NOT_FOUND);
		}
		} catch (Exception e) {
			
			
		}
    	
    }
}
