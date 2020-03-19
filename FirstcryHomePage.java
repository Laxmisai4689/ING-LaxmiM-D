package com.ing.au.hackathon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.ing.au.hackathon.base.Base;
import com.ing.au.hackathon.utilities.WebDriver_Generic;

public class FirstcryHomePage extends Base {
	WebDriverWait wait;
	WebDriver driver;
	WebDriver_Generic webGeneric = new WebDriver_Generic();

	//@FindBy(how = How.CSS, using = "div.menu-container>ul>li:first-of-type>a")
	@FindBy(how = How.XPATH, using = "//li[@class='B14_42 allcat']/a[@href='/']")
	private WebElement allCategories;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'STORES & PLAYSCHOOLS')]")
	private WebElement stores_Playschools;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Playschools')]")
	private WebElement playschools_tab;

	@FindBy(how = How.XPATH, using = "//img[@src='https://oiplayschool.com/wp-content/themes/oiplay/img/hyderabad-center-thumb.png']")
	private WebElement hydrabad_map;

	@FindBy(how = How.XPATH, using = "//img[@src='https://oiplayschool.com/wp-content/themes/oiplay/img/bangalore-center-thumb.png']")
	private WebElement blr_map;

	public FirstcryHomePage(WebDriver driver) {
		// this.driver = driver;
		wait = new WebDriverWait(driver, 20);
		PageFactory.initElements(driver, FirstcryHomePage.class);
	}

	public void MouseOverOnAllCategories() {
		// WebElement allCategories=
		// driver.findElement(By.cssSelector("div.menu-container>ul>li:first-of-type>a"));
		try {
			System.out.println("Inside MouseOverOnAllCategories method---");
			WebDriver_Generic.Driver_wait(driver, 20);
			Actions actions = new Actions(driver);
			actions.moveToElement(allCategories).build().perform();
		} catch (Exception e) {
			System.out.println("Failed to mouseHover ");
			closeBrowser();
		}

	}

}
