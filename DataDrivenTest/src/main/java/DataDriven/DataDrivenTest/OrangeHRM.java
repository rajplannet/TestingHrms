package DataDriven.DataDrivenTest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class OrangeHRM {
     
	@Test
	public void Ologinpage() throws IOException{
	
		for(User user:ExcelUtil.getUserList()){
			
			WebDriver driver = new FirefoxDriver();
			driver.get("http://opensource.demo.orangehrm.com/");
		driver.findElement(By.id("txtUsername")).sendKeys(user.getUserName());
		driver.findElement(By.id("txtPassword")).sendKeys(user.getPassword());
		driver.findElement(By.id("btnLogin")).click();
		}
		
//		driver.findElement(By.id("txtUsername")).sendKeys(ExcelUtil.getUserList().get(1).getUserName());
//		driver.findElement(By.id("txtPassword")).sendKeys(ExcelUtil.getUserList().get(1).getPassword());
//		driver.findElement(By.id("btnLogin")).click();
		
	}
}
