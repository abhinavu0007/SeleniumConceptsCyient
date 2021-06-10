package com.cyient.seleniumbasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class OpenEmrLogin {

	public static void main(String[] args) {
		
   /* ChromeDriver driver = new ChromeDriver();
    driver.get(null);
    driver.get(null);
    driver.getTitle();
    driver.getCurrentUrl();*/
		
	/*	WebDriver driver = new ChromeDriver();
		driver.get("https://www.cyient.com/");
		String actualTitle = driver.getTitle()
		System.out.println(actualTitle);*/
		  
      
	//	WebDriver driver = new FirefoxDriver();
	//	driver.get("https://www.cyient.com/");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://demo.openemr.io/a/openemr/interface/login/login.php?site=default");
		driver.findElement(By.id("authUser")).sendKeys("admin");
		driver.findElement(By.id("clearPass")).sendKeys("pass");
		
		
		Select selectlanguage = new Select(driver.findElement(By.name("languageChoice")));
		selectlanguage.selectByVisibleText("English (Indian)");
		//driver.findElement(By.id()).click();
		driver.findElement(By.xpath("//button[@class= 'btn btn-login btn-lg']")).click();
		
		//String title = driver.getTitle(//input [@id="user-profile"]/div/div[5]/input);
		//System.out.println(title);
		
		// mousehover activity
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//span[Text()='Smith']"))).perform();
		
		driver.findElement(By.xpath("//li[text()='Logout']")).click();
		
	}

}
