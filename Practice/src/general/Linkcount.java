package general;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Linkcount {

	public static void main(String[] args) throws InterruptedException {
		WebDriver ob = new ChromeDriver();
		ob.get("https://www.facebook.com/");
		Thread.sleep(4000);
		List<WebElement> nl=ob.findElements(By.tagName("a"));
		
		System.out.println(nl.size());
		for(int i=0;i<=nl.size();i++)
		{
			
			System.out.println(nl.get(i).getText());
		}

	}

}
