package general;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Login1 {

	public static void main(String[] args){
		WebDriver ob=new ChromeDriver();
		ob.get("http://apps.qaplanet.in/qahrm/login.php");
		ob.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		ob.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
		ob.findElement(By.name("txtPassword")).sendKeys("lab1");
		ob.findElement(By.name("Submit")).click();
		if(ob.getTitle().equals("OrangeHRM")) {
		System.out.println("TC_001 pass");
		}
		else {
			System.out.println("TC_001 fail");
		}
		
			
		}
		
		

	}
	