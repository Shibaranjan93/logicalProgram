package general;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Screenshot {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver ob=new ChromeDriver();
		ob.get("http://apps.qaplanet.in/qahrm/login.php");
		
		ob.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		ob.findElement(By.cssSelector("table:nth-child(2) tbody:nth-child(1) tr:nth-child(2) td:nth-child(2) > input.loginText")).sendKeys("qaplanet1");
		Thread.sleep(3000);
		
		ob.findElement(By.cssSelector("table:nth-child(2) tbody:nth-child(1) tr:nth-child(3) td:nth-child(2) > input.loginText")).sendKeys("lab1");
		Thread.sleep(3000);
		
		ob.findElement(By.cssSelector("table:nth-child(2) tbody:nth-child(1) tr:nth-child(4) td:nth-child(1) > input.button")).click();
		//ob.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(7000);
		
		//ob.findElement(By.xpath("//select[@id='loc_code']")).click();
		//ob.findElement(By.xpath("")).click();
		ob.switchTo().frame("rightMenu");
		Select s = new Select(ob.findElement(By.id("loc_code")));
		s.selectByIndex(1);
		/*if()
			System.out.println("fail");
		else
			System.out.println("pass");
		/*ob.findElement(By.xpath("//div[@class='actionbar']//input[1]")).click();
		ob.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//Exit from frame
		ob.switchTo().defaultContent();
		ob.switchTo().frame("rightMenu");
		Thread.sleep(3000);
		ob.findElement(By.xpath("//input[@class='backbutton']")).click();*/
		
		
		
		
	}

}
