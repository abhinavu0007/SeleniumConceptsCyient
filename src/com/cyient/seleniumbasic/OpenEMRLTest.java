package com.cyient.seleniumbasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class OpenEMRLTest {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://demo.openemr.io/openemr/interface/login/login.php?site=default");
		driver.findElement(By.id("authUser")).sendKeys("admin");
		driver.findElement(By.id("clearPass")).sendKeys("pass");
		Select sel = new Select(driver.findElement(By.name("languageChoice")));
		sel.selectByVisibleText("English (Indian)");
	    driver.findElement(By.xpath("//button[@class='btn btn-login btn-lg']")).click();
		// action = new Actions(driver);
	    //Thread.sleep(10000);
	    driver.findElement(By.xpath("//div[@class='menuLabel dropdown-toggle oe-dropdown-toggle']")).click();
		Thread.sleep(1000);
	    driver.findElement(By.xpath("//div[@class='menuLabel']")).click();
	    Thread.sleep(2000);
	    
	   driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='fin']")));
	   driver.findElement(By.id("create_patient_btn1")).click();

	}

}
