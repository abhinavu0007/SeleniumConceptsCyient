package com.cyient.seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMLogin {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("menu_pim_viewMyDetails")).click();
		driver.findElement(By.id("btnSave")).click();
		driver.findElement(By.id("personal_txtOtherID")).sendKeys("abhi007");
		driver.findElement(By.id("btnSave")).click();
		
		driver.findElement(By.linkText("Emergency Contacts")).click();
		driver.findElement(By.id("btnAddContact")).click();
		driver.findElement(By.id("emgcontacts_name")).sendKeys("Abhishek");
		driver.findElement(By.id("emgcontacts_relationship")).sendKeys("Brother");
		driver.findElement(By.id("emgcontacts_mobilePhone")).sendKeys("9415956666");
		driver.findElement(By.id("btnSaveEContact")).click();
		

	}

}
