package com.ing.au.hackathon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ing.au.hackathon.basepage.TestBase;

public class FirstcryHomePage extends TestBase {
	WebDriverWait wait;
	static WebDriver driver;
	 
	 @FindBy(how = How.CSS, using = "div.menu-container>ul>li:first-of-type>a")
	 static WebElement allCategories;
	 
	 @FindBy(how= How.XPATH, using = "//a[contains(text(),'STORES & PLAYSCHOOLS')]")
	 static WebElement stores_Playschools;
	 
	public FirstcryHomePage(WebDriver driver) {
		super(driver);
		// this.driver = driver;
		wait = new WebDriverWait(driver, 20);
		 PageFactory.initElements(driver, FirstcryHomePage.class);
	}
	public void MouseOverOnAllCategories(){
	//WebElement	allCategories= driver.findElement(By.cssSelector("div.menu-container>ul>li:first-of-type>a"));
	}
	
}
