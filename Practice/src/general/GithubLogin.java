package general;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GithubLogin {
	WebDriver gt;
	String bpath="https://github.com/login";
	
  @Test
  public void TC_001() {
	  
	  gt.findElement(By.xpath("//input[@id='login_field']")).sendKeys("Shibaranjan");
	  gt.findElement(By.xpath("//input[@id='password']")).sendKeys("Sibu@Bpd11111");
	  gt.findElement(By.xpath("//input[@name='commit']")).click();
	  gt.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	  Assert.assertEquals(gt.getTitle(), "GitHub");
	  
	  
	  
  }
  @BeforeMethod
  public void open(){
	  gt=new ChromeDriver();
	  gt.get(bpath);
  }
  @AfterMethod
  public void close() {
	  gt.close();
  }
}
